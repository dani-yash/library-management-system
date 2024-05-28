package SystemInventory;

import java.util.List;

public class SystemInventory {
    private List<PhysicalItemDetails> itemList;

    public SystemInventory(List<PhysicalItemDetails> itemList) {
        this.itemList = itemList;
    }

    public void addItem(PhysicalItemDetails item) {
        itemList.add(item);
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

    public void manageItemDetails(int itemId, String newItemName, int newAvailableCopies, String newDueDate, boolean newBorrowAbility) {
        for (PhysicalItemDetails item : itemList) {
            if (item.getItemID() == itemId) {
                item.setItemName(newItemName);
                item.setAvailableCopies(newAvailableCopies);
                item.setDueDate(newDueDate);
                item.setBorrowAbility(newBorrowAbility);
                break;
            }
        }
    }
}