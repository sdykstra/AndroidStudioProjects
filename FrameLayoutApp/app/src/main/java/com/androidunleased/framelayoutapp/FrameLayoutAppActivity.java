package com.androidunleased.framelayoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class FrameLayoutAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_app);
        final ImageView first_image= (ImageView)this.findViewById(R.id.first_image);
        final ImageView second_image = (ImageView)this.findViewById(R.id.second_image);
        first_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_image.setVisibility(View.VISIBLE);
                v.setVisibility(View.GONE);
            }
        });
        second_image.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                first_image.setVisibility(View.VISIBLE);
                v.setVisibility(View.GONE);
            }
        });
    }

}
