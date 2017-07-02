package com.example.shweta.listview_floating_popup;

/**
 * Created by Shweta on 7/1/2017.
 */
public class ListType {
    int image;
    String title;
    public ListType(int image, String title){
        this.image=image;
        this.title=title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
