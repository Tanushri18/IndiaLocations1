package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected boolean _active = true;
    protected int _splashTime = 2000;
    Handler handler;
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i3 = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(i3);
                finish();
            }

  //          private void finish() {
   //         }
        }, _splashTime);
    }

   // private void startActivity(Intent i3) {
   // }

//public class MainActivity extends AppCompatActivity {

  //  @Override
   // protected void onCreate(Bundle savedInstanceState) {
   //     super.onCreate(savedInstanceState);
   //     setContentView(R.layout.activity_main);
    }
