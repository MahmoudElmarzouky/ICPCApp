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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author ncm
 */
public class FXMLRegistrationController implements Initializable {
    @FXML
    private Pane viewPane;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPhone;
    @FXML
    private ComboBox<?> txtYear;
    @FXML
    private ComboBox<?> txtDepartment;
    @FXML
    private ComboBox<?> txtLevels;
    @FXML
    private TextField txtName1;
    @FXML
    private TextField txtTime;
    @FXML
    private TableColumn<?, ?> colID;
    @FXML
    private TableColumn<?, ?> colName;
    @FXML
    private TableColumn<?, ?> colEmail;
    @FXML
    private TableColumn<?, ?> colPhone;
    @FXML
    private TableColumn<?, ?> colYear;
    @FXML
    private TableColumn<?, ?> colDepartment;
    @FXML
    private TableColumn<?, ?> colLevel;
    @FXML
    private TableColumn<?, ?> colTime;
    @FXML
    private TextField txtSearch;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
