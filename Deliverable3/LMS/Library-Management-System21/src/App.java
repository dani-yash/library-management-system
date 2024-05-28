import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import ItemsData.Book;
import ItemsData.PhysicalItem;
import NewsLetterSystem.*;
import SystemInventory.LibraryManagementSystem;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import UserData.User;

public class App {

    private JFrame frame;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JComboBox<String> clientTypeComboBox;

    public App() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Library Management System - Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel registrationPanel = new JPanel(new GridLayout(0, 2));

        // Add components for registration form
        registrationPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        registrationPanel.add(emailField);

        registrationPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        registrationPanel.add(passwordField);

        registrationPanel.add(new JLabel("Client Type:"));
        clientTypeComboBox = new JComboBox<>(new String[]{"Student", "Faculty", "Non-Faculty Staff", "Visitor"});
        registrationPanel.add(clientTypeComboBox);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    attemptRegistration();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        registrationPanel.add(registerButton);

        frame.add(registrationPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    private void attemptRegistration() throws IOException {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String clientType = (String) clientTypeComboBox.getSelectedItem();

        User user = new User(email, password);

        CsvWriter csvOutput = new CsvWriter(new FileWriter("src/csv/user.csv", false), ',');

        // Validate email and password (methods to be implemented)
        if (user.register(email, password)) {
            int input = JOptionPane.showConfirmDialog(frame, "Registration successful! Do you want to login now?", "Registration", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            // Save the user data to CSV
            csvOutput.write("email");
            csvOutput.write("password");
            csvOutput.endRecord();

            csvOutput.write(user.getEmail());
            csvOutput.write(user.getPassword());
            csvOutput.endRecord();

            csvOutput.close();

            if (input == JOptionPane.YES_OPTION) {
                frame.dispose(); // Dispose the registration window
                showLoginForm(); // Show the login form
            }

        }
        else {
            JOptionPane.showMessageDialog(frame, "Invalid email or password. Please try again.", "Registration Error", JOptionPane.ERROR_MESSAGE);
        }

}

    private void showLoginForm() {
        frame = new JFrame("Library Management System - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel loginPanel = new JPanel(new GridLayout(0, 2));

        loginPanel.add(new JLabel("Email:"));
        JTextField loginEmailField = new JTextField();
        loginPanel.add(loginEmailField);

        loginPanel.add(new JLabel("Password:"));
        JPasswordField loginPasswordField = new JPasswordField();
        loginPanel.add(loginPasswordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Bypass validation and proceed to main page for now (validateLogin method)
                JOptionPane.showMessageDialog(frame, "Login successful!", "Login", JOptionPane.INFORMATION_MESSAGE);
                frame.dispose(); // Close the login window
                showMainPage(); // Show the main application page (to be implemented)
            }
        });

        loginPanel.add(loginButton);

        frame.add(loginPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Placeholder for the main page method
    private void showMainPage() {
        frame = new JFrame("Library Management System - Main Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1)); // Updated for 4 options

        JButton rentItemButton = new JButton("Rent a Physical Item");
        rentItemButton.addActionListener(e -> showSearchPage("Rent Item"));

        JButton openBookButton = new JButton("Open an Online Book");
        openBookButton.addActionListener(e -> showSearchPage("Open Book"));

        JButton subscribeNewsletterButton = new JButton("Subscribe to Newsletter");
        subscribeNewsletterButton.addActionListener(e -> showSearchPage("Subscribe Newsletter"));

        // New button for viewing currently rented books
        JButton viewRentedBooksButton = new JButton("View Currently Rented Books");
        viewRentedBooksButton.addActionListener(e -> showRentedBooks());

        frame.add(rentItemButton);
        frame.add(openBookButton);
        frame.add(subscribeNewsletterButton);
        frame.add(viewRentedBooksButton); // Add the new button to the frame

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void showRentedBooks() {
        // Mock data for rented books
        List<Book> rentedBooks = Arrays.asList(
                new Book(10, 5, "Book 1"), // Assuming the constructor Book(title, id, price, dueDate)
                new Book(15, 10, "Book 2"),
                new Book(20, 15, "Book 3")
        );

        JFrame rentedBooksFrame = new JFrame("Currently Rented Books");
        rentedBooksFrame.setLayout(new BorderLayout());
        JPanel booksPanel = new JPanel();
        booksPanel.setLayout(new BoxLayout(booksPanel, BoxLayout.Y_AXIS));

        for (Book book : rentedBooks) {
            JLabel bookLabel = new JLabel(book.getBarcode() + " - Due Date: 22 March 2025");
            booksPanel.add(bookLabel);
        }

        rentedBooksFrame.add(new JScrollPane(booksPanel), BorderLayout.CENTER); // Make the panel scrollable

        rentedBooksFrame.pack();
        rentedBooksFrame.setLocationRelativeTo(null);
        rentedBooksFrame.setVisible(true);
    }



    private void showSearchPage(String action) {
        frame = new JFrame("Search Page - " + action);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField searchField = new JTextField();
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(e -> performSearch(searchField.getText(), action));

        frame.add(searchField, BorderLayout.NORTH);
        frame.add(searchButton, BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void performSearch(String query, String searchType) {
        System.out.println("Search Query: " + query + ", Action: " + searchType);

        JPanel resultsPanel = new JPanel();
        resultsPanel.setLayout(new BoxLayout(resultsPanel, BoxLayout.Y_AXIS));

        frame.getContentPane().removeAll(); // Clear previous content
        frame.setLayout(new BorderLayout()); // Reset layout for results display

        // Mock data for PhysicalItems and Newsletters
        java.util.List<PhysicalItem> mockPhysicalItems = Arrays.asList(
                new Book(25, 1, "Mock Book 1"),
                new Book(35, 6, "Mock Book 2"),
                new Book(15, 5, "Mock Book 3")
        );
        List<NewsLetter> mockNewsletters = Arrays.asList(
                new NewsLetter("Mock NewsLetter 1", "Daily updates"),
                new NewsLetter("Mock NewsLetter 2", "Weekly insights"),
                new NewsLetter("Mock NewsLetter 3", "Monthly summaries")
        );

        switch (searchType) {
            case "Rent Item":
                for (PhysicalItem item : mockPhysicalItems) {
                    JPanel itemPanel = new JPanel();
                    itemPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
                    itemPanel.add(new JLabel(item.getBarcode()));

                    JButton rentButton = new JButton("Rent");
                    rentButton.addActionListener(e -> {
                        User user = new User(); // Assume this is the logged-in user
                        if (user.rentItem(item)) {
                            showPaymentPage(item.getBarcode(), item.getPrice());
                        }
                    });
                    itemPanel.add(rentButton);
                    resultsPanel.add(itemPanel);
                }
                break;
            case "Open Book":
                try {
                    new LibraryManagementSystem(); // This will display the Library Management System UI for Open Book
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Failed to open the book management system.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Subscribe Newsletter":
                for (NewsLetter news : mockNewsletters) {
                    JPanel newsPanel = new JPanel();
                    newsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
                    newsPanel.add(new JLabel(news.getTitle()));

                    JButton subscribeButton = new JButton("Subscribe");
                    subscribeButton.addActionListener(e -> {
                        User user = new User(); // Assume this is the logged-in user
                        NewsLetterSystem newsletterSystem = new NewsLetterSystem();
                        newsletterSystem.subscribe(user, news);
                        news.setRent(5);
                        showPaymentPage(news.getTitle(), news.getRent());
                    });
                    newsPanel.add(subscribeButton);
                    resultsPanel.add(newsPanel);
                }
                break;
        }

        frame.add(new JScrollPane(resultsPanel), BorderLayout.CENTER); // Ensure the results are scrollable

        frame.pack();
        frame.revalidate();
        frame.repaint();
    }

        // JOptionPane.showMessageDialog(frame, "Proceed to payment of $" + amount);
        private void showPaymentPage(String itemName, int price) {
            JDialog paymentDialog = new JDialog(frame, "Payment", true);
            paymentDialog.setLayout(new GridLayout(0, 2));

            paymentDialog.add(new JLabel("Item: " + itemName));
            paymentDialog.add(new JLabel("Price: $" + price));
            JTextField nameOnCardField = new JTextField();
            JTextField cardNumberField = new JTextField();
            JTextField expiryDateField = new JTextField();
            JTextField cvvField = new JTextField();

            paymentDialog.add(new JLabel("Name on Card:"));
            paymentDialog.add(nameOnCardField);
            paymentDialog.add(new JLabel("Card Number:"));
            paymentDialog.add(cardNumberField);
            paymentDialog.add(new JLabel("Expiry Date:"));
            paymentDialog.add(expiryDateField);
            paymentDialog.add(new JLabel("CVV:"));
            paymentDialog.add(cvvField);

            JButton payButton = new JButton("Pay");
            payButton.addActionListener(e -> {

                // validate input and handle payment processing

                // Save payment details to CSV

                JOptionPane.showMessageDialog(paymentDialog, "Payment successful!");
                paymentDialog.dispose();
                showMainPage(); // Redirect back to the main page
            });

            paymentDialog.add(payButton);
            paymentDialog.setSize(400, 200);
            paymentDialog.setLocationRelativeTo(frame);
            paymentDialog.setVisible(true);
        }



//    private boolean validateLogin(String email, String password) throws IOException {
//        CsvReader reader = new CsvReader(new FileReader("src/csv/user.csv"));
//        String line;
//        while ((line = String.valueOf(reader.readRecord())) != null) {
//            String[] userDetails = line.split(","); // Assuming CSV values are separated by commas
//            if (userDetails.length > 1 && userDetails[0].equals(email) && userDetails[1].equals(password)) {
//                return true;
//            }
//        }
//        return false;
//    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}
