package com.androidunleased.screenorientationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ScreenOrientationAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_orientation_app);
        if(getResources().getDisplayMetrics().widthPixels>getResources().getDisplayMetrics().heightPixels){
            Toast.makeText(this, "Screen switched to Landscape mode.", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Screen switched to Portrait mode.", Toast.LENGTH_SHORT).show();
        }
    }

}
