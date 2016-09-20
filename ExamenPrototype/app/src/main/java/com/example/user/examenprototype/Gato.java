package com.example.user.examenprototype;

/**
 * Created by user on 10/09/2016.
 */
public class Gato implements Clonable{
    private String raza;
    private String color;
    private float peso;

    public Gato(){
        this.raza="";
        this.color="";
        this.peso=0.0f;
    }
    public Gato(String raza,String color, float peso){
        this.raza=raza;
        this.color=color;
        this.peso=peso;
      }
    @Override
    public Clonable clonar() {
        Gato clon=new Gato();
        clon.setRaza(raza);
        clon.setColor(color);
        clon.setPeso(peso);
        return clon;
    }

    public String getColor() {
        return color;
    }


    public float getPeso() {
        return peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


}
