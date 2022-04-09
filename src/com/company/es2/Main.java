package com.company.es2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("studente", "ada", 22, 'M');
        Studente alex = new Studente("Alex", "Bassi", 25, 'M', 123,
                "Informatica", true);
        Docente fabio = new Docente("Fabio", "Sorrentino", 0, 'M', 12,
                "informatica", true, 200.0D);
        Docente vittoria = new Docente("Vittoria", "Frau", 26, 'F', 12, "informatica",
                true, 200.0D);
        String [] corsiDiLaurea = {"Informatica", "Scienze della terra", "Medicina"};
                     //motorino          //motorino1 motorino2
        Docente [] docentiDiCagliari = {fabio, vittoria};
        Studente [] studentiDiCagliari = {studente, alex};
        Universita universitàCagliari = new Universita("Università di Cagliari", corsiDiLaurea,
                docentiDiCagliari, studentiDiCagliari);


        Materia materia = new Materia("Gloria", "Ragnedda",34,'f',
                "matematica", 6);
       // materia.stampaInformazioni();
        Universita universita = new Universita( docentiDiCagliari, studentiDiCagliari);
        universita.stampaDocentiStudenti();

    }
}
