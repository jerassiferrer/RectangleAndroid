package com.mobileapps.jera.rectangleandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.View;
import android.graphics.Rect;

/**
 * Created by jera on 5/14/16.
 */
public class CustomView extends View {
    private Rect rectangle;
    private Paint paint;

    public CustomView(Context context) {
        super(context);

        int x = 50;
        int y= 100;
        int sideLenght =200;

        rectangle = new Rect(x,y,sideLenght,sideLenght);

        paint = new Paint();
        paint.setColor(Color.GREEN);

    }

    @Override
    protected  void onDraw (Canvas canvas){
        canvas.drawColor(Color.BLUE);
        canvas.drawRect(rectangle,paint);
    }
}
