/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcityproject;

import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Allowence_msgController implements Initializable {

    @FXML
    private Label oldAllowence;
    @FXML
    private Label salaryAllowence;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void BackAction(ActionEvent event) throws IOException {

//        try {
//            con = DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");
//
//            String sql = "SELECT * FROM CITIZEN_REG";
//            Statement st = con.createStatement();
//
//            ResultSet rs = st.executeQuery(sql);
//
//            while (rs.next()) {
//                String ni = rs.getString(1);
//                String passw = rs.getString(5);
//                if (ni.equals(nid) && passw.equals(pass)) {
//                    //JOptionPane.showMessageDialog(null, "Login successful", "Success", JOptionPane.INFORMATION_MESSAGE);
//
//                    
//
//                }
//
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "DataBase not connected", "Error", JOptionPane.ERROR_MESSAGE);
//            System.out.println(ex);
//        }
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HOME.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Home");
        stage.show();
    }

}
