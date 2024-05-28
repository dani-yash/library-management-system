package NotificationSystem;

import UserData.User;

public interface NotificationInterface {
     void sendNotification(User user, Notification message);
}
