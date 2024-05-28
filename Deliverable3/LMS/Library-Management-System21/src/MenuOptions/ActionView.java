package MenuOptions;

import NewsLetterSystem.NewsLetter;
import NotificationSystem.Notification;

public class ActionView implements ActionListenerCommand{
    private NewsLetter newsView;
    private Notification notifView;
    public ActionView(NewsLetter news) {
        this.newsView = news;
    }
    public ActionView(Notification notif) {
        this.notifView = notif;
    }
    @Override
    public void execute() {
        if (newsView != null) {
            newsView.view();
        }
        if (notifView != null) {
            notifView.view();
        }
    }
    
}
