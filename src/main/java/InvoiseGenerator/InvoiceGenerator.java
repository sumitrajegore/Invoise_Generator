package InvoiseGenerator;
public class InvoiceGenerator {
	
	    private static final int COST_PER_TIME = 1;
	    private static final double MINIMUM_COST_PER_KM = 10.0;
	    private static final double MINIMUM_FARE = 5;
	    public static double calculator(double distance, int time) {
	    	
	        double totalfare =  distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
	        if(totalfare < MINIMUM_FARE) 
	        		return MINIMUM_FARE;
	        return totalfare;
	  	    }
	     public InvoiceSummery calculator(Ride[] rides) {

	        double totalfare = 0;
	        for (Ride ride:rides) {
	        	
	          	   		totalfare += calculator(ride.distance, ride.time);	
	        	}
	        return new InvoiceSummery(rides.length, totalfare);
	     	}
}

