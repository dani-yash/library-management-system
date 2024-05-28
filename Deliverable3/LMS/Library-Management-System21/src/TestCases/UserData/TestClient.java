package TestCases.UserData;

import UserData.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClient {
    private Client client;

    @BeforeEach
    void setUp() {
        client = new FacultyMember();
        client.setEmail("test@test.com");
        client.setPassword("password");
        client.setId("1");
        client.setUserType("User");
    }

    @Test
    void shouldReturnIdWhenGetIdCalled() {
        assertEquals("1", client.getId());
    }

    @Test
    void shouldReturnUserTypeWhenGetUserTypeCalled() {
        assertEquals("User", client.getUserType());
    }

    @Test
    void shouldSetIdWhenSetIdCalled() {
        client.setId("2");
        assertEquals("2", client.getId());
    }

    @Test
    void shouldSetUserTypeWhenSetUserTypeCalled() {
        client.setUserType("Admin");
        assertEquals("Admin", client.getUserType());
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            client.setEmail("");
            client.validateRegistration("", "1", "User");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyId() {
        assertThrows(IllegalArgumentException.class, () -> {
            client.setId("");
            client.validateRegistration("test@test.com", "", "User");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            client.setUserType("");
            client.validateRegistration("test@test.com", "1", "");
        });
    }

    @Test
    void printOutMessageOfValidateRegistrationWithValidData() {
        client.validateRegistration("test@test.com", "1", "Student");
    }

    @Test
    void printOutMessageOfValidateRegistrationWithInvalidData() {
        client.validateRegistration("testtest.com", "2", "FacultyMember");
    }
        @Test
        void shouldReturnEmailWhenGetEmailCalled() {
            assertEquals("test@test.com", client.getEmail());
        }

        @Test
        void shouldReturnPasswordWhenGetPasswordCalled() {
            assertEquals("password", client.getPassword());
        }

        @Test
        void shouldSetEmailWhenSetEmailCalled() {
            client.setEmail("new@test.com");
            assertEquals("new@test.com", client.getEmail());
        }

        @Test
        void shouldSetPasswordWhenSetPasswordCalled() {
            client.setPassword("newpassword");
            assertEquals("newpassword", client.getPassword());
        }

        @Test
        void shouldThrowExceptionWhenValidateRegistrationCalledWithNullEmail() {
            assertThrows(IllegalArgumentException.class, () -> {
                client.setEmail(null);
                client.validateRegistration(null, "1", "User");
            });
        }

        @Test
        void shouldThrowExceptionWhenValidateRegistrationCalledWithNullId() {
            assertThrows(IllegalArgumentException.class, () -> {
                client.setId(null);
                client.validateRegistration("test@test.com", null, "User");
            });
        }

        @Test
        void shouldThrowExceptionWhenValidateRegistrationCalledWithNullUserType() {
            assertThrows(IllegalArgumentException.class, () -> {
                client.setUserType(null);
                client.validateRegistration("test@test.com", "1", null);
            });
        }
}
