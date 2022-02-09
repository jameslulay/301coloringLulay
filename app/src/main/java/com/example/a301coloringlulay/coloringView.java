package com.example.a301coloringlulay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class coloringView extends SurfaceView{

    private coloringModel sharedModel;

    public CustomCircle circle1;
    public CustomCircle circle2;
    public CustomCircle circle3;
    public CustomCircle circle4;
    public CustomCircle circle5;
    public CustomCircle circle6;



    public coloringModel getColoringModel(){
        return sharedModel;
    }

    public coloringView(Context context, AttributeSet attrs) {  //ctor
        super(context, attrs);
        setWillNotDraw(false);

        sharedModel = new coloringModel(); //model used by whole program


    }

    @Override
    public void onDraw(Canvas canvas){

        circle1 = new CustomCircle("circle1", Color.BLUE, 50,50,50);
        circle1.drawMe(canvas);

        circle2 = new CustomCircle("circle2",Color.RED,50,200,50);
        circle2.drawMe(canvas);

        circle3 = new CustomCircle("circle2",Color.RED,50,350,50);
        circle3.drawMe(canvas);

        circle4 = new CustomCircle("circle2",Color.YELLOW,250,50,50);
        circle4.drawMe(canvas);

        circle5 = new CustomCircle("circle2",Color.RED,250,200,50);
        circle5.drawMe(canvas);

        circle6 = new CustomCircle("circle2",Color.RED,250,350,50);
        circle6.drawMe(canvas);

    }
}
