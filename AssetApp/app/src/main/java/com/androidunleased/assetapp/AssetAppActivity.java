package com.androidunleased.assetapp;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class AssetAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_app);
        TextView fileView=(TextView) findViewById(R.id.file_view);
        InputStream input;
        AssetManager assetManager= getAssets();
        try{
            input = assetManager.open("info.txt");
            int fileSize = input.available();
            byte[] buffer = new byte[fileSize];
            input.read(buffer);
            input.close();
            String textFrom = new String(buffer);
            fileView.setText(textFrom);

        }catch (IOException e){
            fileView.setText("Some exception has occurred");
        }
    }

}
