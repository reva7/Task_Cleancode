
public class CalculateIntrest {
	
	
	public double simpleInterest(double principle, double time, double rateOfInterest) {
		return (principle*time*rateOfInterest) / 100.0;
	}
	
	public double compoundInterest(double principle, double time, double rateOfInterest) {
		return principle * Math.pow((1+rateOfInterest)/100, time);
	}
}
