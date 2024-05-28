package SystemInventory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import ItemsData.Book;
import UserData.User;
import com.csvreader.CsvReader;
import NotificationSystem.Notification;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class LibraryManagementSystem implements Observer {
    //private Map<Course, List<Book>> courseTextbooks;
    //private List<Request> bookRequests;
    public String path;
    public ArrayList<Book> books = new ArrayList<Book>();
    private JTextField titleField;
    private JTextField authorField;
    private JTextField genreField;
    private JTextField searchField;
    private JButton searchButton;
    public JTextArea resultArea;

    // Constructor and other methods of LibraryManagementSystem class

    public LibraryManagementSystem() throws Exception {
        String path = "D:\\\\Downloads\\\\Documents\\\\maven\\\\LMSN2\\\\Library-Management-System21\\\\src\\\\csv\\\\books.csv";
        this.path = path;
        this.load(path);

        // Create UI components
        titleField = new JTextField(10);
        authorField = new JTextField(10);
        genreField = new JTextField(10);
        searchField = new JTextField(10);
        searchButton = new JButton("Search Similar Books");
        resultArea = new JTextArea(10, 10);
        resultArea.setEditable(false);

        // Add action listener to the search button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                String genre = genreField.getText();
                String search = searchField.getText();
                Book inputBook = new Book(0, 0, "#");
                inputBook.setTitle(title);
                inputBook.setAuthor(author);
                inputBook.setGenre(genre);
                inputBook.setTitle(search);
                List<Book> similarBooks = searchSimilarBooks(inputBook);
                displayResults(similarBooks);
            }
        });

        // Create main panel and add components
        JPanel panelMain = new JPanel(new GridLayout(5, 1));
        panelMain.add(new JLabel("Title:"));
        panelMain.add(titleField);
        panelMain.add(new JLabel("Author:"));
        panelMain.add(authorField);
        panelMain.add(new JLabel("Genre:"));
        panelMain.add(genreField);
        panelMain.add(searchButton);
        panelMain.add(new JScrollPane(resultArea));
        //JPanel panelMain = new JPanel(new BorderLayout());
        //panelMain.add(searchField, BorderLayout.NORTH);
        //panelMain.add(searchButton, BorderLayout.CENTER);
        //panelMain.add(new JScrollPane(resultArea), BorderLayout.SOUTH);

        // Create frame and add main panel
        JFrame frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panelMain);
        frame.pack();
        frame.setVisible(true);
    }

    public void displayResults(List<Book> books) {
        resultArea.setText(""); // Clear previous results
        for (Book book : books) {
            resultArea.append(book.getTitle() + " by " + book.getAuthor() + "\n");
        }
    }

    public void load(String path) throws Exception {
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while (reader.readRecord()) {
            Book book = new Book(0,0, "#");
            //title,author,genre
            book.setTitle(reader.get("Title"));
            book.setAuthor(reader.get("Author"));
            book.setGenre(reader.get("Genre"));
            books.add(book);
        }
    }

    public List<Book> searchSimilarBooks(Book inputBook) {
        // Implementation to search for similar books based on given book
        // This method would return a list of similar books
        List<Book> similarBooks = new ArrayList<>();
        try {
            CsvReader books = new CsvReader(path);
            books.readHeaders();

            while (books.readRecord()) {
                Book book = new Book(0,0,"#");
                book.setTitle(books.get("Title"));
                book.setAuthor(books.get("Author"));
                book.setGenre(books.get("Genre"));
                // Add other attributes as necessary...

                if (isSimilar(inputBook, book)) {
                    similarBooks.add(book);
                }
            }

            books.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return similarBooks;
    }

    public boolean isSimilar(Book book1, Book book2) {
        // Define your similarity criteria here. For example:
        return book1.getAuthor().equals(book2.getAuthor()) && book1.getGenre().equals(book2.getGenre());
    }


    public void prioritizeRequests() {
        // Implementation to prioritize book requests based on some criteria
        // This method would modify the order of book requests
     /*
        Collections.sort(bookRequests, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                // Define your comparison criteria here. For example:
                return user1.getPriorityLevel().compareTo(user2.getPriorityLevel());

            }
        });
      */

    }

    public void notifyUserPriority(User user, String priority) {
        // Implementation to notify a user about their priority in the request queue
        // This method would notify the user about their priority
        Notification notif = new Notification(priority);
        System.out.println("Dear " + user.getEmail() + ", your current priority is: " + notif.getMessage());
    }
}