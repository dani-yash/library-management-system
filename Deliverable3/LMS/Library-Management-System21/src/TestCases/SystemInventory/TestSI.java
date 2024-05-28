package TestCases.SystemInventory;

import SystemInventory.PhysicalItemDetails;
import SystemInventory.SystemInventory;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestSI {
    @Test
    void testAddItem() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        PhysicalItemDetails item = new PhysicalItemDetails();
        si.addItem(item);
        assertFalse(SystemInventory.itemList.isEmpty());
    }

    @Test
    void testRemoveItem() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        si.addItem(item);
        si.removeItem(1);
        assertTrue(SystemInventory.itemList.isEmpty());
    }

    @Test
    void testSearchItem() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        si.addItem(item);
        assertNotNull(si.searchItem(1));
    }

    @Test
    void testIsItemAvailable() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        item.setAvailableCopies(1);
        si.addItem(item);
        assertTrue(si.isItemAvailable(1));
    }

    @Test
    void testManageItemDetailsWithExistingItemID() throws Exception {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        si.addItem(item);
        si.manageItemDetails(1, "New Item Name", 2, "2023/12/31", true);
        PhysicalItemDetails updatedItem = si.searchItem(1);
        assertEquals("New Item Name", updatedItem.getItemName());
        assertEquals(2, updatedItem.getAvailableCopies());
        assertEquals("2023/12/31", updatedItem.getDueDate());
        assertTrue(updatedItem.getBorrowAbility());
    }

    @Test
    void testManageItemDetailsWithNonExistentItemID() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        assertThrows(Exception.class, () -> si.manageItemDetails(1, "New Item Name", 2, "2023/12/31", true));
    }

    @Test
    void testIsItemAvailableWithNonExistentItemID() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        assertFalse(si.isItemAvailable(1));
    }

    @Test
    void testAddItemWithExistingItem() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        si.addItem(item);
        si.addItem(item);
        assertEquals(1, SystemInventory.itemList.size());
    }

    @Test
    void testSearchItemWithNonExistentItemID() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        assertNull(si.searchItem(1));
    }

    @Test
    void testManageItemDetailsWithWrongID() {
        SystemInventory si = new SystemInventory(new ArrayList<>());
        assertThrows(Exception.class, () -> si.manageItemDetails(-1, "New Item Name", 2, "2023/12/31", true));
    }
}
