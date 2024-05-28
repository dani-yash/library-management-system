package TestCases.UserData;

import UserData.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }
    // Student tests
    @Test
    void shouldValidateRegistrationWhenCalledWithValidData() {
        student.setEmail("Student@test.com");
        student.setPassword("password");
        student.setUserType("student");
        student.setId("3");
        assertDoesNotThrow(() -> student.validateRegistration("Student@test.com", "3", "Student"));
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            student.validateRegistration("", "3", "Student");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyId() {
        assertThrows(IllegalArgumentException.class, () -> {
            student.validateRegistration("Student@test.com", "", "Student");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            student.validateRegistration("Student@test.com", "3", "");
        });
    }

    @Test
    void shouldReturnEmailWhenGetEmailCalled() {
        student.setEmail("student@test.com");
        assertEquals("student@test.com", student.getEmail());
    }

    @Test
    void shouldReturnPasswordWhenGetPasswordCalled() {
        student.setPassword("password");
        assertEquals("password", student.getPassword());
    }

    @Test
    void shouldSetEmailWhenSetEmailCalled() {
        student.setEmail("new@test.com");
        assertEquals("new@test.com", student.getEmail());
    }

    @Test
    void shouldSetPasswordWhenSetPasswordCalled() {
        student.setPassword("newpassword");
        assertEquals("newpassword", student.getPassword());
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            student.validateRegistration(null, "1", "Student");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            student.validateRegistration("student@test.com", null, "Student");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            student.validateRegistration("student@test.com", "1", null);
        });
    }
}
