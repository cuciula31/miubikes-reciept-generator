package daten;

import com.spire.doc.Document;

public class ExpeditionDaten {

    public static void expeditionDatenErsetzen(Document dokumentieren, String delegieren, String idSerie,
                                               String standort, String idSeriennummer, String wagen, String nummernschild){

        delegierenWechseln(dokumentieren, delegieren);
        idSerieWechseln(dokumentieren, idSerie);
        standortWechseln(dokumentieren, standort);
        idSeriennummerWechseln(dokumentieren, idSeriennummer);
        wagenWechseln(dokumentieren, wagen);
        nummernschildWechseln(dokumentieren, nummernschild);


    }

    private static void delegierenWechseln(Document dokumentieren, String delegieren){
        dokumentieren.replace(Konstanten.EXPEDITION_DELEGIEREN, delegieren, true, true);
    }

    private static void idSerieWechseln(Document dokumentieren, String idSerie){
        dokumentieren.replace(Konstanten.EXPEDITION_IDSERIE, idSerie, true, true);
    }

    private static void standortWechseln(Document dokumentieren, String standort){
        dokumentieren.replace(Konstanten.EXPEDITION_STANDORT, standort, true, true);
    }

    private static void idSeriennummerWechseln(Document dokumentieren, String idSeriennummer){
        dokumentieren.replace(Konstanten.EXPEDITION_IDSERIENNUMMER, idSeriennummer, true, true);
    }

    private static void wagenWechseln(Document dokumentieren, String wagen){
        dokumentieren.replace(Konstanten.EXPEDITION_WAGEN, wagen, true, true);
    }

    private static void nummernschildWechseln(Document dokumentieren, String nummernschild){
        dokumentieren.replace(Konstanten.EXPEDITION_NUMMERNSCHILD, nummernschild, true, true);
    }

}
