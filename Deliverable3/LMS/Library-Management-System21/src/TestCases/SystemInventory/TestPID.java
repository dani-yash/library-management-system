package TestCases.SystemInventory;

import SystemInventory.PhysicalItemDetails;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class TestPID {
    @Test
    void testLoad() throws Exception {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        pid.load("D:\\Downloads\\Documents\\maven\\LMSN2\\Library-Management-System21\\src\\csv\\items.csv");
        assertTrue(PhysicalItemDetails.items.isEmpty());
    }

    @Test
    void testUpdate() throws Exception {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        pid.load("D:\\Downloads\\Documents\\maven\\LMSN2\\Library-Management-System21\\src\\csv\\items.csv");
        pid.update("D:\\Downloads\\Documents\\maven\\LMSN2\\Library-Management-System21\\src\\csv\\items.csv");
        assertTrue(PhysicalItemDetails.items.isEmpty());
    }

    @Test
    void testBorrowItem() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        pid.setAvailableCopies(1);
        assertTrue(pid.borrowItem());
    }

    @Test
    void testReturnItem() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        pid.setAvailableCopies(0);
        pid.returnItem();
        assertEquals(1, pid.getAvailableCopies());
    }

    @Test
    void testCheckAvailabilityWithAvailableCopies() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        pid.setAvailableCopies(1);
        assertTrue(pid.checkAvailability());
    }

    @Test
    void testCheckAvailabilityWithNoAvailableCopies() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        pid.setAvailableCopies(0);
        assertFalse(pid.checkAvailability());
    }

    @Test
    void testIsOverdueWithFutureDueDate() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date futureDate = new Date(System.currentTimeMillis() + 86400000);
        pid.setDueDate(sdf.format(futureDate));
        assertFalse(pid.isOverdue());
    }

    @Test
    void testIsOverdueWithPastDueDate() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date pastDate = new Date(System.currentTimeMillis() - 86400000);
        pid.setDueDate(sdf.format(pastDate));
        assertTrue(pid.isOverdue());
    }

    @Test
    void testCalculatePenaltyWhenNotOverdue() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date futureDate = new Date(System.currentTimeMillis() + 86400000);
        pid.setDueDate(sdf.format(futureDate));
        assertEquals(0, pid.calculatePenalty());
    }

    @Test
    void testCalculatePenaltyWhenOverdue() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date pastDate = new Date(System.currentTimeMillis() - 86400000);
        pid.setDueDate(sdf.format(pastDate));
        assertTrue(pid.calculatePenalty() > 0);
    }

    @Test
    void testMarkAsLostWithLessThanOrEqualToThreeBorrowedBooks() {
        PhysicalItemDetails pid = new PhysicalItemDetails();
        pid.borrowItem();
        pid.borrowItem();
        pid.borrowItem();
        pid.markAsLost();
        assertTrue(pid.getBorrowAbility());
    }
}
