package TestCases.NotificationSystem;
import NotificationSystem.*;
import UserData.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestNotificationSystem {
	NotificationSystem nS = new NotificationSystem();
	Notification notif;
	User use = new User();
	@BeforeEach
	void setup() {
		use = new User("atest@gmail.com", "tesT@132");
		Notification notif = new Notification("message");
	}
	@Test
	void testSend() {
		nS.sendNotification(use, notif);
	}
	@Test
	void testOverdue() {
		nS.notifyOverdueBooks(use);
	}
	
}
