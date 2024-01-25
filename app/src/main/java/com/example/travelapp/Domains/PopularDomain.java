package com.example.travelapp.Domains;

import java.io.Serializable;

public class PopularDomain implements Serializable {
    private String title, location, description, pic;
    private int bed, price;
    private boolean guide, wifi;
    private double score;


//    Generate Constructor
    public PopularDomain(String title, String location, String description, String pic, int bed, int price, boolean guide, boolean wifi, double score) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.pic = pic;
        this.bed = bed;
        this.price = price;
        this.guide = guide;
        this.wifi = wifi;
        this.score = score;
    }


//    Generate Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isGuide() {
        return guide;
    }

    public void setGuide(boolean guide) {
        this.guide = guide;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
