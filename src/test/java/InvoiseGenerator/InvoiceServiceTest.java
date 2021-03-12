package InvoiseGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class InvoiceServiceTest {
	
	InvoiceGenerator invoiceGenerator =null;
	@Before
	public void setUp() throws Exception {
		
				invoiceGenerator = new  InvoiceGenerator();		
	}
	@Test
    public void givenMultipleRides_ShouldReturnInvoiceSummery() {
		
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = { new Ride( 2.0, 5),
        		         new Ride( 0.1, 1) 
        };
        InvoiceSummery summery = invoiceGenerator.calculator(rides);
        InvoiceSummery expectedsummery = new InvoiceSummery(2, 30);
        Assert.assertEquals(expectedsummery, summery );
    }
}
