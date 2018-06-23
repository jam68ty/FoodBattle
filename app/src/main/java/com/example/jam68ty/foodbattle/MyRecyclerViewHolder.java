package com.example.jam68ty.foodbattle;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
public TextView mMenuName,mMenuCate,mMenuDegree,mMenuAmount;
public ImageView mMenuImage;

    public MyRecyclerViewHolder(View itemView) {
        super(itemView);

        mMenuName=itemView.findViewById(R.id.mMenuName);
        mMenuCate=itemView.findViewById(R.id.mMenuCate);
        mMenuDegree=itemView.findViewById(R.id.mMenuDegree);
        mMenuAmount=itemView.findViewById(R.id.mMenuAmount);
        mMenuImage = itemView.findViewById(R.id.mMenuImage);

    }
}
