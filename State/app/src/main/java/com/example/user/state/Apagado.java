package com.example.user.state;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by yoo on 05/09/2016.
 */
public class Apagado extends ControlRemoto {
    @Override
    public void oprimirEncendido(TV tv, Canvas canvas) {
      tv.setEstado(new Encendido());
        Paint paint= new Paint();
        paint.setStyle(Paint.Style.FILL);


        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;

        paint.setColor(Color.BLACK);
        canvas.drawRect(mitadX*0.20f, mitadY*0.4f, mitadX*1.3f, mitadY*1.6f, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawRect(mitadX*0.25f, mitadY*0.5f, mitadX*1.25f, mitadY*1.5f, paint);

    }
}
