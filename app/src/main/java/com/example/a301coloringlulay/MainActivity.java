package com.example.a301coloringlulay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    coloringController sharedController;
    coloringModel sharedModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coloringView sharedView = findViewById(R.id.coloringView1); //the shared coloring View

        sharedController = new coloringController(sharedView);

        //create a coloringController object to listen to my touch events
        coloringController listener = new coloringController(sharedView);
        sharedView.setOnTouchListener(listener);





    }
}