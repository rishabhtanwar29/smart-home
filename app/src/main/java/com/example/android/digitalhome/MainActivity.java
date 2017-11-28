package com.example.android.digitalhome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLightButtonClick(View v) {

       if(v.getId() == R.id.blight) {
           Intent i = new Intent(MainActivity.this, LightActivity.class);
           startActivity(i);
       }
    }
    public void onFanButtonClick(View v) {

        if(v.getId() == R.id.bfan) {
            Intent i = new Intent(MainActivity.this, FanActivity.class);
            startActivity(i);
        }
    }
}
