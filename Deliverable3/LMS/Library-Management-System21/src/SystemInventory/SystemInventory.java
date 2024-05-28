package SystemInventory;

import java.util.List;

public class SystemInventory {
    public static List<PhysicalItemDetails> itemList;

    public SystemInventory(List<PhysicalItemDetails> itemList) {
        this.itemList = itemList;
    }

    public void addItem(PhysicalItemDetails item) {
        if (searchItem(item.getItemID()) == null) {
            itemList.add(item);
        }
    }

    public void removeItem(int itemId) {
        itemList.removeIf(item -> item.getItemID() == itemId);
    }

    public PhysicalItemDetails searchItem(int itemId) {
        for (PhysicalItemDetails item : itemList) {
            if (item.getItemID() == itemId) {
                return item;
            }
        }
        return null;
    }

    public boolean isItemAvailable(int itemId) {
        for (PhysicalItemDetails item : itemList) {
            if (item.getItemID() == itemId) {
                return item.checkAvailability();
            }
        }
        return false;
    }

    public void manageItemDetails(int itemId, String newItemName, int newAvailableCopies, String newDueDate, boolean newBorrowAbility) throws Exception {
        PhysicalItemDetails item = searchItem(itemId);
        if (item == null) {
            throw new Exception("Item with ID " + itemId + " does not exist.");
        }
        for (PhysicalItemDetails items : itemList) {
            if (items.getItemID() == itemId) {
                items.setItemName(newItemName);
                items.setAvailableCopies(newAvailableCopies);
                items.setDueDate(newDueDate);
                items.setBorrowAbility(newBorrowAbility);
                break;
            }
        }
    }
}