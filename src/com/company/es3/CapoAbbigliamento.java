package com.company.es3;

public class CapoAbbigliamento extends TipoCapoAbbigliamento{
    int taglia, quantitàAcquistata, quantitàDisponibile;

    public CapoAbbigliamento(String marca, String modello, double costo) {
        super(marca, modello, costo);
    }

    public CapoAbbigliamento(String marca, String modello, double costo, int taglia,
                             int quantitàAcquistata, int quantitàDisponibile) {
        super(marca, modello, costo);
        this.taglia = taglia;
        this.quantitàAcquistata = quantitàAcquistata;
        this.quantitàDisponibile = quantitàDisponibile;
    }
    public void venduto(int numCapiVenduti){
        int risultato = this.quantitàDisponibile - numCapiVenduti;
        if(this.quantitàDisponibile > risultato){
            this.quantitàDisponibile = quantitàDisponibile - numCapiVenduti;
        }
    }

    public void getDettagli(){
        System.out.printf("\nMarca: " + marca + "\nModello: " + modello + "\nCosto: " + costo +"\nTaglia: "
                + this.taglia + "\t\nCapi venduti: " + this.quantitàAcquistata +
                "\t\nQuantita' disponibile: " + this.quantitàDisponibile);
    }
}
