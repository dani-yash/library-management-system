package TestCases.UserData;

import UserData.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestUF {
    private UserFactory userFactory;

    @BeforeEach
    void setUp() {
        userFactory = new UserFactory();
    }

    @Test
    void shouldReturnStudentWhenCreateUserCalledWithStudentType() {
        assertTrue(userFactory.createuser("Student") instanceof Student);
    }

    @Test
    void shouldReturnNonFacultyWhenCreateUserCalledWithNonFacultyType() {
        assertTrue(userFactory.createuser("NonFaculty") instanceof NonFaculty);
    }

    @Test
    void shouldReturnVisitorWhenCreateUserCalledWithVisitorType() {
        assertTrue(userFactory.createuser("Visitor") instanceof Visitor);
    }

    @Test
    void shouldReturnFacultyMemberWhenCreateUserCalledWithFacultyMemberType() {
        assertTrue(userFactory.createuser("FacultyMember") instanceof FacultyMember);
    }

    @Test
    void shouldReturnNullWhenCreateUserCalledWithInvalidType() {
        assertNull(userFactory.createuser("InvalidType"));
    }

    @Test
    void shouldReturnNullWhenCreateUserCalledWithNullType() {
        assertNull(userFactory.createuser(null));
    }

    @Test
    void shouldReturnNullWhenCreateUserCalledWithEmptyType() {
        assertNull(userFactory.createuser(""));
    }

    @Test
    void shouldReturnNullWhenCreateUserCalledWithSpacesType() {
        assertNull(userFactory.createuser("   "));
    }

    @Test
    void shouldReturnNullWhenCreateUserCalledWithSpecialCharactersType() {
        assertNull(userFactory.createuser("@#$%"));
    }

    @Test
    void shouldReturnNullWhenCreateUserCalledWithNumbersType() {
        assertNull(userFactory.createuser("1234"));
    }

    @Test
    void shouldReturnNullWhenCreateUserCalledWithMixedCharactersType() {
        assertNull(userFactory.createuser("Stu@#123"));
    }
}
