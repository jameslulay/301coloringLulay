package com.example.a301coloringlulay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * <!-- class MainActivity-->
 * This class contains the main.
 *
 * @author James Lulay
 * @version 2/9/2022
 */

public class MainActivity extends AppCompatActivity {
    //stores the model and
    private coloringController sharedController;
    private coloringModel sharedModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declares variables and stores the textview and 3 seekbars.
        TextView circleSelectedTextView = findViewById(R.id.textView5);
        SeekBar redSeekBar = findViewById(R.id.redSeekBarxml);
        SeekBar greenSeekBar = findViewById(R.id.greenSeekBarxml);
        SeekBar blueSeekBar = findViewById(R.id.blueSeekBarxml);

        //the shared coloring View
        coloringView sharedColoringView = findViewById(R.id.coloringView1);

        //initializes a new Controller
        sharedController = new coloringController(sharedColoringView, circleSelectedTextView, redSeekBar,
                greenSeekBar,blueSeekBar);

        //obtains the shared model
        sharedModel = sharedColoringView.getColoringModel();

        //create a coloringController object to listen to my touch events
        sharedColoringView.setOnTouchListener(sharedController);

        //connects the TextView with a listener
        TextView elementTextDisplayed = findViewById(R.id.textView5);
        elementTextDisplayed.setText(sharedModel.textViewString);

        //sets listener for the seekbars
        redSeekBar.setOnSeekBarChangeListener(sharedController);
        greenSeekBar.setOnSeekBarChangeListener(sharedController);
        blueSeekBar.setOnSeekBarChangeListener(sharedController);

    }
}