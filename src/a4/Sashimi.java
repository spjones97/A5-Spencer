package a4;

public class Sashimi implements Sushi{
	public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	public String ingredientName;
	public IngredientPortion[] ingredientArray;
	public IngredientPortion ingredientAmt;
	
	public Sashimi(SashimiType _type) {
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
		integer = (int)(result + 0.5)
		
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
