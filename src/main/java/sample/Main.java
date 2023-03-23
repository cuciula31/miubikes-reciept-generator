package sample;


import daten.WortImporteur;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class Main extends Application {

    private static double xOffset = 0;
    private static double yOffset = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String FXML_PATH = "/sample.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_PATH));
        Parent root = loader.load();

        primaryStage.setTitle("Generator Facturi");
        primaryStage.setScene(new Scene(root, 1300, 800));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
//        WortImporteur.dokumentLaden();

        root.setOnMousePressed(mouseEvent -> {
            xOffset = mouseEvent.getSceneX();
            yOffset = mouseEvent.getSceneY();
        });

        root.setOnMouseDragged(mouseEvent -> {
            primaryStage.setX(mouseEvent.getScreenX() - xOffset);
            primaryStage.setY(mouseEvent.getScreenY() - yOffset);
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
