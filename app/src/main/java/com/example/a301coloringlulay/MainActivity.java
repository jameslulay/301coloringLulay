package com.example.a301coloringlulay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    coloringController sharedController;
    coloringModel sharedModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView circleSelectedTextView = findViewById(R.id.textView5);
        SeekBar redSeekBar = findViewById(R.id.redSeekBarxml);
        SeekBar greenSeekBar = findViewById(R.id.redSeekBarxml);
        SeekBar blueSeekBar = findViewById(R.id.blueSeekBarxml);

        coloringView sharedColoringView = findViewById(R.id.coloringView1); //the shared coloring View

        sharedController = new coloringController(sharedColoringView, circleSelectedTextView, redSeekBar,
                greenSeekBar,blueSeekBar);

        sharedModel = sharedColoringView.getColoringModel();

        //create a coloringController object to listen to my touch events
        //coloringController colControl = new coloringController(sharedColoringView);
        sharedColoringView.setOnTouchListener(sharedController);

        TextView circleTextDisplayed = findViewById(R.id.textView5);
        circleTextDisplayed.setText(sharedModel.textViewString);

        redSeekBar.setOnSeekBarChangeListener(sharedController);
        redSeekBar.setProgress(sharedModel.tempRedValue);








    }
}