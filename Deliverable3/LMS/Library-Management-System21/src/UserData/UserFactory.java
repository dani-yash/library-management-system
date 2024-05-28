package UserData;

public class UserFactory {
    public User createuser(String type){
        if(type == null){
            return null;
        }
        return switch (type) {
            case "Student" -> new Student();
            case "NonFaculty" -> new NonFaculty();
            case "Visitor" -> new Visitor();
            case "FacultyMember" -> new FacultyMember();
            default -> null;
        };
    }
}