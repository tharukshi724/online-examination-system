package model;

public class student {

    String sUserId;
    String firstname;
    String lastname;
    String studentId;

    String username;
    String password;

    public student(String sUserId, String firstname, String lastname, String studentId, String username, String password) {
        this.sUserId = sUserId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.username = username;
        this.password = password;
    }

    public student(String firstname, String lastname, String studentId, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.username = username;
        this.password = password;
    }

    public String getsUserId() {
        return sUserId;
    }

    public void setsUserId(String sUserId) {
        this.sUserId = sUserId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
