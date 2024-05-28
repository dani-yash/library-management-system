package NewsLetterSystem;

import UserData.User;

import java.util.ArrayList;
import java.util.List;

public class NewsLetterSystem {
    List<NewsLetter> newsLetterList = new ArrayList<NewsLetter>();
    User userA;
    public void subscribe(User user, NewsLetter news) {
        newsLetterList.add(news);
        user.subscribeNewsletter(news);
    }
    public void cancelSubscription(User user, NewsLetter news) {
        newsLetterList.remove(news);
        user.cancelSubscription(news);
    }
    public List<NewsLetter> viewSubscriptions(User user) {
        return newsLetterList;
    }
    public void viewNewsLetter(User user, NewsLetter news) {
        user.viewNewsletter(news);
    }
}
