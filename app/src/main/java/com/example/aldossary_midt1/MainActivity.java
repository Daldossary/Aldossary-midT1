package com.example.aldossary_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    /*
    Assumption for splash screen:
    - Full screen image = background image
    - Counter / Timer displayed shows EXACTLY amount of time left
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView counterText = (TextView) findViewById(R.id.counterText);
        final DecimalFormat dform = new DecimalFormat("#,###");


        //TIMER NOT DISPLAYING FIX IT
        for(int i=9000; i>=0; i--) {
            counterText.setText("Time Left: " + dform.format(i));
        }

        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(MainActivity.this, Main2.class));
            }
        };

        Timer open = new Timer();
        open.schedule(timer, 9000);

    }
}