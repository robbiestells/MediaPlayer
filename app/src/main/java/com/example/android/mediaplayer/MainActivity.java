package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.background);
    }

    public void Play_Clicked(View view) {
        mediaPlayer.start();
    }

    public void Pause_Clicked(View view) {
        mediaPlayer.pause();
    }

    public void Other_Clicked(View view) {
        mediaPlayer.reset();
    }
}
