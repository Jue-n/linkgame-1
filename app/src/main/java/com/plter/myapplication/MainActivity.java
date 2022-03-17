package com.plter.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    //BackgroundMusic bm;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        sw =findViewById(R.id.switch1);
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.background);
        mediaPlayer.start();
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sw.isChecked()){
                    try {
                        mediaPlayer.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    mediaPlayer.start();
                }else{
                    if (mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                    }
                }


               // bm.onStart();
            }
        });
    }
}