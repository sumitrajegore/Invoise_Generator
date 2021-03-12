package InvoiseGenerator;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
	
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
		@SuppressWarnings("unused")
		InvoiceGenerator invoiceGenerator = new  InvoiceGenerator();
        double distance = 1.0;
        int time = 5;
        double fare = InvoiceGenerator.calculator(distance,time);
        Assert.assertEquals(15, fare, 0.0);
    }
    
    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare(){
		@SuppressWarnings("unused")
		InvoiceGenerator invoiceGenerator = new  InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = InvoiceGenerator.calculator(distance,time);
        Assert.assertEquals(5, fare, 0.0);
    }
    
    @Test
    public void givenMultipleRides_ShouldReturnMinFare(){
		@SuppressWarnings("unused")
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = { new Ride( 2.0, 5),
        		         new Ride( 1.0, 1) 
        };
        double fare = invoiceGenerator.calculator(rides);
        Assert.assertEquals(36, fare, 0.0);
        //double fare = InvoiceGenerator.calculator(rides, 3,2.0);
        //Assert.assertEquals(23, fare, 0.0);
    }
}
