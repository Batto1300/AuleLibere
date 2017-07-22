package com.example.harisont.aulelibere;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.xmlpull.v1.XmlPullParser;

/**
 * Created by harisont on 17/07/17.
 */

public class Floor extends Fragment {

    Room[] rooms;
    XmlPullParser parser;

    public Floor(Room[] rooms, XmlPullParser parser) { //R.layout.floorx
        this.rooms = rooms;
        this.parser = parser;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(this.parser, container, false);
        showCurrentSituation();
        return rootView;
    }

    public void showCurrentSituation() {
        for (int i=0; i<rooms.length; i++) {
            if (rooms[i].is_free)
                rooms[i].green_view.setVisibility(View.VISIBLE);
            else
                rooms[i].red_view.setVisibility(View.VISIBLE);
        }
    }

}