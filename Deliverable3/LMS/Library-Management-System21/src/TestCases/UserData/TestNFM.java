package TestCases.UserData;

import UserData.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestNFM {
    private NonFaculty nonFaculty;

    @BeforeEach
    void setUp() {
        nonFaculty = new NonFaculty();
    }

    @Test
    void shouldValidateRegistrationWhenCalledWithValidData() {
        nonFaculty.setEmail("Non-faculty@test.com");
        nonFaculty.setPassword("password");
        nonFaculty.setUserType("Non-Faculty");
        nonFaculty.setId("2");
        assertDoesNotThrow(() -> nonFaculty.validateRegistration("Non-faculty@test.com", "2", "Non-Faculty"));
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            nonFaculty.validateRegistration("", "2", "Non-Faculty");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyId() {
        assertThrows(IllegalArgumentException.class, () -> {
            nonFaculty.validateRegistration("Non-faculty@test.com", "", "Non-Faculty");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            nonFaculty.validateRegistration("Non-faculty@test.com", "1", "");
        });
    }

    @Test
    void shouldReturnEmailWhenGetEmailCalled() {
        nonFaculty.setEmail("nonfaculty@test.com");
        assertEquals("nonfaculty@test.com", nonFaculty.getEmail());
    }

    @Test
    void shouldReturnPasswordWhenGetPasswordCalled() {
        nonFaculty.setPassword("password");
        assertEquals("password", nonFaculty.getPassword());
    }

    @Test
    void shouldSetEmailWhenSetEmailCalled() {
        nonFaculty.setEmail("new@test.com");
        assertEquals("new@test.com", nonFaculty.getEmail());
    }

    @Test
    void shouldSetPasswordWhenSetPasswordCalled() {
        nonFaculty.setPassword("newpassword");
        assertEquals("newpassword", nonFaculty.getPassword());
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            nonFaculty.validateRegistration(null, "1", "Non-Faculty");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            nonFaculty.validateRegistration("nonfaculty@test.com", null, "Non-Faculty");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            nonFaculty.validateRegistration("nonfaculty@test.com", "1", null);
        });
    }
}
