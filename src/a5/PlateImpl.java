package a5;

public class PlateImpl implements Plate{

	private Sushi contents;
	private double price;
	private Color color;
	
	public PlateImpl(Sushi _contents, Color _color, double _price) throws PlatePriceException{
	
		if (_contents != null) {
			if (_contents.getCost() >= price) {
				throw new PlatePriceException("the price is fucked; plateprice >= sushicost");	
			}
		}
		price = _price;
		color = _color;
	}
	
	public Sushi getContents() {
		if (contents == null || contents.getIngredients().length == 0) {
			return null;
		}
		return contents;
	}

	
	public Sushi removeContents() {
		if (contents == null || contents.getIngredients().length == 0) {
			return null;
		}
		Sushi contentsOne = contents;
		contents = null;
		return contentsOne;
		
	}

	
	public void setContents(Sushi sushi) throws PlatePriceException {
		if (sushi == null) {
			throw new IllegalArgumentException ("illegal argument exception");
		}
		if (sushi.getCost() >= price) {
			throw new PlatePriceException ("no");
		}
		contents = sushi;
		
	}

	
	public boolean hasContents() {
		if (contents == null) {
			return false;
		}
		return true;
	}

	
	public double getPrice() {
		
		return price;
	}

	
	public Color getColor() {
		return color;
	}

	
	public double getProfit() {		
		if (!this.hasContents()) {
			return 0.0;
		} 	
		double profit = 0.0;

		profit = price = contents.getCost();
		return ((int)((profit * 100.0))) / 100.0;
	}
		
}
