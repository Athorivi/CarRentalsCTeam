package com.Cteam.UsefullBeans;

import java.util.ArrayList;

public class CategoriesStaticClass {

    static private ArrayList<String> categories;

    public static ArrayList<String> getCategories() {
        return categories;
    }

    public static void setCategories(ArrayList<String> aCategories) {
        categories = aCategories;
    }

    public CategoriesStaticClass() {
    }

}
