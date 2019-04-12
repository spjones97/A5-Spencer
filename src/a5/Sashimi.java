package a5;

public class Sashimi implements Sushi{
	public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	protected String ingredientName;
	protected IngredientPortion[] ingredientArray;
	protected IngredientPortion ingredientAmt;
	
	public Sashimi(SashimiType _type) {
		
		ingredientArray = new IngredientPortion[1];
		
		if (_type == SashimiType.TUNA) {
			ingredientName = "tuna sashimi";
			ingredientAmt = new TunaPortion(0.75);
		} else if (_type == SashimiType.YELLOWTAIL) {
			ingredientName = "yellowtail sashimi";
			ingredientAmt = new YellowtailPortion(0.75);
		} else if (_type == SashimiType.EEL) {
			ingredientName = "eel sashimi";
			ingredientAmt = new EelPortion(0.75);
		} else if (_type == SashimiType.CRAB) {
			ingredientName = "crab sashimi";
			ingredientAmt = new CrabPortion(0.75);
		} else if (_type == SashimiType.SHRIMP) {
			ingredientName = "shrimp sashimi";
			ingredientAmt = new ShrimpPortion(0.75);
		}
		ingredientArray[0] = ingredientAmt;
		
		for (int i=0; i<ingredientArray.length; i++) {
			if (ingredientArray[i] == null) {
				throw new RuntimeException("ingredients array can't be null");
			}
		}
		

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ingredientName;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		return ingredientArray;
	}

	@Override
	public int getCalories() {
		double result = 0.0;
		int integer = 0;
		for (int i=0; i<ingredientArray.length; i++) {
			result = result + ingredientArray[i].getCalories();
		}
		integer = (int)(result + 0.5);
		
		return integer;
	}

	@Override
	public double getCost() {
		double result = 0.0;
		
		for (int i=0; i<ingredientArray.length; i++) {
			result = result + ingredientArray[i].getCost();
		}
		return result;
	}

	@Override
	public boolean getHasRice() {
		for (int i=0; i<ingredientArray.length; i++) {
			if(ingredientArray[i].getIsRice()) {
			return true;
			}
		}
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		for (int i=0; i<ingredientArray.length; i++) {
			if(ingredientArray[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		for (int i=0; i<ingredientArray.length; i++) {
			if(ingredientArray[i].getIsVegetarian()) {
				return true;
			}
		}
		return false;
	}
	
}
