package main;

public class conversions {
	
	public double CelsiusToFarenheit(double qty) {
		double finalResult;
		finalResult = (qty /5) *9 +32;
		
		return finalResult;
	}
	public double FarenheitToCelsius(double qty) {
		double finalResult;
		finalResult = (qty -32) *5 /9;
		
		return finalResult;
	}
	public double MtoK(double qty) {
		double finalResult;
		finalResult = qty *1.609;
		
		return finalResult;
	}
	
	public double KtoM(double qty) {
		double finalResult;
		finalResult = qty /1.609;
		
		return finalResult;
	}
	
	public double CupsToTeaSpoon(double qty) {
		double finalResult;
		finalResult = (qty *48);
		
		return finalResult;
	}
	public double TeaSpoonToCup(double qty) {
		double finalResult;
		finalResult = (qty/48);
		
		return finalResult;
	}
	
	public double gallonsToImperial(double qty) {
		double finalResult;
		finalResult = (qty/1.201);
		
		return finalResult;
	}
	
	public double imperialToGallons(double qty) {
		double finalResult;
		finalResult = (qty*1.201);
		
		return finalResult;
	}
	
	
	

}
