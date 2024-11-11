package org.example;

public abstract class Vehiculo {

    private String marca;
    private int velocidad;
    private int ruedas;

    public Vehiculo (){}

    public Vehiculo (String marca, int velocidad, int ruedas){
        this.marca = marca;
        this.velocidad = velocidad;
        this.ruedas = ruedas;

    }


    public abstract void acelerar ();


    public abstract void frenar ();


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

}
