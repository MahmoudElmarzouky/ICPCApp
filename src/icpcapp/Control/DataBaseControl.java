package icpcapp.Control;

import icpcapp.Model.Setting;
import icpcapp.ViewControl.FXMLHomeController;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseControl {
   private DatabaseConnection con;
   private  Statement stat;
    public boolean Login(Setting  o) throws IOException, SQLException {
        FXMLHomeController setData = new FXMLHomeController();
        con=new DatabaseConnection();
        con.open();
        stat=con.open().createStatement();
        String sc = "select * from usertable where " + "UserName='" +o.getUserName() + "' and " + "Password='" + o.getPassword() + "'";
        ResultSet res = stat.executeQuery(sc);
        if(res.next()) {
        setData.setIsAdmin(res.getString(5));
                con.close();
            return true;
        }else{
            con.close();
            return false;
        }
    } 
}
