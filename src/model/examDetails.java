package model;

import java.sql.Date;

public class examDetails {
    int examId;
    String examName;
    String subject;
    Date date;
    String type;
    String lecturer;

    public examDetails(int examId, String examName, String subject, Date date,String type, String lecturer) {
        this.examId = examId;
        this.examName = examName;
        this.subject = subject;
        this.date = date;
        this.type = type;
        this.lecturer = lecturer;
    }

    public examDetails(String examName, String subject, Date date,String type, String lecturer) {
        this.examName = examName;
        this.subject  =subject;
        this.date = date;
        this.type=type;
        this.lecturer = lecturer;
    }

    public examDetails(int examId, String examName) {
        this.examId = examId;
        this.examName=examName;

    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}

