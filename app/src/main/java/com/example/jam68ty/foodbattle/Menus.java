package com.example.jam68ty.foodbattle;

public class Menus {
    String menuName, menuCate, menuDegree, menuAmount;

    public Menus(String menuName, String menuCate, String menuDegree, String menuAmount) {
        this.menuName = menuName;
        this.menuCate = menuCate;
        this.menuDegree = menuDegree;
        this.menuAmount = menuAmount;
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
