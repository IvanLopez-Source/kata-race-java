package org.example;

public class Camion extends Vehiculo {

    public Camion(String marca, int velocidad, int ruedas) {
        super(marca, velocidad, ruedas);
    }

    @Override
    public void acelerar() {
setVelocidad(getVelocidad() + 60);
System.out.println("El camion esta acelerando. Velocidad: " + getVelocidad() + " Km/h");
    }

    @Override
    public void frenar() {
setVelocidad(getVelocidad() - 10);
System.out.println("El camion esta frenando. Velocidad: " + getVelocidad() + " Km/h");
    }

}