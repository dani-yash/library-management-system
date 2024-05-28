package NotificationSystem;

import UserData.User;

public class NotificationSystem implements NotificationInterface {
    public void sendNotification(User user, Notification m) {
        user.viewNotification(m);
        // Implementation to send a general notification to the user
        // Example: Send notification through email, SMS, etc.
    }

    public void notifyOverdueBooks(User user) {
        // Implementation to notify the user about overdue books
        // Example: Send a notification listing the overdue books to the user
    }
}
