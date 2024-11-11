package org.example;

public class Main {

    public static void main(String[] args) {

        Coche Coche = new Coche("Toyota", 100, 4);


        System.out.println("Marca: " + Coche.getMarca());
        System.out.println("Velocidad: " + Coche.getVelocidad() + " km/h");
        System.out.println("Número de ruedas: " + Coche.getRuedas());


        Coche.acelerar();
        Coche.frenar();

        Moto Moto = new Moto("Ducati", 100, 2);


        System.out.println("Marca: " + Moto.getMarca());
        System.out.println("Velocidad: " + Moto.getVelocidad() + " km/h");
        System.out.println("Número de ruedas: " + Moto.getRuedas());


        Moto.acelerar();
        Moto.frenar();

        Camion Camion = new Camion("Ford", 100, 4);


        System.out.println("Marca: " + Camion.getMarca());
        System.out.println("Velocidad: " + Camion.getVelocidad() + " km/h");
        System.out.println("Número de ruedas: " + Camion.getRuedas());


        Camion.acelerar();
        Camion.frenar();
    }
}