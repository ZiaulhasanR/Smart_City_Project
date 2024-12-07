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
public class HOMEController implements Initializable {

    @FXML
    private Button Administration;
    @FXML
    private Button Tourism;
    @FXML
    private Button Education;
    @FXML
    private Button Jobseekers;
    @FXML
    private Button Business;
    @FXML
    private Button Sports;
    @FXML
    private Button Login;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void AdministrationAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Administration.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Administration");
        stage.show();
    }

    @FXML
    private void TourismAction(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("show_tourism.fxml"));
            Parent root;
            root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Administration");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(HOMEController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void EducationAction(ActionEvent event) {
    }

    @FXML
    private void JobseekersAction(ActionEvent event) {
    }

    @FXML
    private void BusinessAction(ActionEvent event) {
    }

    @FXML
    private void SportsAction(ActionEvent event) {
    }

    @FXML
    private void LoginAction(ActionEvent event) {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("login");
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
