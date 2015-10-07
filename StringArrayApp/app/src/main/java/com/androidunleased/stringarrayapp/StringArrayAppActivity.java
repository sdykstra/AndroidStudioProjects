package com.androidunleased.stringarrayapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class StringArrayAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_array_app);
        TextView fruitsView =(TextView)findViewById(R.id.fruits_view);
        String[] fruitsArray = getResources().getStringArray(R.array.fruits);
        String str ="";
        for(int i=0; i<fruitsArray.length;i++){

            str+= fruitsArray[i]+"\n";
        }
        fruitsView.setText(str);
    }

}
