package daten;

import com.spire.doc.Document;
import objekte.Produkt;

import java.util.List;

public class ProduktDaten {


    public static void produktdatenErsetzen(Document dokumentieren, List<Produkt> produktListe) {
//        for (int i = 0; i > 0; i--){

        if (!produktListe.isEmpty()) {
            for (int i = 29; i > produktListe.size()-1;i--){
                leerePlatze(dokumentieren,i);
            }
            for (int i = 0; i < produktListe.size(); i++) {
                laufendeNummerErsetzen(dokumentieren, produktListe, i);
                produktNameErsetzen(dokumentieren, produktListe, i);
                maßeinheitErsetzen(dokumentieren, produktListe, i);
                mengeErsetzen(dokumentieren, produktListe, i);
                einheitsPreisErsetzen(dokumentieren, produktListe, i);
                wertErsetzen(dokumentieren, produktListe, i);
                mehrwertsteuerErsetzen(dokumentieren, produktListe, i);
                mehrwertsteuerBErsetzen(dokumentieren, produktListe, i);
            }

//
        } else {
////                leerePlatze(dokumentieren,i);
        }
//            System.out.println(i);
    }



    private static void leerePlatze(Document dokumentieren, int i){
        laufendeNummerErsetzenLeer(dokumentieren,i);
        produktNameErsetzenLeer(dokumentieren,i);
        maßeinheitErsetzenLeer(dokumentieren, i);
        mengeErsetzenLeer(dokumentieren, i);
        einheitsPreisErsetzenLeer(dokumentieren, i);
        wertErsetzenLeer(dokumentieren, i);
        mehrwertsteuerErsetzenLeer(dokumentieren, i);
        mehrwertsteuerBErsetzenLeer(dokumentieren, i);

    }

    //LAUFENDE NUMMER
    private static void laufendeNummerErsetzen(Document dokumentieren, List<Produkt> produktListe, int i){
        String laufendeNummerTag = Konstanten.LAUFENDE_NUMMER+(i + 1);
        System.out.println(laufendeNummerTag);
        dokumentieren.replace(laufendeNummerTag,Integer.toString(produktListe.get(i).getId()+1),true, false);
    }

    private static void laufendeNummerErsetzenLeer(Document dokumentieren, int i){
        String laufendeNummerTag = Konstanten.LAUFENDE_NUMMER+i;
        dokumentieren.replace(laufendeNummerTag," ",true, true);
    }


    //Produkt name
    private static void produktNameErsetzen(Document dokumentieren, List<Produkt> produktListe, int i){
        String produktNameTag = Konstanten.PRODUKTNAME+(i+1);
        dokumentieren.replace(produktNameTag, produktListe.get(i).getProduktName(),true, true);
    }

    private static void produktNameErsetzenLeer(Document dokumentieren, int i){
        String produktNameTag = Konstanten.PRODUKTNAME+(i+1);
        dokumentieren.replace(produktNameTag," ",true, true);
    }

    //Maßeinheit
    private static void maßeinheitErsetzen(Document dokumentieren, List<Produkt> produktListe, int i){
        String maßeinheitTag = Konstanten.MAßEINHEIT+(i+1);
        dokumentieren.replace(maßeinheitTag, produktListe.get(i).getMaßeinheit(),true, true);
    }

    private static void maßeinheitErsetzenLeer(Document dokumentieren, int i){
        String maßeinheitTag = Konstanten.MAßEINHEIT+(i+1);
        dokumentieren.replace(maßeinheitTag," ",true, true);
    }

    //Menge
    private static void mengeErsetzen(Document dokumentieren, List<Produkt> produktListe, int i){
        String megneTag = Konstanten.MENGE+(i+1);
        dokumentieren.replace(megneTag, Integer.toString(produktListe.get(i).getMenge()),true, true);
    }

    private static void mengeErsetzenLeer(Document dokumentieren, int i){
        String megneTag = Konstanten.MENGE+(i+1);
        dokumentieren.replace(megneTag," ",true, true);
    }

    //EINHEITSPREIS
    private static void einheitsPreisErsetzen(Document dokumentieren, List<Produkt> produktListe, int i){
        String einheitsPreisTag = Konstanten.EINHEITSPREIS+(i+1);
        dokumentieren.replace(einheitsPreisTag, Double.toString(produktListe.get(i).getPreis()-(0.19*produktListe.get(i).getPreis())),true, true);
    }

    private static void einheitsPreisErsetzenLeer(Document dokumentieren, int i){
        String einheitsPreisTag = Konstanten.EINHEITSPREIS+(i+1);
        dokumentieren.replace(einheitsPreisTag," ",true, true);
    }

    //Wert
    private static void wertErsetzen(Document dokumentieren, List<Produkt> produktListe, int i){
        String wertTag = Konstanten.WERT+(i+1);
        dokumentieren.replace(wertTag, Double.toString(produktListe.get(i).getPreis()),true, true);
    }

    private static void wertErsetzenLeer(Document dokumentieren, int i){
        String wertTag = Konstanten.WERT+(i+1);
        dokumentieren.replace(wertTag," ",true, true);
    }

    //MEHRWERTSTEUER
    private static void mehrwertsteuerErsetzen(Document dokumentieren, List<Produkt> produktListe, int i){
        String mehrwertsteuerTag = Konstanten.MEHRWERTSTEUER+(i+1);
        dokumentieren.replace(mehrwertsteuerTag, "19%",true, true);
    }

    private static void mehrwertsteuerErsetzenLeer(Document dokumentieren, int i){
        String mehrwertsteuerTag = Konstanten.MEHRWERTSTEUER+(i+1);
        dokumentieren.replace(mehrwertsteuerTag," ",true, true);
    }

    //MEHRWERTSTEUER2
    private static void mehrwertsteuerBErsetzen(Document dokumentieren, List<Produkt> produktListe, int i){
        String mehrwertsteuerTag = Konstanten.MEHRWERTSTEUER2+(i+1);
        dokumentieren.replace(mehrwertsteuerTag, Double.toString(produktListe.get(i).getPreis()*0.19),true, true);
    }

    private static void mehrwertsteuerBErsetzenLeer(Document dokumentieren, int i){
        String mehrwertsteuerTag = Konstanten.MEHRWERTSTEUER2+(i+1);
        dokumentieren.replace(mehrwertsteuerTag," ",true, true);
    }
}
