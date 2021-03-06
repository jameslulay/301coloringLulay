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
 */

public class coloringView extends SurfaceView{

    private coloringModel sharedModel;

    public CustomCircle circle5,circle6;

    public CustomRect rect1,rect2,rect3,rect4,rect5,rect6;

    public coloringModel getColoringModel(){
        return sharedModel;
    }

    //ctor instantiates all the shapes that are to be drawn for the program

    public coloringView(Context context, AttributeSet attrs) {
        super(context, attrs);
        sharedModel = new coloringModel(); //instantiates model used by whole program



        circle5 = new CustomCircle("Back Wheel",Color.BLACK,600,600,50);
        circle6 = new CustomCircle("Front Wheel",Color.BLACK,1000,600,50);

        rect1 = new CustomRect("Bottom Car Body",Color.YELLOW,400,400,1200,550);
        rect2 = new CustomRect("Top Car Body",Color.YELLOW,550,300,1050,400);
        rect3 = new CustomRect("Window",Color.GRAY,930,320,1030,390);
        rect4 = new CustomRect("Sky",Color.BLUE,0,0,2000,360);
        rect5 = new CustomRect("Grass",Color.GREEN,0,360,2000,1000);
        rect6 = new CustomRect("Stripe",Color.WHITE,400,460,1200,500);

        //absolutely necessary, I forgot this and it wasted a lot of my time.
        //I forgot about that time you mentioned it in class...
        setWillNotDraw(false);
    }

    //calls the method that draws the objects
    @Override
    public void onDraw(Canvas canvas){

        rect5.drawMe(canvas);
        rect4.drawMe(canvas);
        circle5.drawMe(canvas);
        circle6.drawMe(canvas);
        rect1.drawMe(canvas);
        rect2.drawMe(canvas);
        rect3.drawMe(canvas);
        rect6.drawMe(canvas);
    }
}
