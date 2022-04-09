package com.company.es4;

import java.util.Arrays;

public class Motorino {
    String colore, tipo;
    boolean antifurto = false;
    double velocità;
    static int contatore;
    Motorino[] motorino;

    public Motorino(String colore, String tipo, boolean antifurto, double velocità){
        this.colore = colore;
        this.tipo = tipo;
        this.antifurto = antifurto;
        this.velocità = velocità;
        this.contatore = contatore + 1;
    }

    public Motorino(Motorino[] motorino){
        this.motorino = motorino;
    }



    public void getVelocità(){}

    public double accelera(double km){
        this.antifurto = false;

        if(!antifurto) {
            this.velocità = this.velocità + km;
        }
        return this.velocità;
    }

    public boolean inserisciAntifurto(){
        return this.antifurto = true;
    }

    @Override
    public String toString() {
        return "Motorino{" +
                "colore='" + colore + '\'' +
                ", tipo='" + tipo + '\'' +
                ", antifurto=" + antifurto +
                ", velocita'=" + velocità +
                ", motorino=" + Arrays.toString(motorino) +
                '}';
    }

   public void motoriniCreati() {
       System.out.printf("I nostri motorini sono: " + contatore);
   }


    public void stampaMotorino() {
        System.out.printf(
                "\nColore motorino: " + this.colore
                        + "\nTipo' motorino: " + this.tipo
                        + "\nVelocita' motorino: " + this.velocità
                        + "\nAntifurto motorino: " + this.antifurto
        );
    }


}
