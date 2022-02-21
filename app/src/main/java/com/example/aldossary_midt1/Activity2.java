package com.example.aldossary_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    Integer[] imgs ={R.drawable.cub2, R.drawable.cute6, R.drawable.deer8, R.drawable.jir1};

    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final Button gotoMain = (Button) findViewById(R.id.mainBttnActiv2);

        gotoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, Main2.class));
            }
        });
    }
}