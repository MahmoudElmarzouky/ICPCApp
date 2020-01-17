package icpcapp.ViewControl;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class FXMLAttendanceController implements Initializable {
    @FXML
    private Pane viewPane;
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
    private TableColumn<?, ?> colAttendance;
    @FXML
    private ComboBox<?> txtLevels;
    @FXML
    private TextField txtSearch;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }
    
}
