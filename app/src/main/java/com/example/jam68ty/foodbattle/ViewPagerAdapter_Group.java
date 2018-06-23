package com.example.jam68ty.foodbattle;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter_Group extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] buy_cake = {R.drawable.cake_0,R.drawable.cake_10,R.drawable.cake_9};

    public ViewPagerAdapter_Group(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return buy_cake.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.show_group_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.buy_cake_info6_image);
        imageView.setImageResource(buy_cake[position]);


        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }


}
