package SystemInventory;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class PhysicalItemDetails {
    public static ArrayList<PhysicalItemDetails> items = new ArrayList<PhysicalItemDetails>();
    private int itemID;
    private String itemName;
    private int availableCopies;
    private String dueDate;
    private boolean borrowAbility = true;
    private ArrayList<String> borrowedBooks = new ArrayList<String>();
    public String path;
    private static double penalty = 0;

    public PhysicalItemDetails(int itemID, String itemName, int availableCopies, String date) throws Exception {
        this.itemID = itemID;
        this.itemName = itemName;
        this.availableCopies = availableCopies;
        this.dueDate = date;
        String path = "D:\\Downloads\\Documents\\Library-Management-System\\src\\items.csv";
        this.path = path;
        this.load(path);
    }

    public PhysicalItemDetails() {
        this.itemID = 0;
        this.itemName = "";
        this.availableCopies = 0;
        this.dueDate = "";
    }

    public void load(String path) throws Exception {
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while (reader.readRecord()) {
            PhysicalItemDetails physicalItem = new PhysicalItemDetails();
            physicalItem.setItemID(Integer.parseInt(reader.get("ItemID")));
            physicalItem.setItemName(reader.get("ItemName"));
            physicalItem.setAvailableCopies(Integer.parseInt(reader.get("AvailableCopies")));
            physicalItem.setDueDate(reader.get("DueDate"));
            items.add(physicalItem);
        }
    }

    public void update(String path) throws Exception {
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
            //ItemID,ItemName,AvailableCopies,DueDate
            csvOutput.write("ItemID");
            csvOutput.write("ItemName");
            csvOutput.write("AvailableCopies");
            csvOutput.write("DueDate");
            csvOutput.endRecord();

            // else assume that the file already has the correct header line
            // write out a few records
            for (PhysicalItemDetails p : items) {
                csvOutput.write(Integer.toString(p.getItemID()));
                csvOutput.write(p.getItemName());
                csvOutput.write(Integer.toString(p.getAvailableCopies()));
                csvOutput.write(p.getDueDate());
                csvOutput.endRecord();
            }
            csvOutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean checkAvailability() {
        return availableCopies > 0;
    }

    public boolean borrowItem() {
        if (availableCopies > 0 && borrowAbility) {
            availableCopies--;
            borrowedBooks.add(itemName);
            markAsLost();
            return true;
        }
        return false;
    }

    public boolean returnItem() {
        availableCopies++;
        return true;
    }

    public boolean isOverdue() {
        Date currentDate = new Date();
        Date dueDate = new Date(this.dueDate);
        return currentDate.after(dueDate);
    }

    public double calculatePenalty() {
        if (isOverdue()) {
            // Calculate penalty logic goes here Placeholder value, replace with actual penalty calculation
            penalty += 0.5;
            return penalty;
        }
        penalty = 0;
        return penalty; // No penalty if not overdue
    }

    public void markAsLost() {
        // Mark item as lost logic goes here
        if (borrowedBooks.size() > 3) {
            borrowAbility = false;
        }
    }

    public void setBorrowAbility(boolean borrowAbility) {
        this.borrowAbility = borrowAbility;
    }

    public boolean getBorrowAbility() {
        return borrowAbility;
    }

    public void setLocation(String newLocation) {
    }

    public String getLocation() {
        return "";
    }
}