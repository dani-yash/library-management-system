package ItemsData;

import RentingVisitorData.RentingVisitor;
import UserData.User;

public class Magazine implements PhysicalItem{
    private int price;
    private int amount;
    private String barcode;

    public Magazine(int price, int amount, String barcode) {
        this.price = price;
        this.amount = amount;
        this.barcode = barcode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void accept(RentingVisitor rentingVisitor) {
        rentingVisitor.visitMagazine(this);
    }
    
}
