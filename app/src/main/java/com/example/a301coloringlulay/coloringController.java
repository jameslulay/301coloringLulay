package com.example.a301coloringlulay;

import android.graphics.Color;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.MotionEvent;

/**
 * <!-- class coloringController-->
 * This class serves as the program's controller. Contains event handling methods
 * for the seekbar and the surfaceView touch events.
 *
 * @author James Lulay
 * @version 2/9/2022
 */

public class coloringController implements  View.OnTouchListener, SeekBar.OnSeekBarChangeListener{

    public coloringModel sharedModel;   //stores Model from ctor
    public coloringView sharedView;     //stores view from ctor

    private TextView circleTextBox;     //stores TextView from ctor

    private CustomCircle currentCirc;   //The current circle object selected

    //stores the temporary colors of the circle selected.
    public int currentColor,currentRed,currentBlue,currentGreen;

    //cont is short for controller. This stores the seekbars from the ctor
    public SeekBar redSeekCont,greenSeekCont,blueSeekCont;

    //constructor takes in these parameters and stores them as local variables.

    public coloringController(coloringView createdColoringView, TextView circleTextView,
                              SeekBar redSeek, SeekBar greenSeek, SeekBar blueSeek){

        sharedView = createdColoringView;
        sharedModel = sharedView.getColoringModel();
        circleTextBox = circleTextView; //The textView that represents current obj selected
        redSeekCont = redSeek;          //Red seekbar
        greenSeekCont = greenSeek;      //Green seekbar
        blueSeekCont = blueSeek;        //Blue seekbar

        currentCirc = sharedView.circle1; //upon booting up, it sets the current circle to circle 1
    }

    /**
     * This method responds to a seekbar being changed. It scans for the current seekbar
     * selected, then uses that value to update the corresponding rgb value for the circle.
     *
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        if(seekBar.getId() == R.id.redSeekBarxml){
            currentRed = seekBar.getProgress();
        }
        if(seekBar.getId() == R.id.greenSeekBarxml){
            currentGreen = seekBar.getProgress();
        }
        if(seekBar.getId() == R.id.blueSeekBarxml){
            currentBlue = seekBar.getProgress();
        }

        currentColor = Color.rgb(currentRed,currentGreen,currentBlue);
        //currentCirc.setColor(currentColor);

        currentColor = Color.rgb(currentRed,currentGreen,currentBlue);
        //currentCirc.setColor(currentColor);
        this.paintObject(X,Y);
        sharedView.invalidate();
    }

    //can ignore these two methods
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }


    /** The onTouch method determines what circle(or non at all) is selected. It then
     * updates the textViewString variable in the model so that the display in the textview
     * shows what object is selected. It then assigns the circle selected with the
     * local variable currentCirc, then it updates the seekbars to represent the color
     * of the circle.
     *
     */


    public void paintObject(int x, int y){
        if(sharedView.circle6.containsPoint(x,y) || sharedView.circle5.containsPoint(x,y)){
            sharedView.circle6.setColor(currentColor);
            sharedView.circle5.setColor(currentColor);}
            }

    int X;
    int Y;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int xx = (int)motionEvent.getX();
        int yy = (int)motionEvent.getY();
        X = xx;
        Y = yy;

        if(sharedView.circle6.containsPoint(xx,yy) || sharedView.circle5.containsPoint(xx,yy)){
            sharedModel.textViewString = "Modify Circle 6"; //accesses model,
            currentCirc = sharedView.circle6;
            this.setSeekBars();
        }
        /**
        else if (sharedView.circle4.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 4";
            currentCirc = sharedView.circle4;
            this.setSeekBars();
        }
        else if (sharedView.circle3.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 3";
            currentCirc = sharedView.circle3;
            this.setSeekBars();
        }
        else if (sharedView.circle2.containsPoint(xx, yy)) {
            sharedModel.textViewString = "Modify Circle 2";
            currentCirc = sharedView.circle2;
            this.setSeekBars();
        }
        else if (sharedView.circle1.containsPoint(xx, yy)){
            sharedModel.textViewString = "Modify Circle 1";
            currentCirc = sharedView.circle1;
            this.setSeekBars();}
         **/

        else ;



        return true;
    }

    private void setSeekBars(){
        //Gets the color of the circle selected
        currentColor = currentCirc.getColor();
        //stores that circle's colors in the current variables
        currentRed = Color.red(currentColor);
        currentGreen = Color.green(currentColor);
        currentBlue = Color.blue(currentColor);

        //sets the rgb seekbars to reflect current circle color
        redSeekCont.setProgress(currentRed);
        greenSeekCont.setProgress(currentGreen);
        blueSeekCont.setProgress(currentBlue);

        //sets the textView to represent the current circle
        circleTextBox.setText(sharedModel.textViewString);

        sharedView.invalidate();

    }

}