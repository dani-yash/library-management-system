package UserData;

import java.util.ArrayList;
import java.util.List;

import ItemsData.Book;
import ItemsData.PhysicalItem;
import MenuOptions.ActionListenerCommand;
import MenuOptions.ActionView;
import NewsLetterSystem.NewsLetter;
import NotificationSystem.Notification;
import PaymentSystem.Payment;
import SystemInventory.LibraryManagementSystem;
import SystemInventory.PhysicalItemDetails;

public class User {
    private String email;
    private String password;
    private String priorityLevel;
    //private List<BorrowedItem> borrowedItems;
    private List<NewsLetter> subscribedNewsletters;
    private List<Payment> paymentDetails;
    private Notification notif;
    private NewsLetter news;

    private User user;
    private Book book;

    public User() {
        //borrowedItems = new ArrayList<>();
        subscribedNewsletters = new ArrayList<>();
        paymentDetails = new ArrayList<>();
    }

    public User(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Request(User user, Book book) {
        this.user = user;
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public static boolean register(String email, String password) {
        // Implementation of registration logic
//        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
//            return false;
//        }
        if (email.contains("@") && email.contains(".")) {
            return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}$");
        }
        return false; // Return true if registration is successful, false otherwise
    }

    public boolean login(String email, String password) {
        // Implementation of login logic
        return this.email.equals(email) && this.password.equals(password);// Return true if login is successful, false otherwise
    }

    public void logout() {
        // Implementation of logout logic
        System.exit(0);
    }

    public void searchBook(Book book) throws Exception {
        // Implementation of search book logic
        LibraryManagementSystem search = new LibraryManagementSystem();
        search.searchSimilarBooks(book);
    }

    public void requestNewBook(String type) throws Exception {
        // Implementation of request new book logic
        LibraryManagementSystem request = new LibraryManagementSystem();
        request.prioritizeRequests();
    }

    public void notifyPriority(String priority) throws Exception {
        // Implementation of notify priority logic
        LibraryManagementSystem notify = new LibraryManagementSystem();
        notify.notifyUserPriority(user, priorityLevel);
    }

    public void viewBorrowedItems() {
        // Implementation of view borrowed items logic
        PhysicalItemDetails borrowedItems = new PhysicalItemDetails();
        borrowedItems.checkAvailability();
    }

    public void viewDueDates() {
        // Implementation of view due dates logic
        PhysicalItemDetails dueDates = new PhysicalItemDetails();
        dueDates.getDueDate();
    }

    public void subscribeNewsletter(NewsLetter newsletter) {
        subscribedNewsletters.add(newsletter);
        // Implementation of subscribe newsletter logic
    }

    public void cancelSubscription(NewsLetter newsletter) {
        // Implementation of cancel subscription logic
        subscribedNewsletters.remove(newsletter);
    }

    public List<NewsLetter> viewSubscribedNewsletters() {
        // Implementation of view subscribed newsletters logic
        return subscribedNewsletters;
    }

    public void viewNewsletter(NewsLetter newsletter) {
        this.news = newsletter;
        // Implementation of read newsletter logic
    }
    public void viewNotification(Notification m) {
        this.notif = m;
    }
    public void closeNewsletter(NewsLetter newsletter) {
        this.news = newsletter;
        // implement closing gui
    }
    public void closeNotification(Notification m) {
        this.notif = m;
        // implement closing gui
    }
    public boolean makePayment(float amount, String paymentMethod) {
        // Implementation of make payment logic
        return true; // Return true if payment is successful, false otherwise
    }

    public void managePaymentDetails(Payment payment) {
        // Implementation of manage payment details logic
    }

    public boolean rentItem(PhysicalItem item) {
        // Implementation of rent item logic
        return true; // Return true if item is successfully rented, false otherwise
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }


    public void viewOverdueItems() {
        // Implementation of view overdue items logic
        PhysicalItemDetails overdueItems = new PhysicalItemDetails();
        overdueItems.isOverdue();
    }
}