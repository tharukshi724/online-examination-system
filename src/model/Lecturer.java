package model;

public class Lecturer {

    int userId;
    String staffId;
    String NIC;
    String name;
    String section;
    String email;
    String username;
    String password;


    public Lecturer(int userId, String staffId, String NIC, String name, String section, String email, String username, String password) {
        this.userId = userId;
        this.staffId = staffId;
        this.NIC = NIC;
        this.name = name;
        this.section = section;
        this.email = email;
        this.username = username;
        this.password = password;
    }



    public Lecturer(String staffId, String NIC, String name, String section, String email, String username, String password) {
        this.staffId = staffId;
        this.NIC = NIC;
        this.name = name;
        this.section = section;
        this.email = email;
        this.username = username;
        this.password = password;

    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
