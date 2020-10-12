package com.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    public void toActivity4(View v) {
        startActivity(new Intent(this, Activity4.class));
    }

    public void toMapsActivity(View v) {
        startActivity(new Intent(this, MapsActivity.class));
    }

    public void toActivity5(View v) {
        startActivity(new Intent(this, Activity5.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
}