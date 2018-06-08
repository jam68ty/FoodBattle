package com.example.jam68ty.foodbattle;

public class Menus {

    private String mname,category;

    public Menus(String mname, String category) {
        this.mname = mname;
        this.category = category;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
