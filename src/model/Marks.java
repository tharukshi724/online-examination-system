package model;

public class Marks {

    int markId;
    String studentId;
    int marks;
    String grade;

    public Marks(int markId,String studentId, int marks,String grade) {
        this.markId = markId;
        this.studentId = studentId;
        this.marks = marks;
        this.grade = grade;
    }

    public Marks(String studentId, String grade) {
        this.studentId = studentId;
        this.grade = grade;
    }

    public Marks(int markId, String studentId,String grade) {
        this.markId = markId;
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
