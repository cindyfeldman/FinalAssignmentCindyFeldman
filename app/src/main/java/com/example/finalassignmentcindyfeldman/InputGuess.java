package com.example.finalassignmentcindyfeldman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class InputGuess extends AppCompatActivity {
Random num = null;
private Button ent = null;
private TextView range = null;
private TextView input = null;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_guess);
    input = findViewById(R.id.input);
     final String is = String.valueOf(input.getText());
        range = findViewById(R.id.rTitle);
        Intent i = getIntent();

      range.setText(i.getStringExtra("Range"));
        ent = findViewById(R.id.Enter);
        ent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputGuess.this,com.example.finalassignmentcindyfeldman.Results.class);

                intent.putExtra("input: ",is);
;                startActivity(intent);

            }
        });

    }
}
