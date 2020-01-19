package icpcapp.Control;

import icpcapp.Model.Setting;
import icpcapp.ViewControl.FXMLHomeController;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseControl {
   private DatabaseConnection con=new DatabaseConnection();;
   private  Statement stat;
    public boolean Login(Setting  o) throws IOException, SQLException {
        FXMLHomeController setData = new FXMLHomeController();
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
    public Integer getAutoNumber(String tableName,String colName){
       try {
           String sql="select max("+colName+")+1 as autonumber"+
                   " from "+tableName;
           con.open();
           stat=con.open().createStatement();
           stat.executeQuery(sql);
           Integer num = 0;
           while (stat.getResultSet().next()){
               num=stat.getResultSet().getInt("autonumber");
           }
           con.close();
           if(num>0)
           {
               return num;
           }
           else{
               return 1;
           }
       } catch (SQLException ex) {
           Logger.getLogger(DataBaseControl.class.getName()).log(Level.SEVERE, null, ex);
       return 0;
       }     
    }
    public ResultSet fillTable(String tableName) throws SQLException {
        
        con.open();
        stat=con.open().createStatement();
        String sc = "select * from " + tableName;
        ResultSet res = stat.executeQuery(sc);
        return res;
    }
    public void runQuery(String sql) throws SQLException{
      con.open();
      stat=con.open().createStatement();
      stat.executeUpdate(sql);
      con.close();
    }
}