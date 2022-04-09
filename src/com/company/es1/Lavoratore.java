package com.company.es1;

public class Lavoratore {
    String nome;
    int codice;
    double stipendio;
    char sesso;
    final static double STIPENDIO_MINIMO = 100.0D;


    public Lavoratore(String nome, int codice, double stipendio, char sesso){
        this.nome=nome;
        this.codice=codice;
        double stipendioCorretto = controlloStipendioMinimo(stipendio);
        this.stipendio = stipendioCorretto;
        this.sesso=sesso;
    }

    double controlloStipendioMinimo(double stipendio){
        if(stipendio < this.STIPENDIO_MINIMO){
            stipendio = STIPENDIO_MINIMO;
        }
        return stipendio;
    }

    /*
    Per i lavoratori crea un metodo che incrementa lo stipendio del lavoratore di
    una certa percentuale passata per parametro.
     */
    void incrementaStipendio(int percentuale){
        double nuovoStipendio = this.stipendio + ((this.stipendio)/100*percentuale);
        this.stipendio = nuovoStipendio;
    }

    void stampaInformazioni(){
        System.out.println("Il nome del lavoratore è : " + this.nome + " il codice del lavoratore è: " +
                this.codice + " Lo stipendio del lavoratore è: " + this.stipendio +
                " il sesso è: " + this.sesso
                );
    }
}
