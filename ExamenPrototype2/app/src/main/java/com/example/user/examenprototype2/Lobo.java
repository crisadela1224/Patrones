package com.example.user.examenprototype2;

/**
 * Created by user on 13/09/2016.
 */
public class Lobo implements Clonable {
    private String raza;
    private String habitat;
    private float peso;


    public Lobo(){
        this.raza="";
        this.habitat="";
        this.peso = 0.0f;
    }

    public Lobo(String raza, String habitat, float peso) {
        this.raza = raza;
        this.habitat = habitat;
        this.peso = peso;

    }

    @Override
    public Clonable  clonar() {
       Lobo clon = new Lobo();
        clon.setRaza(raza);
        clon.setHabitat(habitat);
        clon.setPeso(peso);
        return  clon;

    }

    public float getPeso() {
        return peso;
    }

    public String getRaza() {
        return raza;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
