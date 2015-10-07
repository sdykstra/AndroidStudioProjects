package com.androidunleased.progressbar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.os.Handler;

public class ProgressBarActivity extends AppCompatActivity {
    MediaPlayer mp;
    ProgressBar progressBar;
    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        final TextView response = (TextView) this.findViewById(R.id.response);
        response.setText("Select Play button to play audio");
        progressBar = (ProgressBar)findViewById(R.id.progressbar);
        mp= MediaPlayer.create(ProgressBarActivity.this,R.raw.letsong1);
        final ToggleButton playStopButton = (ToggleButton)findViewById(R.id.playstop_btn);
        progressBar.setProgress(0);
        progressBar.setMax(mp.getDuration());

        playStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playStopButton.isChecked()){
                    response.setText("Select Stop button to stop audio");
                    playStopButton.setBackgroundResource(R.drawable.stop);
                    mp.start();
                    updateProgressBar();
                }else{
                    response.setText("Select Play button to play audio");
                    playStopButton.setBackgroundResource(R.drawable.play);
                    mp.pause();
                }
            }
        });
    }

    private void updateProgressBar(){
        progressBar.setProgress(mp.getCurrentPosition());
        if(mp.isPlaying()){
            Runnable notification = new Runnable() {
                @Override
                public void run() {
                    updateProgressBar();
                }
            };
        handler.postDelayed(notification,100);
        }
    }
}
