package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounter.R;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int scoreteama = 0;
    int scoreteamb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    private void display(int score){
        TextView quantityTextView = (TextView) findViewById(
                R.id.scoreteama);
        quantityTextView.setText("" + score);
    }
    private void displayb(int score){
        TextView quantityTextView = (TextView) findViewById(
                R.id.scoreteamb);
        quantityTextView.setText("" + score);
    }


    public void threepointer(View view) {
        scoreteama=scoreteama+3;
        display(scoreteama);


    }
    public void twopointer(View view) {
        scoreteama=scoreteama+2;
        display(scoreteama);

    }

    public void onepointer(View view) {
        scoreteama=scoreteama+1;
        display(scoreteama);
    }

    public void threepointerb(View view) {
        scoreteamb=scoreteamb+3;
        displayb(scoreteamb);


    }
    public void twopointerb(View view) {
        scoreteamb=scoreteamb+2;
        displayb(scoreteamb);

    }

    public void onepointerb(View view) {
        scoreteamb=scoreteamb+1;
        displayb(scoreteamb);
    }

    public void reset(View view) {
        scoreteamb=0;
        scoreteama=0;
        displayb(scoreteamb);
        display(scoreteama);
    }
}