package com.example.travelapp.Domains;

public class CategoryDomain {
    private String title, picPath;

//    Generate Constructor

    public CategoryDomain(String title, String picPath) {
        this.title = title;
        this.picPath = picPath;
    }

//    Generate Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
