package SystemInventory;

import ItemsData.Book;
import UserData.User;
import java.util.List;

public interface Observer {

    public void load(String path) throws Exception;

    public List<Book> searchSimilarBooks(Book inputBook);

    public boolean isSimilar(Book book1, Book book2);


    public void prioritizeRequests();

    public void notifyUserPriority(User user, String priority);

}
