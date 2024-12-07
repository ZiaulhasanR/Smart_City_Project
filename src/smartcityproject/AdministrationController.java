/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcityproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AdministrationController implements Initializable {

    @FXML
    private Button Admin;

    @FXML
    private TextField TourTxt;

    @FXML
    private Button Tourism;

    @FXML
    private TextField AdminTxt;

    @FXML
    private TextField EducationTxt;

    @FXML
    private Button Education;

    @FXML
    private TextField Sportstxt;

    @FXML
    private Button Sports;

    @FXML
    private Button Job;

    @FXML
    private TextField jobTxt;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    String admin1 = "786@";

    @FXML
    private void AdminAction(ActionEvent event) throws IOException {
        String check = AdminTxt.getText();
        if (admin1.equals(check)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Admin Panel.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Admin Panel");
            stage.show();

        } else {
            JOptionPane.showMessageDialog(null, "NO MATCH FOUND", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    @FXML
    private void TourismAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tourism_admin.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Tourism Admin");
        stage.show();
    }

    @FXML
    private void EducationAction(ActionEvent event) {
    }

    @FXML
    private void SportsAction(ActionEvent event) {
    }

    @FXML
    private void JobAction(ActionEvent event) {
    }

    @FXML
    void backAction(ActionEvent event) {
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
