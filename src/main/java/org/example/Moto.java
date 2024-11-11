package org.example;

public class Moto extends Vehiculo {


    public Moto(String marca, int velocidad, int ruedas) {
        super(marca, velocidad, ruedas);
    }

    @Override
    public void acelerar() {

        setVelocidad(getVelocidad() + 30);
        System.out.println("La moto está acelerando. Velocidadl: " + getVelocidad() + " km/h.");
    }

    @Override
    public void frenar() {

        setVelocidad(getVelocidad() - 10);
        System.out.println("La moto está frenando. Velocidad: " + getVelocidad() + " km/h.");
    }
}


