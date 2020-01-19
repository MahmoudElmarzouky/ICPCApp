package icpcapp.Model;

public class Setting {

    private String Name, UserName, Password, Phone, Type;

    public Setting() {
    }

    public Setting(String Name, String UserName, String Password, String Phone, String Type) {
        this.Name = Name;
        this.UserName = UserName;
        this.Password = Password;
        this.Phone = Phone;
        this.Type = Type;
    }
     
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone() {
        return Phone;
    }

    public String getType() {
        return Type;
    }

}
