package MenuOptions;

import NewsLetterSystem.NewsLetter;
import NotificationSystem.Notification;

public class ActionClose implements ActionListenerCommand{
    private NewsLetter newsClose;
    private Notification notifClose;
    public ActionClose(NewsLetter news) {
        this.newsClose = news;
    }
    public ActionClose(Notification notif) {
        this.notifClose = notif;
    }
    @Override
    public void execute() {
        if (newsClose != null) {
            newsClose.close();
        }
        if (notifClose != null) {
            notifClose.close();
        }
    }

}
