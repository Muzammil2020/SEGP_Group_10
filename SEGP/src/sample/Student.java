package sample;


public class Student {

    private String rollNo;
    private String name;
    private String programme;
    private String email;
    private String year;

    public Student(){

    }

    public Student(String rollNo, String name, String programme, String email, String year){
        this.rollNo=rollNo;
        this.name=name;
        this.programme=programme;
        this.email=email;
        this.year=year;
    }


    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProgramme() {
        return programme;
    }
    public void setProgramme(String programme) {
        this.programme = programme;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

}

