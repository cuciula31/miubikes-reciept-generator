package daten;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

import com.spire.doc.Section;
import com.spire.doc.Table;
import objekte.Produkt;

import java.time.LocalDate;
import java.util.List;

public class WortImporteur {

    static Document dokumentieren = new Document();
    static Section section;
    static Table prTable;


    public static void dokumentLaden() {
        ClassLoader klasseLader = WortImporteur.class.getClassLoader();
        String pfad = klasseLader.getResource("invoice_template.docx").getPath();
        System.out.println(pfad.substring(1));

        dokumentieren.loadFromFile(pfad.substring(1));
        section = dokumentieren.getSections().get(0);
        System.out.println(pfad);
//        ProduktDaten.produktdatenErsetzen(dokumentieren, new List<Produkt>());

        for(Object t : section.getTables()){
            Table table = (Table) t;
            if (table.getTitle().equals("productsTable")) {
                prTable = table;
            }
        }


    }



    public static void schreiben(){
        dokumentieren.saveToFile("invoices/invoice.pdf", FileFormat.PDF);

    }


    public static void kauferdatenErsetzen(String kaufer, String nagel, String registriernummer, String hauptquartier, String stadt, String iban, String bank) {
        KauferDaten.kauferdatenErsetzen(dokumentieren, kaufer, nagel, registriernummer, hauptquartier, stadt, iban, bank);
    }

    public static void datumDatenErsetzen() {
        dokumentieren.replace(Konstanten.DATUM, LocalDate.now().toString(), true, true);
    }

    public static void expeditionDatenErsetzen(String delegieren, String idSerie, String idSeriennummer, String standort, String wagen, String nummernschild) {
        ExpeditionDaten.expeditionDatenErsetzen(dokumentieren, delegieren, idSerie, standort, idSeriennummer, wagen, nummernschild);
    }

    public static void produktdatenErsetzen(List<Produkt> list){
        ProduktDaten.produktdatenErsetzen(dokumentieren, list);
    }


}
