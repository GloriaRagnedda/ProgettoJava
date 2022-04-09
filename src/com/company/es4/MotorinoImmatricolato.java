package com.company.es4;

public class MotorinoImmatricolato extends Motorino{
    double maxVelocità;
    String targa;

    public MotorinoImmatricolato(String colore, String tipo, boolean antifurto, double velocità) {
        super(colore, tipo, antifurto, velocità);
    }

    public MotorinoImmatricolato(String colore, String tipo, boolean antifurto, double velocità,
    double maxVelocità, String targa) {
        super(colore, tipo, antifurto, velocità);
        this.maxVelocità = maxVelocità;
        this.targa = targa;
    }



}
