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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Tourism_adminController implements Initializable {
    Connection con;

    @FXML
    private AnchorPane TxtSRRent;
    @FXML
    private TextField TxtKeyWords;
    @FXML
    private TextField TxtHotelName;
    @FXML
    private TextField TxtDoubleRoom;
    @FXML
    private TextField TxtDRRent;
    @FXML
    private TextField TxtSingleRoom;
    @FXML
    private TextField TxtSingleRRent;
    @FXML
    private TextField TxtLocation;
    @FXML
    private TextField Txtwebsite;
    @FXML
    private Button Btn_Update;
    @FXML
    private Button BtnBack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Btn_UpdateAction(ActionEvent event) {
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DataBase not connected","Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        int r=-1;
        String KeyWords=TxtKeyWords.getText();
        String hotelname=TxtHotelName.getText();
        String DR=TxtDoubleRoom.getText();
        String DRR=TxtDRRent.getText();
        String SR=TxtSingleRoom.getText();
        String SRR=TxtSingleRRent.getText();
        String loc=TxtLocation.getText();
        String ws=Txtwebsite.getText();
        
        String sql="UPDATE TOURISM_INFO SET HOTEL_NAME=?, DOUBLE_ROOM=?, SINGLE_ROOM=?, D_R_RENT=?, S_R_RENT=?,LOCATION=?,WEBSITE=? WHERE KEY_WORDS=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, hotelname);
            ps.setString(2, DR);
            ps.setString(3, DRR);
            ps.setString(4, SR);
            ps.setString(5, SRR);
            ps.setString(6, loc);
            ps.setString(7, ws);
            ps.setString(8, KeyWords);
            
            r=ps.executeUpdate();
            if(r>0)
            {
                JOptionPane.showMessageDialog(null,"Row Updated successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null, "not updated","Error", JOptionPane.ERROR_MESSAGE);
            
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "not updated","Error", JOptionPane.ERROR_MESSAGE);
        }
        TxtKeyWords.clear();
        TxtSingleRoom.clear();
        TxtHotelName.clear();
        TxtDRRent.clear();
        TxtDoubleRoom.clear();
        TxtSingleRRent.clear();
        TxtLocation.clear();
        Txtwebsite.clear();
    }

    @FXML
    private void BtnBackAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Administration.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Administration");
        stage.show();
    }
    
}
