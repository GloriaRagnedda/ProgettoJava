package com.company.es2;

public class Materia extends Docente{
        String nomeMateria;
        int cfu;

    public Materia(String nome, String cognome, int eta, char genere) {
        super(nome, cognome, eta, genere);
    }

    public Materia(String nome, String cognome, int eta, char genere, String nomeMateria, int cfu) {
        super(nome, cognome, eta, genere);
        this.nomeMateria = nomeMateria;
        this.cfu = cfu;
    }

    public void stampaInformazioni(){
        System.out.printf("Nome \n" + this.nome + "\n Cognome \n" + this.cognome + "\n Etá \n" + this.eta +"\n Genere \n" + this.genere +
                 "nome Materia:\n " + this.nomeMateria + " \ncfu:\n " + this.cfu);
    }



    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", cfu=" + cfu +
                '}';
    }

}
