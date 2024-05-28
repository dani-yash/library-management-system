package UserData;

public class Visitor extends Client {
    public Visitor() {
        super();
    }

    public void validateRegistration(String email, String Id, String userType){
        super.validateRegistration(email, Id, userType);
    }
}