package sample;

import benutzeroberflache.Übersetzungswechsel;
import daten.WortImporteur;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import objekte.Produkt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Regler {

    @FXML
    private Pane principalMenu;
    @FXML
    private Pane fieldMenu;
    @FXML
    private Button generateButton;

    @FXML
    private TextField buyerField;
    @FXML
    private TextField cuiField;
    @FXML
    private TextField comField;
    @FXML
    private TextField headquarterField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField bAField;
    @FXML
    private TextField bankField;

    @FXML
    private TextField productField;
    @FXML
    private TextField priceField;
    @FXML
    private TextField qtyField;

    @FXML
    private TextField delegateField;
    @FXML
    private TextField cIField;
    @FXML
    private TextField cINField;
    @FXML
    private TextField cICField;
    @FXML
    private TextField vehicleField;
    @FXML
    private TextField licensePlateField;

    @FXML
    private ListView<String> listView;

    List<Produkt> produktList = Collections.emptyList();

    @FXML
    private void initialize(){

    }

    @FXML
    private void menuGenerateReleased(){
        Übersetzungswechsel.translateYBack(principalMenu, 1000,400);
        Übersetzungswechsel.translateY(fieldMenu, -1000,400);
    }

    @FXML
    private void generateReleased(){
        WortImporteur.dokumentLaden();
        WortImporteur.produktdatenErsetzen(produktList);
        WortImporteur.schreiben();

        Übersetzungswechsel.translateYBack(fieldMenu, 1000,400);
        Übersetzungswechsel.translateY(principalMenu, 0,400);

        clearFields();
    }

    @FXML
    private void addReleased(){

        Produkt produkt = new Produkt(productField.getText(), "buc", (int)Double.parseDouble(qtyField.getText()),Double.parseDouble(priceField.getText()));
        listView.getItems().add(produkt.getProduktName() + " " + produkt.getMenge() + " " + produkt.getMaßeinheit() + " " + Double.toString(produkt.getPreis()*produkt.getMenge()) + " RON");
        produktList.add(produkt);

    }

    @FXML
    private void clearFields(){
        buyerField.clear();
        cuiField.clear();
        comField.clear();
        headquarterField.clear();
        cityField.clear();
        bAField.clear();
        bankField.clear();
        productField.clear();
        priceField.clear();
        qtyField.clear();
        delegateField.clear();
        cIField.clear();
        cINField.clear();
        cICField.clear();
        vehicleField.clear();
        licensePlateField.clear();

        listView.getItems().clear();
    }



}
