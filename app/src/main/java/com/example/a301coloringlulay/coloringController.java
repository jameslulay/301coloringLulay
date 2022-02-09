package com.example.a301coloringlulay;

import android.graphics.Color;
import android.util.Log;
import android.widget.CompoundButton;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.MotionEvent;

import org.w3c.dom.Text;


public class coloringController implements View.OnClickListener, View.OnTouchListener,
        SeekBar.OnSeekBarChangeListener{

    //model and view
    public coloringModel sharedModel;
    public coloringView sharedView;

    private TextView circleTextBox;
    private CustomCircle currentCirc;
    private int currentColor,currentRed,currentBlue,currentGreen;



    public SeekBar redSeekCont,greenSeekCont,blueSeekCont;








    public coloringController(coloringView createdColoringView, TextView circleTextView,
                              SeekBar redSeek, SeekBar greenSeek, SeekBar blueSeek){  //ctor

        sharedView = createdColoringView;
        sharedModel = sharedView.getColoringModel();
        circleTextBox = circleTextView;

    }

    @Override
    public void onClick(View button) {

    }



    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


        if(seekBar.getId() == R.id.redSeekBarxml){
            sharedModel.tempRedValue = i;
        }
        if(seekBar.getId() == R.id.greenSeekBarxml){
            sharedModel.tempGreenValue = i;
        }
        if(seekBar.getId() == R.id.blueSeekBarxml){
            sharedModel.tempBlueValue = i;
        }

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
            currentCirc = sharedView.circle6;
        }
        else if (sharedView.circle5.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 2";
            currentCirc = sharedView.circle5;
        }
        else if (sharedView.circle4.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 3";
            currentCirc = sharedView.circle4;
        }
        else if (sharedView.circle3.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 4";
            currentCirc = sharedView.circle3;
        }
        else if (sharedView.circle2.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 5";
            currentCirc = sharedView.circle2;
        }
        else if (sharedView.circle1.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 6";
            currentCirc = sharedView.circle1;
        }
        else { sharedModel.textViewString = "select circle";}

        //Updates seekbars to the current circle color;

        currentColor = currentCirc.getColor();
        currentRed = Color.red(currentColor);
        currentGreen = Color.green(currentColor);
        currentBlue = Color.blue(currentColor);
        redSeekCont.setProgress(currentRed);
        greenSeekCont.setProgress(currentGreen);
        blueSeekCont.setProgress(currentBlue);

        circleTextBox.setText(sharedModel.textViewString);
        return true;
    }
}
