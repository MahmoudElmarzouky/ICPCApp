package icpcapp.Control;

import icpcapp.Model.Setting;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SettingControl {
  private final DataBaseControl dpObject= new DataBaseControl();
  public void insert(Setting o){
        try {
            String sql="insert into usertable values ('"+o.getName()+"' ,'"+o.getUserName()+"','"+o.getPassword()+
                    "' ,'"+ o.getPhone()+"' ,'"+o.getType()+"')";
            dpObject.runQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SettingControl.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  public void delete(Setting o){
        try {
            String sql="delete from usertable where UserName = '" + o.getUserName()+"'";
            dpObject.runQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SettingControl.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    public void updata(Setting o){
        try {
         String sql = "update usertable set Name ='"+o.getName()+"' , UserName = '"+o.getUserName()+
          "' , Password = '"+o.getPassword()+"' , Phone = '"+o.getPhone()+"' ,Type = '"+o.getType()+
                 "' where UserName = '"+o.getUserName()+"'";
            dpObject.runQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SettingControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
}