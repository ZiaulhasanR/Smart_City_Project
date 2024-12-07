/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcityproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Show_tourismController implements Initializable {

    @FXML
    private TableView<?> hotel_info;
    @FXML
    private TableColumn<?, ?> hotelname;
    @FXML
    private TableColumn<?, ?> availDR;
    @FXML
    private TableColumn<?, ?> rentDR;
    @FXML
    private TableColumn<?, ?> availSR;
    @FXML
    private TableColumn<?, ?> RentSR;
    @FXML
    private TableColumn<?, ?> Location;
    @FXML
    private TableColumn<?, ?> Website;
    @FXML
    private TextField searchfilter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
