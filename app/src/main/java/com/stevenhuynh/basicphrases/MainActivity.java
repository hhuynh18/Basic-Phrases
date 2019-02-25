package com.stevenhuynh.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void playAudio(View view){

        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourseId = getResources().getIdentifier(ourId, "raw", "com.stevenhuynh.basicphrases");

        MediaPlayer mplayer = MediaPlayer.create(this, resourseId);
        mplayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
