package com.example.a301coloringlulay;

import android.util.Log;
import android.widget.CompoundButton;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.MotionEvent;

public class coloringController implements View.OnClickListener, View.OnTouchListener,
        SeekBar.OnSeekBarChangeListener{

    //model and view
    public coloringModel sharedModel;
    public coloringView sharedView;

    public coloringController(coloringView createdColoringView){  //ctor

        sharedView = createdColoringView;
        sharedModel = sharedView.getColoringModel();



    }

    @Override
    public void onClick(View button) {    //onclick method for "blow out" button.

    }



    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int)motionEvent.getX();
        int y = (int)motionEvent.getY();


        //tell the View that it needs to redraw itself
        //drawing.invalidate();



        return true;
    }
}
