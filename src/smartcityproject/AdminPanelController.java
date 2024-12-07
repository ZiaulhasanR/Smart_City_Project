/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcityproject;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
public class AdminPanelController implements Initializable {
    Connection con;

    @FXML
    private Button Company;
    @FXML
    private Button Hotel;
    @FXML
    private Button Library;
    @FXML
    private Button Fedaration;
    @FXML
    private TextField add_hotel;
    @FXML
    private TextField add_company;
    @FXML
    private TextField add_library;
    @FXML
    private TextField add_fedaration;
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
    private void CompanyAction(ActionEvent event) {
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DataBase not connected","Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        int r=-1;
        String company_name=add_company.getText();
        
        String sql="INSERT INTO JOBSEEKERS(KEY_WORD) VALUES(?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, company_name);
            r=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,r+"Row Updated successfully","Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "not updated","Error", JOptionPane.ERROR_MESSAGE);
        }
        add_company.clear();
    }

    @FXML
    private void HotelAction(ActionEvent event) {
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DataBase not connected","Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        int r=-1;
        String hotel_name=add_hotel.getText();
        
        String sql="INSERT INTO TOURISM_INFO(KEY_WORDS) VALUES(?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, hotel_name);
            r=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,r+"Row Updated successfully","Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "not updated","Error", JOptionPane.ERROR_MESSAGE);
        }
        add_hotel.clear();
    }

    @FXML
    private void LibraryAction(ActionEvent event) {
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DataBase not connected","Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        int r=-1;
        String libary_name=add_library.getText();
        
        String sql="INSERT INTO EDUCATION_INFO(KEY_WORD) VALUES(?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, libary_name);
            r=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,r+"Row Updated successfully","Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "not updated","Error", JOptionPane.ERROR_MESSAGE);
        }
        add_library.clear();
    }

    @FXML
    private void FedarationAction(ActionEvent event) {
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DataBase not connected","Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        int r=-1;
        String sports_name=add_fedaration.getText();
        
        String sql="INSERT INTO SPORTS(KEY_WORDS) VALUES(?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, sports_name);
            r=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,r+"Row Updated successfully","Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "not updated","Error", JOptionPane.ERROR_MESSAGE);
        }
        add_fedaration.clear();
    }
    @FXML
    void backAction(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Administration.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Administration");
        stage.show();
    }
    
}
