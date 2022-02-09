package com.example.a301coloringlulay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    coloringController sharedController;
    coloringModel sharedModel;
    SeekBar greenSeekBar = findViewById(R.id.redSeekBarxml);
    SeekBar redSeekBar = findViewById(R.id.redSeekBarxml);
    SeekBar blueSeekBar = findViewById(R.id.blueSeekBarxml);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coloringView sharedColoringView = findViewById(R.id.coloringView1); //the shared coloring View

        sharedController = new coloringController(sharedColoringView,);

        sharedModel = sharedColoringView.getColoringModel();

        //create a coloringController object to listen to my touch events
        //coloringController colControl = new coloringController(sharedColoringView);
        sharedColoringView.setOnTouchListener(sharedController); //is this correct? What do i attach the listener to.

        TextView circleTextDisplayed = findViewById(R.id.textView5);
        circleTextDisplayed.setText(sharedModel.textViewString);






    }
}