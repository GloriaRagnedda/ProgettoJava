package com.company.es3;

public class Negozio {

    public static void main(String[] args) {
        TipoCapoAbbigliamento tipoCapo = new TipoCapoAbbigliamento("colmar", "Giacca E45", 350.5);
        CapoAbbigliamento capo = new CapoAbbigliamento("Levis", " jeans 570SC",
                79.8 ,40,30,30 );
        tipoCapo.getCosto();
        System.out.println(tipoCapo.applicaSconto(30));
        capo.venduto(2);
        capo.getDettagli();
    }
}
