package com.example.jam68ty.foodbattle;

public class Menus {
    String menuName, menuCate, menuDegree, menuAmount,menuImage;

    public Menus(String menuName, String menuCate, String menuDegree, String menuAmount,String menuImage) {
        this.menuName = menuName;
        this.menuCate = menuCate;
        this.menuDegree = menuDegree;
        this.menuAmount = menuAmount;
        this.menuImage = menuImage;
    }

    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }

    public String getMenuDegree() {
        return menuDegree;
    }

    public void setMenuDegree(String menuDegree) {
        this.menuDegree = menuDegree;
    }

    public String getMenuAmount() {
        return menuAmount;
    }

    public void setMenuAmount(String menuAmount) {
        this.menuAmount = menuAmount;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCate() {
        return menuCate;
    }

    public void setMenuCate(String menuCate) {
        this.menuCate = menuCate;
    }
}
