package UserData;

import SystemInventory.LibraryManagementTeam;

import java.util.Scanner;

public abstract class Client extends User {
    private String id;

    private String userType;

    public Client(String email, String password, String type, String UserType) {
        super(email, password);
        this.id = type;
        this.userType = UserType;
    }

    public Client() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String type) {
        this.id = type;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String type) {
        this.userType = type;
    }

public void validateRegistration(String email, String Id, String userType) {
    if (this.getEmail() == null || this.getEmail().isEmpty() || this.getId() == null || this.getId().isEmpty() || this.getUserType() == null || this.getUserType().isEmpty()){
        throw new IllegalArgumentException("Email and password must not be null or empty");
    }
    LibraryManagementTeam verifyUser = new LibraryManagementTeam();
    if (verifyUser.verifyRegisteredUser(email, Id, userType)) {
        System.out.println("User has been registered as:" + " " + userType);
    } else {
        System.out.println("Registration has failed user is not in the system. Please contact the library management team.");
    }
}
}