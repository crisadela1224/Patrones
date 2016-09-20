package com.example.user.examenmemento2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by user on 13/09/2016.
 */
public class Lienzo extends View{
    private Image img;

    public Lienzo(Context context, Image img){
        super(context);
        this.img =img;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (img !=null){
            img.dibujar(canvas, img.getColor());
        }
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
