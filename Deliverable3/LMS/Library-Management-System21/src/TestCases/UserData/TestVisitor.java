package TestCases.UserData;

import UserData.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestVisitor {
    private Visitor visitor;

    @BeforeEach
    void setUp() {
        visitor = new Visitor();
    }

    @Test
    void shouldValidateRegistrationWhenCalledWithValidData3() {
        visitor.setEmail("visitor@test.com");
        visitor.setPassword("password");
        visitor.setUserType("visitor");
        visitor.setId("4");
        assertDoesNotThrow(() -> visitor.validateRegistration("visitor@test.com", "4", "visitor"));
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyEmail4() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration("", "4", "visitor");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyId3() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration("visitor@test.com", "", "visitor");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithEmptyUserType4() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration("visitor@test.com", "4", "");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration(null, "4", "visitor");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration("visitor@test.com", null, "visitor");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNullUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration("visitor@test.com", "4", null);
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration("invalidEmail", "4", "visitor");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithNonNumericId() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration("visitor@test.com", "nonNumericId", "visitor");
        });
    }

    @Test
    void shouldThrowExceptionWhenValidateRegistrationCalledWithInvalidUserType() {
        assertThrows(IllegalArgumentException.class, () -> {
            visitor.validateRegistration("visitor@test.com", "4", "invalidUserType");
        });
    }
}
