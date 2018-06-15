package com.example.jam68ty.foodbattle;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.SignInButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.facebook.FacebookSdk.getApplicationContext;


public class ChineseMenuFragment extends Fragment {

    FirebaseFirestore db;
    RecyclerView mRecyclerView;
    ArrayList<Menus> menusArrayList;
    MyRecyclerViewAdapter adapter;
    DatabaseReference mDatabaseRef;

    public ChineseMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chinese_menu, container, false);
        menusArrayList = new ArrayList<>();
        mRecyclerView = view.findViewById(R.id.mRecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        setUpFireBase();
        loadDataFormFirebase();
        return view;
    }

    private void loadDataFormFirebase() {
        if (menusArrayList.size() > 0)
            menusArrayList.clear();
        db.collection("menus")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        for (DocumentSnapshot querySnapshot : task.getResult()) {
                            Menus menus = new Menus(querySnapshot.getString("name"),
                                    querySnapshot.getString("cate"),
                                    querySnapshot.getString("degree"),
                                    querySnapshot.getString("amount"),
                                    querySnapshot.getString("image_link"));
                            menusArrayList.add(menus);
                        }
                        adapter = new MyRecyclerViewAdapter(ChineseMenuFragment.this, menusArrayList);
                        mRecyclerView.setAdapter(adapter);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getActivity(), "Problem ---1---", Toast.LENGTH_SHORT).show();
                        Log.w("---1---", e.getMessage());
                    }
                });
    }

    private void setUpFireBase() {
        db = FirebaseFirestore.getInstance();
    }

}
