package com.company.es2;

/**
 *              Persona
 *      Docente            Studente
 */
public class Studente extends Persona{
    int matricola;
    String corsoDiLaurea;
    boolean inCorso;

    public Studente(String nome, String cognome, int eta, char genere) {
        super(nome, cognome, eta, genere);
    }

    public Studente(String nome, String cognome, int eta, char genere, int matricola, String corsoDiLaurea,
                    boolean inCorso) {
        super(nome, cognome, eta, genere);
        this.matricola=matricola;
        this.corsoDiLaurea=corsoDiLaurea;
        this.inCorso=inCorso;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", genere=" + genere +
                ", matricola=" + matricola +
                ", corsoDiLaurea='" + corsoDiLaurea + '\'' +
                ", inCorso=" + inCorso +
                '}';
    }
}


