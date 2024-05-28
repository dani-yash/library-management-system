package NewsLetterSystem;

import java.util.List;

import UserData.User;

public interface NewsLetterInterface {
    void subscribe(User user, NewsLetter newsletter);
    void cancelSubscription(User user, NewsLetter newsletter);
    List<NewsLetter> viewSubscriptions(User user);
    void viewNewsletter(User user, NewsLetter newsletter);

}
