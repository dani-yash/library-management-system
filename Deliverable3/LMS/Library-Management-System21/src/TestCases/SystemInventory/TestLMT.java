package TestCases.SystemInventory;

import SystemInventory.LibraryManagementSystem;
import SystemInventory.LibraryManagementTeam;
import SystemInventory.PhysicalItemDetails;
import UserData.Client;
import UserData.FacultyMember;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLMT {
    @BeforeEach
    void setUp() {
        LibraryManagementTeam.resetItems();
    }

    @Test
    void testAddItem() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        PhysicalItemDetails item = new PhysicalItemDetails();
        lmt.addItem(item);
        assertFalse(LibraryManagementTeam.items.isEmpty());
    }

    @Test
    void testRemoveItem() throws Exception {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        lmt.addItem(item);
        lmt.removeItem(1);
        assertTrue(LibraryManagementTeam.items.isEmpty());
    }

    @Test
    void testVerifyRegisteredUser() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        assertFalse(lmt.verifyRegisteredUser("test@test.com", "1", "visitor"));
    }

    @Test
    void testEnableItemWithExistingItemID() throws Exception {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        lmt.addItem(item);
        lmt.enableItem(1);
        assertTrue(item.getBorrowAbility());
    }

    @Test
    void testDisableItemWithExistingItemID() throws Exception {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        lmt.addItem(item);
        lmt.disableItem(1);
        assertFalse(item.getBorrowAbility());
    }

    @Test
    void testChangeItemIdWithExistingItemID() throws Exception {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        lmt.addItem(item);
        lmt.changeItemId(1, 2);
        assertEquals(2, item.getItemID());
    }

    @Test
    void testVerifyRegisteredUserWithNonExistentUser() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        assertFalse(lmt.verifyRegisteredUser("nonexistent@test.com", "0", "NonExistent"));
    }

    @Test
    void testAddItemWithExistingItem() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        PhysicalItemDetails item = new PhysicalItemDetails();
        item.setItemID(1);
        lmt.addItem(item);
        lmt.addItem(item);
        assertEquals(1, LibraryManagementTeam.items.size());
    }

    @Test
    void testRemoveItemWithNonExistentItemID() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        assertThrows(Exception.class, () -> lmt.removeItem(1));
    }

    @Test
    void testEnableItemWithNonExistentItemID() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        assertThrows(Exception.class, () -> lmt.enableItem(1));
    }

    @Test
    void testDisableItemWithNonExistentItemID() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        assertThrows(Exception.class, () -> lmt.disableItem(1));
    }

    @Test
    void testChangeItemLocationWithNonExistentItemID() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        assertThrows(Exception.class, () -> lmt.changeItemLocation(1, "New Location"));
    }

    @Test
    void testChangeItemIdWithNonExistentItemID() {
        LibraryManagementTeam lmt = new LibraryManagementTeam();
        assertThrows(Exception.class, () -> lmt.changeItemId(1, 2));
    }
}
