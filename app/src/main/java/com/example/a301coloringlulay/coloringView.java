package com.example.a301coloringlulay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * <!-- class coloringView -->
 * This serves as the View class. It creates the circle objects and
 * draws them.
 *
 * @author Andrew Nuxoll
 * @version Spring 2015
 */

public class coloringView extends SurfaceView{

    private coloringModel sharedModel;

    public CustomCircle circle1,circle2,circle3,circle4,circle5,circle6; //declares the circle objects

    public coloringModel getColoringModel(){
        return sharedModel;
    }

    public coloringView(Context context, AttributeSet attrs) {  //ctor
        super(context, attrs);
        sharedModel = new coloringModel(); //instantiates model used by whole program

        //creates 6 new circle objects

        /**
        circle1 = new CustomCircle("circle1", Color.BLUE, 50,50,50);
        circle2 = new CustomCircle("circle2",Color.BLUE,50,200,50);


        circle3 = new CustomCircle("circle3",Color.BLUE,50,350,50);
        circle4 = new CustomCircle("circle4",Color.BLUE,250,50,50);
         **/

        circle5 = new CustomCircle("circle5",Color.RED,600,600,50);
        circle6 = new CustomCircle("circle6",Color.RED,1000,600,50);

        //absolutely necessary, I forgot this and it wasted a lot of my time.
        //I forgot about that time you mentioned it in class...
        setWillNotDraw(false);
    }

    //calls the method that draws the circle objects
    @Override
    public void onDraw(Canvas canvas){
        /**
        circle1.drawMe(canvas);
        circle2.drawMe(canvas);
        circle3.drawMe(canvas);
        circle4.drawMe(canvas);
        **/
        circle5.drawMe(canvas);
        circle6.drawMe(canvas);
    }
}
