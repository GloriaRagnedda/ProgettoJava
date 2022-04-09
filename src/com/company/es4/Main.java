package com.company.es4;

public class Main {
    public static void main(String[] args) {
       // Motorino motorino = new Motorino("blu", "da corsa", true,324.56);
        Motorino motorino1 = new Motorino("rosso", "da gara", false,355.56);
        Motorino motorino2 = new Motorino("verde", "da passeggio", true,322.56);
        Motorino motorino3 = new Motorino("giallo", "da corsa", true,322.56);


        Motorino [] insiemeMotorini = {motorino1, motorino2, motorino3};
        Motorino motorino = new Motorino(insiemeMotorini);
        motorino.motoriniCreati();

        motorino1.accelera(12.23);
        motorino2.stampaMotorino();
    }
}
