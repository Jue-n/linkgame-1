package com.plter.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class BackgroundMusic extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCompletion(MediaPlayer mp){
        mediaPlayer.start();
    }
}