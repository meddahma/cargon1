package sample;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class appController  {
    Main main;
    @FXML
    TextField username;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    PasswordField password;

   @FXML public void enter() throws IOException {
      /* String user =  username.getText();
       String pass = password.getText();
       if (("meddah" == user) && (pass =="123456" ))
       {
           Alert succ = new Alert(Alert.AlertType.CONFIRMATION);
           succ.setHeaderText("Confirmation");
           succ.setContentText("est votre session ");
           succ.showAndWait();
           Stage stage = new Stage();
           stage.setTitle("Domande d' appui");
           Parent domande = FXMLLoader.load(getClass().getResource("demandeAppui.fxml"));
           Scene ssce = new Scene(domande);
           stage.setScene(ssce);
           stage.centerOnScreen();
           stage.show();
       }else {
           Alert err = new Alert(Alert.AlertType.ERROR);
           err.setHeaderText("Erreur");
           err.setContentText("Nom d'utilisateur ou mot passe est incurrect ");
       }*/
   }

}
