package com.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    public void toActivity3(View v) { startActivity(new Intent(this, Activity3.class)); }

    public void toActivity6(View v) {
        startActivity(new Intent(this, Activity6.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }
}