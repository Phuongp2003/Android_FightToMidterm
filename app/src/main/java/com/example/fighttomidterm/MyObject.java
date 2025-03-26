package com.example.fighttomidterm;

public class MyObject {
    private String title;
    private String description;
    private int imageResId; // ID của ảnh trong drawable
    private int backgroundColor; // Màu nền

    public MyObject(String title, String description, int imageResId, int backgroundColor) {
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
        this.backgroundColor = backgroundColor;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }
}