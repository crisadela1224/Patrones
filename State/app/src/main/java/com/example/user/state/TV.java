package com.example.user.state;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by user on 05/09/2016.
 */
public class TV  {
   private ControlRemoto estado;
    private Canvas canvas;

    public TV( ControlRemoto estado){
          this.estado= estado;
        }


    public ControlRemoto getEstado() {
        return estado;
    }

    public void setEstado(ControlRemoto estado) {
        this.estado = estado;
    }
    public void oprimirBoton(){
        estado.oprimirEncendido(this, canvas);
    }


    protected void onDraw(Canvas canvas) {
       this.canvas=canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
