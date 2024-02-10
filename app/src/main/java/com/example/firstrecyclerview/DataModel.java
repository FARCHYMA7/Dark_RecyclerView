package com.example.firstrecyclerview;

public class DataModel {

    private String name;
    private String text;
    private int id_;
    private int image;

    public DataModel(String name, String text, int id_, int image) {
        this.name = name;
        this.text = text;
        this.id_ = id_;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId_() {
        return id_;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
