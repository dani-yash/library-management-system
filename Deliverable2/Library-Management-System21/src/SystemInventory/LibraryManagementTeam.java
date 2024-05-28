package SystemInventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class LibraryManagementTeam implements Subject{
    private ArrayList<PhysicalItemDetails> items = new ArrayList<>();

    public void addItem(PhysicalItemDetails item) {
        items.add(item);
    }

    public void removeItem(int itemID) {
        Iterator<PhysicalItemDetails> iterator = items.iterator();
        while (iterator.hasNext()) {
            PhysicalItemDetails item = iterator.next();
            if (item.getItemID() == itemID) {
                iterator.remove();
                break;
            }
        }
    }

    public void enableItem(int itemID) {
        for (PhysicalItemDetails item : items) {
            if (item.getItemID() == itemID) {
                item.setBorrowAbility(true);
                break;
            }
        }
    }

    public void disableItem(int itemID) {
        for (PhysicalItemDetails item : items) {
            if (item.getItemID() == itemID) {
                item.setBorrowAbility(false);
                break;
            }
        }
    }

    public void changeItemLocation(int itemID, String newLocation) {
        // Assuming PhysicalItemDetails class has a setLocation method
    }

    public void changeItemId(int itemID, int newItemID) {
        for (PhysicalItemDetails item : items) {
            if (item.getItemID() == itemID) {
                item.setItemID(newItemID);
                break;
            }
        }
    }

    public boolean verifyRegisteredUser(String email, String Id, String userType) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("src/csv/user_verification.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values[0].equals(email) && values[1].equals(Id) && values[2].equals(userType)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
