package a4;

public class Nigiri implements Sushi{
	public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	protected String ingredientName;
	protected IngredientPortion[] ingredientPortionArray;
	protected IngredientPortion ingredientAmt;
	protected IngredientPortion ingredientRiceAmt;
	
	public Nigiri(NigiriType _type) {
		
		int amtOfIngredients = 2;
		
		ingredientPortionArray = new IngredientPortion[amtOfIngredients];
		ingredientRiceAmt = new RicePortion(0.5);
		

		if (_type == NigiriType.TUNA) {
			ingredientName = "tuna nigiri";
			ingredientAmt = new TunaPortion(0.75);
		} else if (_type == NigiriType.YELLOWTAIL) {
			ingredientName = "yellowtail nigiri";
			ingredientAmt = new YellowtailPortion(0.75);
		} else if (_type == NigiriType.EEL) {
			ingredientName = "eel nigiri";
			ingredientAmt = new EelPortion(0.75);
		} else if (_type == NigiriType.CRAB) {
			ingredientName = "crab nigiri";
			ingredientAmt = new CrabPortion(0.75);
		} else if (_type == NigiriType.SHRIMP) {
			ingredientName = "shrimp nigiri";
			ingredientAmt = new ShrimpPortion(0.75);
		}
		
		for(int i=0; i<2; i++) {
		ingredientPortionArray[i] = ingredientAmt;
		ingredientPortionArray[i] = ingredientRiceAmt;
		}
		
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if (ingredientPortionArray[i] == null) {
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
		return ingredientPortionArray;
	}

	@Override
	public int getCalories() {
		double result = 0;
		int finalValue = 0;
		result = ingredientPortionArray[1].getCalories() + ingredientPortionArray[2].getCalories();
//		for(int i=0; i<ingredientPortionArray.length; i++) {
//			result = result + ingredientPortionArray[i].getCalories();
//		}
		finalValue = (int)(result + 0.5);
		
		return finalValue;
	}

	@Override
	public double getCost() {
		double result = 0;
		for (int i=0; i<ingredientPortionArray.length; i++) {
			result = result + ingredientPortionArray[i].getCost();
		}
		return result;
	}

	@Override
	public boolean getHasRice() {
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if (!ingredientPortionArray[i].getIsRice()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean getHasShellfish() {
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if(ingredientPortionArray[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if(ingredientPortionArray[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}
}
