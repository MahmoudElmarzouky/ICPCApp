package icpcapp.ViewControl;

import icpcapp.Control.DataBaseControl;
import icpcapp.Control.SettingControl;
import icpcapp.Model.Setting;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author ncm
 */
public class FXMLSettingController implements Initializable {
    @FXML
    private Pane viewPane;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtPhone;
    @FXML
    private ComboBox txtType;
    @FXML
    private TableColumn<Setting, String> colName;
    @FXML
    private TableColumn<Setting, String> colUserName;
    @FXML
    private TableColumn<Setting, String> colPassword;
    @FXML
    private TableColumn<Setting, String >colPhone;
    @FXML
    private TableColumn<Setting, String> colType;
    @FXML
    private TableView<Setting> settingTable;
    @FXML
    private TextField txtSearch;
    ObservableList<Setting> data;
    private SettingControl settingcontrol=new SettingControl();
    private int id; 
    public void insert(){
    Setting o=new Setting();
    o.setName(txtName.getText());
    o.setUserName(txtUserName.getText());
    o.setPassword(txtPassword.getText());
    o.setPhone(txtPhone.getText());
    o.setType(txtType.getSelectionModel().getSelectedItem().toString());
    settingcontrol.insert(o);
    fillTable();
    }
   public void delete(){
    Setting o=new Setting();
    o.setUserName(txtUserName.getText());
   settingcontrol.delete(o);
    fillTable();
   }
   public void update(){
    Setting o=new Setting();
    o.setName(txtName.getText());
    o.setUserName(txtUserName.getText());
    o.setPassword(txtPassword.getText());
    o.setPhone(txtPhone.getText());
    o.setType(txtType.getSelectionModel().getSelectedItem().toString());
    settingcontrol.updata(o);
    fillTable();
   }
    public void getSelect() {
        id = settingTable.getSelectionModel().getSelectedIndex();
        if (id <= -1) {
            return;
        }
        txtName.setText(colName.getCellData(id));
        txtUserName.setText(colUserName.getCellData(id));
        txtPassword.setText(colPassword.getCellData(id));
        txtPhone.setText(colPhone.getCellData(id));
    }
   public void clear(){
   txtName.setText("");
   txtUserName.setText("");
   txtPassword.setText("");
   txtPhone.setText("");
   }
   public void fillCoboBox(){
    ObservableList<String> list = FXCollections.observableArrayList("admin", "orginizer");
   txtType.setItems(list);
   }
    public void fillTable() {
        try {
            fillCoboBox();
            clear();
            ResultSet res =new DataBaseControl().fillTable("usertable");
            data = FXCollections.observableArrayList();
            while (res.next()) {
                data.add(new Setting(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)));
            }
           settingTable.setItems(data);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLSettingController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colName.setCellValueFactory(new PropertyValueFactory<Setting, String>("Name"));
        colUserName.setCellValueFactory(new PropertyValueFactory<Setting, String>("UserName"));
        colPassword.setCellValueFactory(new PropertyValueFactory<Setting, String>("Password"));
        colPhone.setCellValueFactory(new PropertyValueFactory<Setting, String>("Phone"));
        colType.setCellValueFactory(new PropertyValueFactory<Setting, String>("Type"));      
        fillTable();
     
    }    
    
}
