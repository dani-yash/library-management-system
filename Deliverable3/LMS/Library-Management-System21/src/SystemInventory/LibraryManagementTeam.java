package SystemInventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class LibraryManagementTeam implements Subject{
    public static ArrayList<PhysicalItemDetails> items = new ArrayList<>();

    public static void resetItems() {
        items = new ArrayList<>();
    }

    public void addItem(PhysicalItemDetails item) {
        for (PhysicalItemDetails existingItem : items) {
            if (existingItem.getItemID() == item.getItemID()) {
                return;
            }
        }
        items.add(item);
    }

public void removeItem(int itemID) throws Exception {
    Iterator<PhysicalItemDetails> iterator = items.iterator();
    while (iterator.hasNext()) {
        PhysicalItemDetails item = iterator.next();
        if (item.getItemID() == itemID) {
            iterator.remove();
            return;
        }
    }
    throw new Exception("Item not found");
}

    public void enableItem(int itemID) throws Exception {
        for (PhysicalItemDetails item : items) {
            if (item.getItemID() == itemID) {
                item.setBorrowAbility(true);
                return;
            }
        }
        throw new Exception("Item not found");
    }

    public void disableItem(int itemID) throws Exception {
        for (PhysicalItemDetails item : items) {
            if (item.getItemID() == itemID) {
                item.setBorrowAbility(false);
                return;
            }
        }
        throw new Exception("Item not found");
    }

public void changeItemLocation(int itemID, String newLocation) throws Exception {
    for (PhysicalItemDetails item : items) {
        if (item.getItemID() == itemID) {
            item.setLocation(newLocation);
            return;
        }
    }
    throw new Exception("Item not found");
}

    public void changeItemId(int itemID, int newItemID) throws Exception {
        for (PhysicalItemDetails item : items) {
            if (item.getItemID() == itemID) {
                item.setItemID(newItemID);
                return;
            }
        }
        throw new Exception("Item not found");
    }

    public boolean verifyRegisteredUser(String email, String Id, String userType) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\\\Downloads\\\\Documents\\\\maven\\\\LMSN2\\\\Library-Management-System21\\\\src\\\\csv\\\\user_verification.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values[0].trim().equals(email) && values[1].trim().equals(Id) && values[2].equals(userType)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
