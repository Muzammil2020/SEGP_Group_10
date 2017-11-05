package sample;

public class Group {
    private String rollNo;
    private String name;
    private String programme;
    private String email;
    private String year;
    private String tutorId;
    private String groupName;
    private String tutorName;

    public Group(String rollNo, String name, String programme, String email, String year, String tutorId, String groupName) {
        this.rollNo = rollNo;
        this.name = name;
        this.programme = programme;
        this.email = email;
        this.year = year;
        this.tutorId = tutorId;
        this.groupName = groupName;
    }

    public Group(String groupName){
        this.tutorName=tutorName;
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

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
