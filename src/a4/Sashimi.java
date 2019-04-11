package a4;

public class Sashimi implements Sushi{

		//protected?
	
	String name;
	IngredientPortion[] ingredientAmt;
	IngredientPortion otherIngredientAmt;
	public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	public Sashimi(SashimiType typeOne) {
		ingredientAmt = new IngredientPortion[1];
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
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
