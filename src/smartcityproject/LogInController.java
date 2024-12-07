package smartcityproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class LogInController {

    Connection con;

    @FXML
    private TextField NID;

    @FXML
    private PasswordField Password;

    @FXML
    private Button Login;

    @FXML
    void LoginAction(ActionEvent event) {

//        String query = "SELECT Id, Name, Salary FROM Employees";
//      ResultSet rs = stmt.executeQuery(query);
//      while(rs.next()) {
//         System.out.println("Id: "+rs.getString("Id"));
//         System.out.println("Name: "+rs.getString("Name"));
//         System.out.println("Salary: "+rs.getString("Salary"));
//         System.out.println(" ");
        String pass = Password.getText();
        String nid = NID.getText();

        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/CitizenChart", "ziaul", "123456");

            String sql = "SELECT * FROM CITIZEN_REG";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String ni = rs.getString(1);
                String passw = rs.getString(5);
                if (ni.equals(nid) && passw.equals(pass)) {
                    //JOptionPane.showMessageDialog(null, "Login successful", "Success", JOptionPane.INFORMATION_MESSAGE);

                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("Allowence_msg.fxml"));
                        Parent root;
                        root = loader.load();
                        Scene scene = new Scene(root);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(scene);
                        stage.setTitle("Allowence Update");
                        stage.show();
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }

                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DataBase not connected", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }

        Password.clear();
        NID.clear();
    }

}
