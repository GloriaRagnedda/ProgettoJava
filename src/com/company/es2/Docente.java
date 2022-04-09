package com.company.es2;

public class Docente extends Persona{
    int codiceDocente;
    String materia;
    boolean ordinario; //true se il docente è ordinario
    double stipendio;
    final static double STIPENDIO_MINIMO = 100.0D;


    public Docente(String nome, String cognome, int eta, char genere) {
        super(nome, cognome, eta, genere);
    }

    public Docente(String nome, String cognome, int eta, char genere, int codiceDocente, String materia,
                   boolean ordinario, double stipendio) {
        super(nome, cognome, eta, genere);
        this.codiceDocente=codiceDocente;
        this.materia=materia;
        this.ordinario=ordinario;
        this.stipendio = controlloStipendioMinimo(stipendio);
    }



    double controlloStipendioMinimo(double stipendio){
        if(stipendio < this.STIPENDIO_MINIMO){
            stipendio = STIPENDIO_MINIMO;
        }
        return stipendio;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "codiceDocente=" + codiceDocente +
                ", materia=" + materia +
                ", ordinario=" + ordinario +
                ", stipendio=" + stipendio +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", genere=" + genere +
                '}';
    }
}
