package sample;

public class Tutor {
    private String tutorId;
    private String name;
    private String email;
    private String phone;

    public Tutor(){

    }

    public Tutor(String tutorId, String name, String email, String phone){
        this.tutorId=tutorId;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTutorId() {
        return tutorId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}

