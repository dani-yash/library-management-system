import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.util.ArrayList<SystemInventory.PhysicalItemDetails> physicalItemDetailsList0 = SystemInventory.Subject.items;
        org.junit.Assert.assertNotNull(physicalItemDetailsList0);
    }
}

