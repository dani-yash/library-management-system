package ItemsData;

import RentingVisitorData.RentingVisitor;
import UserData.User;

public interface PhysicalItem {
    int getPrice();
    int getAmount();
    String getBarcode();
    public void accept(RentingVisitor rentingVisitor);
}
