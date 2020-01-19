package icpcapp.Model;

public class Registration {

  private  String ID, Name, Email, Phone, Year, Department, Level, Time;
    Integer Attendance;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public void setAttendance(Integer Attendance) {
        this.Attendance = Attendance;
    }


    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getYear() {
        return Year;
    }

    public String getDepartment() {
        return Department;
    }

    public String getLevel() {
        return Level;
    }

    public String getTime() {
        return Time;
    }

    public Integer getAttendance() {
        return Attendance;
    }
}