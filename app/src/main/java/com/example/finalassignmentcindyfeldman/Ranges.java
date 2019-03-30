package com.example.finalassignmentcindyfeldman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Ranges extends AppCompatActivity {
    private Button range1= null;
    private Button range2= null;
    private Button range3= null;
    private Button range4= null;
    private Button range5= null;
    TextView range = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranges);
      range1 = findViewById(R.id.Range1);
      range2 = findViewById(R.id.Range2);
      range3 = findViewById(R.id.Range3);
      range4 = findViewById(R.id.Range4);
      range5 = findViewById(R.id.range5);
      range = findViewById(R.id.rTitle);

      range1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Random r = new Random();
              int i = r.nextInt((10 - 1)+1) + 1;
            Intent intent = new Intent(Ranges.this,com.example.finalassignmentcindyfeldman.InputGuess.class);
            startActivity(intent);
            intent.putExtra("Random",i);
            intent.putExtra("Range",range1.getText());

          }
      });

range2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Random r = new Random();
        int h = r.nextInt((25 - 1)+1) + 1;
        Intent intent = new Intent(Ranges.this,com.example.finalassignmentcindyfeldman.InputGuess.class);
        startActivity(intent);
        intent.putExtra("secondRandom",h);
        intent.putExtra("Range",range1.getText());
    }
});
range3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Random r = new Random();
        int l = r.nextInt((50-1)+1);
        Intent intent = new Intent(Ranges.this,com.example.finalassignmentcindyfeldman.InputGuess.class);
        startActivity(intent);
    }
});
range4.setEnabled(false);
range5.setEnabled(false);
    }
}
