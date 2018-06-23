package com.example.jam68ty.foodbattle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {




    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        //more1按鈕連到優格戚風蛋糕
        Button more1 = (Button) view.findViewById(R.id.more1);
        more1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), menu_cake.class);
                //intent.putExtra("some","some data");
                startActivity(intent);
            }
        });

        ImageButton imagecake = (ImageButton) view.findViewById(R.id.imagecake);
        imagecake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), menu_cake.class);
                //intent.putExtra("some","some data");
                startActivity(intent);
            }
        });


        return view;



    }




}
