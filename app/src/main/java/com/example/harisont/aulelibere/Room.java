package com.example.harisont.aulelibere;

import android.widget.ImageView;

/**
 * Created by harisont on 22/07/17.
 */

public class Room {
    int id;
    ImageView green_view;
    ImageView red_view;
    boolean is_free;

    public Room(int id, ImageView green_view, ImageView red_view) {
        this.id = id;
        this.green_view = green_view;
        this.red_view = red_view;
    }

}
