package com.androidunleased.playaudioappapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;


public class PlayAudioAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_audio_app);
        final TextView response = (TextView) findViewById(R.id.response);
        final MediaPlayer mp= MediaPlayer.create(PlayAudioAppActivity.this, R.raw.letsong1);
        final ToggleButton playStopButton = (ToggleButton) findViewById(R.id.playstop_btn);
        playStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playStopButton.isChecked()){
                    response.setText("Select Stop button to stop audio");
                    playStopButton.setBackgroundResource(R.drawable.stop);
                    mp.start();
                }else{
                    response.setText("Select Play button to play audio");
                    playStopButton.setBackgroundResource(R.drawable.play);
                    mp.pause();
                }}
        });
    }
}

