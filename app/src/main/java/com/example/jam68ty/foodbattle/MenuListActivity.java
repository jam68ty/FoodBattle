package com.example.jam68ty.foodbattle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MenuListActivity extends AppCompatActivity {
    private ListView mListView;
    private MenusListAdapter adapter;
    private List<Menus> menusList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        mListView = findViewById(R.id.menu_list);
        menusList = new ArrayList<>();

        menusList.add(new Menus("鳳梨蝦仁", "中式料理"));
        menusList.add(new Menus("炒青菜", "中式料理"));
        menusList.add(new Menus("香煎雞腿排", "中式料理"));

        adapter = new MenusListAdapter(getApplicationContext(), menusList);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "現在還不能看喔ㄎㄎ" + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}