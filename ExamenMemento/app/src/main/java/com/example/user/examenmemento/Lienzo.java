package com.example.user.examenmemento;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by user on 10/09/2016.
 */
public class Lienzo extends View {
    private Triangulo triangulo;

    public Lienzo(Context context, Triangulo triangulo){
        super(context);
        this.triangulo = triangulo;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (triangulo !=null){
            triangulo.dibujar(canvas, triangulo.getColor());
        }
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
}


examenPrototype