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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SignUpController implements Initializable {
    Connection con;

      @FXML
    private PasswordField EnterPassword;

    @FXML
    private PasswordField ConfirmPassword;

    @FXML
    private TextField username;

    @FXML
    private Button RegisterNow;

    @FXML
    private Button Login;

    @FXML
    private TextField NID;

    @FXML
    private TextField Age;

    @FXML
    private TextField income;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    


    @FXML
    private void RegisterNowAction(ActionEvent event)  {
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");
            
//            String sql = "SELECT * FROM CITIZEN_INFO";
//            Statement st = con.createStatement();
//            
//            ResultSet rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DataBase not connected","Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        int r=-1;
        String usernam=username.getText();
        String nid=NID.getText();
        String age=Age.getText();
        String incom=income.getText();
        String passwrd=EnterPassword.getText();
        String passwrd1=ConfirmPassword.getText();
        
        String sql="INSERT INTO CITIZEN_REG(NID,FULLNAME,AGE,SALARY,PASSWORD) VALUES(?,?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, nid);
            ps.setString(2, usernam);
            ps.setString(3, age);
            ps.setString(4, incom);
            ps.setString(5, passwrd);
            r=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,r+"Row Updated successfully","Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "not updated","Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    private void LoginAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Loginnn");
        stage.show();
    }

//    @FXML
//    private void NIDAction(ActionEvent event) {
//    }
    
}
