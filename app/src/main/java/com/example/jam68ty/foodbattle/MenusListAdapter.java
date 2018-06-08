package com.example.jam68ty.foodbattle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MenusListAdapter extends BaseAdapter {
private Context mContext;
private List<Menus> menusList;

    public MenusListAdapter(Context mContext, List<Menus> menusList) {
        this.mContext = mContext;
        this.menusList = menusList;
    }

    @Override
    public int getCount() {
        return menusList.size();
    }

    @Override
    public Object getItem(int i) {
        return menusList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext,R.layout.list_item,null);
        TextView name = v.findViewById(R.id.name_text);
        TextView category = v.findViewById(R.id.category_text);

        name.setText(menusList.get(i).getMname());
        category.setText(menusList.get(i).getCategory());
        return v;
    }
}

