package ItemsData;

import RentingVisitorData.RentingVisitor;
import UserData.User;

public class Book implements PhysicalItem {
    private int price;
    private int amount;
    private String barcode;
    private String title;
    private String author;
    private String genre;

    public Book(int price, int amount, String barcode) {
        this.price = price;
        this.amount = amount;
        this.barcode = barcode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void accept(RentingVisitor rentingVisitor) {
        rentingVisitor.visitBook(this);
    }

}