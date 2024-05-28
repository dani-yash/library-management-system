package TestCases.UserData;

import UserData.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFM {
    private FacultyMember facultyMember;

    @BeforeEach
    void setUp() {
        facultyMember = new FacultyMember();
    }

    @Test
    void shouldValidateRegistrationWhenCalledWithValidData() {
        facultyMember.setEmail("faculty@test.com");
        facultyMember.setPassword("password");
        facultyMember.setUserType("Faculty");
        facultyMember.setId("1");
        assertDoesNotThrow(() -> facultyMember.validateRegistration("faculty@test.com", "1", "Faculty"));
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            facultyMember.validateRegistration("", "1", "Faculty");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyId() {
        assertThrows(IllegalArgumentException.class, () -> {
            facultyMember.validateRegistration("faculty@test.com", "", "Faculty");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            facultyMember.validateRegistration("faculty@test.com", "1", "");
        });
    }

    @Test
    void shouldReturnEmailWhenGetEmailCalled() {
        facultyMember.setEmail("faculty@test.com");
        assertEquals("faculty@test.com", facultyMember.getEmail());
    }

    @Test
    void shouldReturnPasswordWhenGetPasswordCalled() {
        facultyMember.setPassword("password");
        assertEquals("password", facultyMember.getPassword());
    }

    @Test
    void shouldSetEmailWhenSetEmailCalled() {
        facultyMember.setEmail("new@test.com");
        assertEquals("new@test.com", facultyMember.getEmail());
    }

    @Test
    void shouldSetPasswordWhenSetPasswordCalled() {
        facultyMember.setPassword("newpassword");
        assertEquals("newpassword", facultyMember.getPassword());
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            facultyMember.validateRegistration(null, "1", "Faculty");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            facultyMember.validateRegistration("faculty@test.com", null, "Faculty");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            facultyMember.validateRegistration("faculty@test.com", "1", null);
        });
    }
}
