package com.example.jam68ty.foodbattle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {
    Context mContext;
    ChineseMenuFragment chineseMenuFragment;
    ArrayList<Menus> menusArrayList;

    public MyRecyclerViewAdapter(ChineseMenuFragment chineseMenuFragment, ArrayList<Menus> menusArrayList) {
        this.chineseMenuFragment = chineseMenuFragment;
        this.menusArrayList = menusArrayList;
    }

    @Override
    public MyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(chineseMenuFragment.getActivity().getBaseContext());
        View view = layoutInflater.inflate(R.layout.single_row, parent, false);
        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewHolder holder, int position) {
        holder.mMenuName.setText(menusArrayList.get(position).getMenuName());
        holder.mMenuCate.setText(menusArrayList.get(position).getMenuCate());
        holder.mMenuDegree.setText(menusArrayList.get(position).getMenuDegree());
        holder.mMenuAmount.setText(menusArrayList.get(position).getMenuAmount());

    }

    @Override
    public int getItemCount() {
        return menusArrayList.size();
    }
}
