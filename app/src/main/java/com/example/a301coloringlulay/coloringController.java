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







    public coloringController(coloringView createdColoringView, TextView viewName, SeekBar red,
                              SeekBar green, SeekBar blue){  //ctor

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
        int xx = (int)motionEvent.getX();
        int yy = (int)motionEvent.getY();

        if(sharedView.circle6.containsPoint(xx,yy)){
            sharedModel.textViewString = "Modify Circle 1";
        }
        else if (sharedView.circle5.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 2";
        }
        else if (sharedView.circle5.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 3";
        }
        else if (sharedView.circle5.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 4";
        }
        else if (sharedView.circle5.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 5";
        }
        else if (sharedView.circle5.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 6";
        }
        else { sharedModel.textViewString = "select circle";}









        //how do i redraw the textview???
        return true;
    }
}
