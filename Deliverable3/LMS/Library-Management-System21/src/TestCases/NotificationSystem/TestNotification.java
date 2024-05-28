package TestCases.NotificationSystem;
import NotificationSystem.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestNotification {
	Notification n;
	@BeforeEach
	void setup() {
		n = new Notification("message");
	}
	@Test
	void checkTrue() {
		assertEquals(n.getMessage(), "message");
	}
	@Test
	void checkFalse() {
		assertNotEquals(n.getMessage(), "");
	}
	@Test
	void checkViewClose() {
		// this doesn't do anything because not implemented
		n.view();
		n.close();
	}
}
