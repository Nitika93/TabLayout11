package com.example.lenovo.customtablayout.Model;

import java.util.ArrayList;

/**
 * Created by Lenovo on 04-12-2017.
 */

public class CustomModel {

    String title, category;

    ArrayList<CustomModel> modellist;

    public ArrayList<CustomModel> getModellist() {
        return modellist;
    }
    public void setModellist(ArrayList<CustomModel> modellist) {
        this.modellist = modellist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CustomModel(String title, String category) {
        this.title = title;
        this.category = category;
    }

}