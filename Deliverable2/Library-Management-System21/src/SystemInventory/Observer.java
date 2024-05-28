package SystemInventory;

import ItemsData.Book;
import UserData.User;
import java.util.List;

public interface Observer {

    public void load(String path) throws Exception;

    public List<Book> searchSimilarBooks(Book inputBook);

    private boolean isSimilar(Book book1, Book book2) {
        // Define your similarity criteria here. For example:
        return book1.getAuthor().equals(book2.getAuthor()) && book1.getGenre().equals(book2.getGenre());
    }


    public void prioritizeRequests();

    public void notifyUserPriority(User user, String priority);

}
