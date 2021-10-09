package com.example.socs_fund.models;

import android.widget.ImageView;

public class Model {
    private int imageIcon;
    private String title;

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Model(int imageIcon, String title) {
        this.imageIcon = imageIcon;
        this.title = title;

    }
}
