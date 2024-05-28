package RentingVisitorData;
import ItemsData.*;
public class RentingInquiryVisitor implements RentingVisitor {
    private String bookBarcode;
    private int bookAmount;
    private int bookPrice;
    private String magazineBarcode;
    private int magazineAmount;
    private int magazinePrice;
    private String cdBarcode;
    private int cdAmount;
    private int cdPrice;

    public RentingInquiryVisitor() {
        bookBarcode = "";
        bookAmount = 0;
        bookPrice = 0;
        magazineBarcode = "";
        magazineAmount = 0;
        bookPrice = 0;
        cdBarcode = "";
        cdAmount = 0;
        bookPrice = 0;
    }

    public void visitBook(Book book) {
        bookBarcode = book.getBarcode();
        bookAmount = book.getAmount();
        bookPrice = book.getPrice();

    }

    public void visitMagazine(Magazine magazine) {
        magazineBarcode = magazine.getBarcode();
        magazineAmount = magazine.getAmount();
        magazinePrice = magazine.getPrice();
    }

    public void visitCD(CD cd) {
        cdBarcode = cd.getBarcode();
        cdAmount = cd.getAmount();
        cdPrice = cd.getPrice();
    }

    public String displayRentingInquiry() {
        String inquiry = "";
        inquiry += "Renting inquiry for account: \n";
        inquiry +="\n";
        inquiry += "Number of Books: " + bookAmount + "\n";
        inquiry += "Book Barcode: " + bookBarcode + "\n";
        inquiry += "Book Total Price :  " + bookPrice + "\n";
        inquiry += "\n";
        inquiry += "Number of Magazines: " + magazineAmount + "\n";
        inquiry += "Magzine Barcode: " + magazineBarcode + "\n";
        inquiry += "Magzine Total Price :  " + magazinePrice + "\n";
        inquiry += "\n";
        inquiry += "Number of CDs: " + cdAmount + "\n";
        inquiry += "CD Barcode: " + cdBarcode + "\n";
        inquiry += "CD Total Price :  " + cdPrice + "\n";
        return inquiry;
    }
}