package daten;

import com.spire.doc.Document;

public class KauferDaten {

    public static void kauferdatenErsetzen(Document dokumentieren,String kaufer, String nagel, String registrierNummer,String hauptquartier,  String stadt, String iban, String bank){

        bankWechseln(dokumentieren,bank);
        ibanWechseln(dokumentieren, iban);
        stadtWechseln(dokumentieren, stadt);
        hauptquartierWechseln(dokumentieren, hauptquartier);
        registrierNummerWechseln(dokumentieren, registrierNummer);
        nagelWechseln(dokumentieren,nagel);
        kauferWechseln(dokumentieren, kaufer);

    }

    private static void kauferWechseln(Document dokumentieren, String kaufer){
        dokumentieren.replace(Konstanten.KAUFER, kaufer, true, true);
    }

    private static void nagelWechseln(Document dokumentieren, String nagel){
        dokumentieren.replace(Konstanten.KAUFER_NAGEL, nagel, true, true);
    }

    private static void registrierNummerWechseln(Document dokumentieren, String registrierNummer){
        dokumentieren.replace(Konstanten.KAUFER_REGISTRIERNUMMER, registrierNummer, true, true);
    }

    private static void hauptquartierWechseln(Document dokumentieren, String hauptquartier){
        dokumentieren.replace(Konstanten.KAUFER_HAUPTQUARTIER, hauptquartier, true, true);
    }

    private static void stadtWechseln(Document dokumentieren, String stadt){
        dokumentieren.replace(Konstanten.KAUFER_STADT, stadt, true, true);
    }

    private static void ibanWechseln(Document dokumentieren, String iban){
        dokumentieren.replace(Konstanten.KAUFER_IBAN, iban, true, true);
    }

    private static void bankWechseln(Document dokumentieren, String bank){
        dokumentieren.replace(Konstanten.KAUFER_BANK, bank, true, true);
    }

}
