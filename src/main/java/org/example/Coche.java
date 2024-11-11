package org.example;

public class Coche extends Vehiculo {


    public Coche(String marca, int velocidad, int ruedas) {
super(marca, velocidad, ruedas);
    }

    @Override
    public void acelerar() {
setVelocidad(getVelocidad() + 20);
System.out.println("El coche esta acelerando. Velocidad: " + getVelocidad() + " Km/h");
    }

    @Override
    public void frenar() {
setVelocidad(getVelocidad() - 20);
        System.out.println("El coche esta frenando. Velocidad: " + getVelocidad() + " Km/h");
    }


}


