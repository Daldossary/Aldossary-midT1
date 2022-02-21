package com.example.aldossary_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2 extends AppCompatActivity {

    /*
    Assumptions for first main screen:
    - Song was reused as no audio could be found in time
    - ImageView for peacock image is stretched out of screen
      due to original picture's dimensions
     */

    int play = 0;
    MediaPlayer forestSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView peakImg = (ImageView) findViewById(R.id.peakImage);
        final TextView songStatus = (TextView) findViewById(R.id.statusSong);
        final Button activ2Bttn = (Button) findViewById(R.id.activity2Bttn);
        final Button activ3Bttn = (Button) findViewById(R.id.activity3Bttn);
        forestSong = new MediaPlayer();
        forestSong = MediaPlayer.create(this, R.raw.track2);

        peakImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(play) {
                    case 0:
                        forestSong.start();
                        play = 1;
                        songStatus.setText("Song Currently Playing");
                        break;
                    case 1:
                        forestSong.pause();
                        play = 0;
                        songStatus.setText("Song Currently Paused");
                        break;
                }
            }
        });

        activ2Bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2.this, Activity2.class));
            }
        });

        activ3Bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2.this, Activity3.class));
            }
        });
    }
}