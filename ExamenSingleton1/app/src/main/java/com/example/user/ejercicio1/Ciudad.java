package com.example.user.ejercicio1;

/**
 * Created by user on 06/09/2016.
 */
public class Ciudad {
    private static Ciudad unicaInstancia;
    private String nombre;
    private  Ciudad(){
        this.nombre="";
    }
    public  void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;    }
    public static Ciudad getUnicaInstancia(){
        if (unicaInstancia==null){
            unicaInstancia= new Ciudad();
        }
        return  unicaInstancia;
    }
}
