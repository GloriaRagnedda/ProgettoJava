package com.company.es2;

public class Universita {
    String nome;
    // "informatica" , "scienze della terra"...
    String [] corsiDiLaurea;
    //ogni università ha un insieme di docenti e studenti
    Docente [] docenti;
    Studente [] studenti;


    public Universita(String nome, String [] corsiDiLaurea, Docente [] docenti, Studente [] studenti){
        this.corsiDiLaurea=corsiDiLaurea;
        this.docenti=docenti;
        this.studenti=studenti;
    }

    public Universita( Docente [] docenti, Studente [] studenti){
        this.docenti = docenti;
        this.studenti = studenti;
    }

    public void stampaDocentiStudenti(){
       System.out.printf("\n\n");
        for (Docente docente: docenti){
            System.out.println(docente.toString());
        }
        for (Studente studente:studenti){
            System.out.println(studente.toString());
        }
    }
}
