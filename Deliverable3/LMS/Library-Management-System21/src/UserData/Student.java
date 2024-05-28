package UserData;

public class Student extends Client{
    public Student() {
        super();
    }

    public void validateRegistration(String email, String Id, String userType){
        super.validateRegistration(email, Id, userType);
    }
}