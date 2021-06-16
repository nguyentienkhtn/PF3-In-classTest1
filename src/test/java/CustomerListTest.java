import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerListTest {
    CustomerList customerList;
    Customer<Double> customer3;

    @BeforeEach
    void setUp() {
        customerList = new CustomerList();
        Customer<Double> customer1 = new Customer<>("Pf1", 150.0);
        Customer<Double> customer2 = new Customer<>("Pf2", 160.0);
        customer3 = new Customer<>("Pf3", 170.0);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

    }


    @Test
    void maxSpent() {
        Assertions.assertEquals(customer3,customerList.getMaxSpent());
    }

    @Test
    void averageSpending() {
        Assertions.assertEquals(160.0, customerList.getAverageSpending());
    }

    @Test
    void search()
    {
        Assertions.assertEquals(2, customerList.search(customer3));
    }
}