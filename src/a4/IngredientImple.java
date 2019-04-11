package a4;

public class IngredientImple implements Ingredient{

	private String ingredientName;
	private double pricePerOz;
	private int caloriePerOz;
	
	public IngredientImple(String _name, double _price, int _calories) {
		ingredientName = _name;
		pricePerOz = _price;
		caloriePerOz = _calories;
	}
	
	
	public String getName() {
		// TODO Auto-generated method stub
		return ingredientName;
	}

	
	public double getCaloriesPerDollar() {
		double caloriesPerDollar = caloriePerOz / pricePerOz;
		return (caloriesPerDollar);
	}

	
	public int getCaloriesPerOunce() {
		// TODO Auto-generated method stub
		return caloriePerOz;
	}

	
	public double getPricePerOunce() {
		// TODO Auto-generated method stub
		return pricePerOz;
	}

	
	public boolean equals(Ingredient other) {
		double subtracted = Math.abs(getPricePerOunce() - other.getPricePerOunce());
		String y = other.getName();
		
		if(getName().equals(y)) {
			if (getCaloriesPerOunce() == other.getCaloriesPerOunce()) {
				if (subtracted <= 0.1) {
					return true;
				}
				
			} return false;
		}
		return false;
	}
	
	
	//Overridden 
	
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean getIsRice() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean getIsShellfish() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
