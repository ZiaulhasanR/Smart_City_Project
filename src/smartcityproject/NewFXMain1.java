/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcityproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class NewFXMain1 extends Application {
    Connection co;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("HOME.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));;
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Interface.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root);

        primaryStage.setTitle("Interface");
        primaryStage.setScene(scene);
        primaryStage.show();
        
//        try {
//            co=DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");
//            
//            String sql = "SELECT * FROM CITIZEN_INFO";
//            Statement st = co.createStatement();
//            
//            ResultSet rs = st.executeQuery(sql);
//            
//            
//            while(rs.next())
//            {
//                System.out.println(rs.getString(1));
//            
//            }
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "DataBase not connected","Error", JOptionPane.ERROR_MESSAGE);
//            System.out.println(ex);
//        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
