/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpcapp.ViewControl;

import icpcapp.Control.DataBaseControl;
import icpcapp.Model.Setting;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
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
import org.w3c.dom.events.Event;

public class FXMLLoginController implements Initializable {
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnLogin;  
   public void login() throws IOException, SQLException{
       Setting obj=new Setting();
     obj.setUserName(txtUserName.getText());
       obj.setPassword(txtPassword.getText());
        DataBaseControl o=new DataBaseControl();
        if(o.Login(obj)){
        Stage st=new Stage();
        Parent pr = FXMLLoader.load(getClass().getResource("/icpcapp/ViewForms/FXMLHome.fxml"));
        Scene scene = new Scene(pr);
        st.setScene(scene);
        st.show(); 
        }
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
