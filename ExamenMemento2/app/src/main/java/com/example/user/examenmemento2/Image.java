package com.example.user.examenmemento2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by user on 13/09/2016.
 */
public class Image {
    private int color;
    public Image(){}

    public void dibujar(Canvas canvas, int color){
        Paint paint= new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);

        Path path = new Path();

        float mitadX=canvas.getWidth()/2;
        float mitatY= canvas.getHeight()/2;

        /*canvas.drawRect(mitadX*0.8f, mitatY*0.3f,
                mitadX*1.8f, mitatY*0.8f, paint);*/
        path.moveTo(mitadX*1.0f,mitatY*1.0f);
        path.lineTo(mitadX*3.0f,mitatY*1.0f);
        path.lineTo(mitadX*4.0f,mitatY*3.0f);
        path.lineTo(mitadX*1.0f,mitatY*4.0f);

        path.close();
        canvas.drawPath(path, paint);


/*
        mitad = mitad - half;
       // path.moveTo(half*2f,half*0.2f);
        path.moveTo(mitad*0.3f,half*0.3f);
        path.lineTo(mitad*0.3f,half*0.7f);
        path.lineTo(mitad*0.9f,half*0.3f);
        path.lineTo(mitad*0.9f,half*0.7f);
*/
        //path.moveTo(mitad+half*0.5f, half*0.84f);
        // path.lineTo(mitad+half*1.5f, half*0.84f);
        // path.lineTo(mitad+half*0.68f, half*1.45f);
        //path.lineTo(mitad+half*1.0f, half*0.5f);
        //path.lineTo(mitad+half*1.32f, half*1.45f);
        // path.lineTo(mitad+half*0.5f, half*0.84f);


        /*path.moveTo(mitad+half*0.5f, half*0.84f);
        path.lineTo(mitad+half*1.5f, half*0.84f);
        path.lineTo(mitad+half*0.68f, half*1.45f);
        path.lineTo(mitad+half*1.0f, half*0.5f);
        path.lineTo(mitad+half*1.32f, half*1.45f);
        path.lineTo(mitad+half*0.5f, half*0.84f);
        path.lineTo(mitad+half*0.6f, half*0.9f);
        */
    }

    public Memento guardarMeme(){
        return new Memento(color);
    }
    public void restaurarMemento(Memento meme){
        color= meme.getColor();
    }
    public void setColor(int color){
        this.color=color;
    }
    public int getColor(){
        return color;
    }
}
