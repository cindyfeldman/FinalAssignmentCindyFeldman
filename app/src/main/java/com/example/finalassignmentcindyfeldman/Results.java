package com.example.finalassignmentcindyfeldman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Results extends AppCompatActivity {
private TextView answer = null;
private TextView ra = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        answer = findViewById(R.id.ANSWER);
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
       int it = bundle.getInt("input");

        ra = findViewById(R.id.Yours);
        Random r = new Random();
        int h = r.nextInt((10 - 1)+1) + 1;
        answer.setText("answer : "+String.valueOf(h));

        ra.setText("Your answer: "+String.valueOf(it));


    }
}
