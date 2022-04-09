package com.company.es3;

public class TipoCapoAbbigliamento {
    String marca,modello;
    double costo;

    public TipoCapoAbbigliamento(String marca, String modello, double costo){
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }

    public void getCosto(){
        System.out.println(this.costo);
    }

    public double applicaSconto(double percentuale){
        return costo - (costo * percentuale / 100 );
    }

    public double modificaCosto(double nuovoCosto){
        return this.costo = nuovoCosto;
    }


}
