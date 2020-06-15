package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
Stage stagePrincipal;
    AnchorPane conteneurOP;
    @Override
    public void start(Stage primaryStage) {
        stagePrincipal = primaryStage;
        stagePrincipal.setTitle("Domande de l'appui des Organismes Professionnelles");
        stagePrincipal.setResizable(false);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("DemandeAppui.fxml"));
        try {
            conteneurOP = loader.load();

            Scene scene = new Scene(conteneurOP);
            stagePrincipal.setScene(scene);
            appController controller = loader.getController();
            controller.setMain(this);
            stagePrincipal.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
