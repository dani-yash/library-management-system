package TestCases.UserData;

import UserData.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestUser {
    private User user;

    @BeforeEach
    void setUp() {
        user = new User("test@test.com", "password");
    }

    @Test
    void shouldReturnEmailWhenGetEmailCalled() {
        assertEquals("test@test.com", user.getEmail());
    }

    @Test
    void shouldReturnPasswordWhenGetPasswordCalled() {
        assertEquals("password", user.getPassword());
    }

    @Test
    void shouldSetEmailWhenSetEmailCalled() {
        user.setEmail("new@test.com");
        assertEquals("new@test.com", user.getEmail());
    }

    @Test
    void shouldSetPasswordWhenSetPasswordCalled() {
        user.setPassword("newPassword");
        assertEquals("newPassword", user.getPassword());
    }

    @Test
    void shouldReturnTrueWhenRegisterCalledWithValidEmailAndPassword() {
        assertTrue(User.register("valid@test.com", "ValidPassword1!"));
    }

    @Test
    void shouldReturnFalseWhenRegisterCalledWithInvalidEmail() {
        assertFalse(User.register("invalid", "ValidPassword1!"));
    }

    @Test
    void shouldReturnFalseWhenRegisterCalledWithInvalidPassword() {
        assertFalse(User.register("valid@test.com", "invalid"));
    }

    @Test
    void shouldReturnTrueWhenLoginCalledWithCorrectEmailAndPassword() {
        assertTrue(user.login("test@test.com", "password"));
    }

    @Test
    void shouldReturnFalseWhenLoginCalledWithIncorrectEmail() {
        assertFalse(user.login("incorrect@test.com", "password"));
    }

    @Test
    void shouldReturnFalseWhenLoginCalledWithIncorrectPassword() {
        assertFalse(user.login("test@test.com", "incorrect"));
    }

    @Test
    void shouldReturnFalseWhenRegisterCalledWithPasswordWithoutUppercase() {
        assertFalse(User.register("valid@test.com", "validpassword1!"));
    }

    @Test
    void shouldReturnFalseWhenRegisterCalledWithPasswordWithoutLowercase() {
        assertFalse(User.register("valid@test.com", "VALIDPASSWORD1!"));
    }

    @Test
    void shouldReturnFalseWhenRegisterCalledWithPasswordWithoutNumbers() {
        assertFalse(User.register("valid@test.com", "ValidPassword!"));
    }

    @Test
    void shouldReturnFalseWhenRegisterCalledWithPasswordWithoutSpecialCharacters() {
        assertFalse(User.register("valid@test.com", "ValidPassword1"));
    }

    @Test
    void shouldReturnFalseWhenRegisterCalledWithPasswordLessThanEightCharacters() {
        assertFalse(User.register("valid@test.com", "Val1!"));
    }
}
