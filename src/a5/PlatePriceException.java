package a5;

public class PlatePriceException extends Exception{
	
	private double price;
	
	public PlatePriceException(String s) {
		super("platePrice below 0");
	}
	public double getIllegalPrice() {
		return price;
	}
	public String getMessage() {
		return super.getMessage() +" (" + price + " )";
	}
	
}
