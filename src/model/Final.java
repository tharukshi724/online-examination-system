package model;

public class Final {

    int fquestionId;
    int fexamId;
    String subject;
    String fquestion;

    String fcorrectAns;

    public Final(int fquestionId, int fexamId, String subject,String fquestion, String fcorrectAns) {
        this.fquestionId = fquestionId;
        this.fexamId = fexamId;
        this.subject=subject;
        this.fquestion = fquestion;
        this.fcorrectAns = fcorrectAns;
    }

    public Final(int fexamId, String subject,String fquestion, String fcorrectAns) {
        this.fexamId = fexamId;

        this.subject = subject;
        this.fquestion = fquestion;
        this.fcorrectAns = fcorrectAns;
    }

    public Final(String fquestion) {
        this.fquestion = fquestion;
    }

    public int getFquestionId() {
        return fquestionId;
    }

    public void setFquestionId(int fquestionId) {
        this.fquestionId = fquestionId;
    }

    public int getFexamId() {
        return fexamId;
    }

    public void setFexamId(int fexamId) {
        this.fexamId = fexamId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFquestion() {
        return fquestion;
    }

    public void setFquestion(String fquestion) {
        this.fquestion = fquestion;
    }

    public String getFcorrectAns() {
        return fcorrectAns;
    }

    public void setFcorrectAns(String fcorrectAns) {
        this.fcorrectAns = fcorrectAns;
    }
}
