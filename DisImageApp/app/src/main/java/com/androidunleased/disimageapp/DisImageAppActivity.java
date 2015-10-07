package com.androidunleased.disimageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class DisImageAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_image_app);
        ImageView image =(ImageView)findViewById(R.id.image_toview);
        image.setImageResource(R.drawable.fish_tank);
    }
}
