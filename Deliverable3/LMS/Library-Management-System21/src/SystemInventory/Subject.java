package SystemInventory;

import java.util.ArrayList;


public interface Subject {
    ArrayList<PhysicalItemDetails> items = new ArrayList<>();

    public void addItem(PhysicalItemDetails item);
    public void removeItem(int itemID) throws Exception;

    public void enableItem(int itemID) throws Exception;

    public void disableItem(int itemID) throws Exception;

    public void changeItemLocation(int itemID, String newLocation) throws Exception;

    public void changeItemId(int itemID, int newItemID) throws Exception;

    public boolean verifyRegisteredUser(String email, String Id, String userType);
}
