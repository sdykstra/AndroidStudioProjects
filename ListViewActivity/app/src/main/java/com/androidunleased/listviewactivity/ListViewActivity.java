package com.androidunleased.listviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;


public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        final String[] fruitsArray = getResources().getStringArray(R.array.fruits);
        final TextView selectedOpt = (TextView)findViewById(R.id.selectedopt);
        ListView fruitsList = (ListView)findViewById(R.id.fruits_list);
        fruitsList.setOnItemClickListener(new OnItemClickListener(){
           @Override
        public void onItemClick(AdapterView<?> parent, View v, int position, long id){
               selectedOpt.setText("You have selected "+ fruitsArray[position]);
           }
        });
    }

}
