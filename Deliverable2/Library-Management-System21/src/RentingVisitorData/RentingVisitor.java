package RentingVisitorData;
import ItemsData.*;

public interface RentingVisitor {
    public void visitBook(Book book);
    public void visitMagazine(Magazine mag);
    public void visitCD(CD cd);
}