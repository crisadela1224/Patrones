package com.example.user.examensingleton;

/**
 * Created by user on 10/09/2016.
 */
public class Flor {
    private static Flor unicaInstancia;
    private String tipo;
    private String color;
    private Flor(){
        this.tipo="";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public static Flor getUnicaInstancia(){
        if (unicaInstancia==null){
            unicaInstancia=new Flor();
        }
        return unicaInstancia;
    }
}
