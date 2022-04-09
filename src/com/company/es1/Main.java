package com.company.es1;

public class Main {

    public static void main(String[] args) {
        Studente mattia = new Studente("mattia", 'M', 2, 1234);
        //mattia.matricola = 123; -> NO
        Studente vincenzo = new Studente("Vincenzo", 'm', 1, 1343);

        Lavoratore vittoria = new Lavoratore("vittoria", 123, 99.0,'F' );
        Lavoratore diego = new Lavoratore("diego", 1342, 200.0D, 'M');
        diego.incrementaStipendio(10);
        diego.incrementaStipendio(10);
        //vittoria.incrementaStipendio(20);
        vittoria.stampaInformazioni();
    }

}
