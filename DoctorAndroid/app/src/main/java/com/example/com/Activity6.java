package com.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity6 extends AppCompatActivity {

    public void toActivity7(View v) { startActivity(new Intent(this, Activity7.class)); }

    public void toActivity8(View v) {
        startActivity(new Intent(this, Activity8.class));
    }

    public void toActivity9(View v) {
        startActivity(new Intent(this, Activity9.class));
    }

    public void toActivity5(View v) {
        startActivity(new Intent(this, Activity5.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
    }
}