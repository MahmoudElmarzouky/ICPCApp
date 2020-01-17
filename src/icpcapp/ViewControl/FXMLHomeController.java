package icpcapp.ViewControl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.*;

public class FXMLHomeController implements Initializable {
   Pane veiw;
   @FXML
   Pane viewPane; 
   public void addRegistration(){
    viewPane.getChildren().add(getPane("/icpcapp/ViewForms/FXMLSetting.fxml"));
   }
   
   public void addAttendance(){
    viewPane.getChildren().add(getPane("/icpcapp/ViewForms/FXMLAttendance.fxml"));
   }
   public void addCommunity(){
    viewPane.getChildren().add(getPane("/icpcapp/ViewForms/FXMLCommunity.fxml"));
   }
    public void addTrainingReports(){
    viewPane.getChildren().add(getPane("/icpcapp/ViewForms/FXMLTrainingReports.fxml"));
   }
    public void addCommunityReports(){
    viewPane.getChildren().add(getPane("/icpcapp/ViewForms/FXMLCommunityReports.fxml"));
   }
    public void addSetting(){
    viewPane.getChildren().add(getPane("/icpcapp/ViewForms/FXMLSetting.fxml"));
   }
    public Pane getPane(String FXMLname){
       try {
           veiw = FXMLLoader.load(getClass().getResource(FXMLname));
       } catch (IOException ex) {
           Logger.getLogger(FXMLHomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
    return veiw;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
