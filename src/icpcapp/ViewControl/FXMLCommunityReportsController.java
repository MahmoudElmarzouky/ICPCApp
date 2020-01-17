/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpcapp.ViewControl;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author ncm
 */
public class FXMLCommunityReportsController implements Initializable {
    @FXML
    private Pane viewPane;
    @FXML
    private TableColumn<?, ?> colID;
    @FXML
    private TableColumn<?, ?> Name;
    @FXML
    private TableColumn<?, ?> colEmail;
    @FXML
    private TableColumn<?, ?> colPhone;
    @FXML
    private TableColumn<?, ?> colNationalID;
    @FXML
    private TableColumn<?, ?> colTeam;
    @FXML
    private TableColumn<?, ?> colAddress;
    @FXML
    private TableColumn<?, ?> colBirthDate;
    @FXML
    private TableColumn<?, ?> colYear;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
