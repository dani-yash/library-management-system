package SystemInventory;

import java.util.ArrayList;


public interface Subject {
    ArrayList<PhysicalItemDetails> items = new ArrayList<>();

    public void addItem(PhysicalItemDetails item);
    public void removeItem(int itemID);

    public void enableItem(int itemID);

    public void disableItem(int itemID);

    public void changeItemLocation(int itemID, String newLocation);

    public void changeItemId(int itemID, int newItemID);

    public boolean verifyRegisteredUser(String email, String Id, String userType);
}
