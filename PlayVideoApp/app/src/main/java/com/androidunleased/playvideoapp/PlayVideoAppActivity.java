package com.androidunleased.playvideoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class PlayVideoAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video_app);
        Button playVideoButton = (Button) findViewById(R.id.playvideo);
        playVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView videoView =(VideoView) findViewById(R.id.video);
                videoView.setMediaController(new MediaController(PlayVideoAppActivity.this));
               // videoView.setVideoPath(sdcard/minions);
                videoView.requestFocus();
                videoView.start();
            }
        });
    }

}
