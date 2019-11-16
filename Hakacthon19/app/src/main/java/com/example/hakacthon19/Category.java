package com.example.hakacthon19;

import android.graphics.drawable.Drawable;


public class Category {

    private String nombre;
    private String edad;
    private String nEstudios;

    public Category() {
        super();
    }

    public Category(String nombre, String edad, String nEstudios) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.nEstudios = nEstudios;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getnEstudios() {
        return nEstudios;
    }

    public void setnEstudios() {
        this.nEstudios = nEstudios;
    }


}