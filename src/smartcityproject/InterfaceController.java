/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcityproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class InterfaceController implements Initializable {

    @FXML
    private Button SignIn;
    @FXML
    private Button SignUp;
    @FXML
    private Button Guest;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void SignInAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Loginnn");
        stage.show();
    }

    @FXML
    private void SingnUpAcion(ActionEvent event) {

        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Signup");
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    @FXML
    private void GuestAction(ActionEvent event) {
        
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HOME.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Hooome");
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
