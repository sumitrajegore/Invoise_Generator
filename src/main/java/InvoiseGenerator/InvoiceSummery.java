package InvoiseGenerator;
public class InvoiceSummery {
	
	private final int noofrides;
	private final double totalfare;
	private final double averagefare;	
	@Override
	public int hashCode() {
		return 0;
	}
	public InvoiceSummery(int noofrides, double totalfare) {

		this.noofrides = noofrides;
		this.totalfare = totalfare;
		this.averagefare = this.totalfare/this.noofrides;
	}
	@Override
	public boolean equals(Object o) {
		
		if( this == o) return true;
		if( o == null || getClass() != o.getClass()) return false;
		InvoiceSummery that = (InvoiceSummery) o;
		return noofrides == that.noofrides  && 
				Double.compare(that.totalfare, totalfare) == 0 && 
				Double.compare(that.averagefare, averagefare) == 0;
	}
}
