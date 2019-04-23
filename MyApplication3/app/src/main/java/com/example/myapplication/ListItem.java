package com.example.myapplication;

public class ListItem {

    String text;
    String imageName;
    boolean isSelected;

    public ListItem(String text, String imageName, boolean isSelected) {
        this.text = text;
        this.imageName = imageName;
        this.isSelected = isSelected;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
