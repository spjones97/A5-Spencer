package a4;

public class Roll implements Sushi{
	protected String ingredientName;
	protected IngredientPortion[] ingredientPortionArray;
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {

		ingredientPortionArray = new IngredientPortion[50];
		
		if (ingredientName == null) {
			throw new RuntimeException("ingredientName must not be null");
		}
		
		ingredientPortionArray = roll_ingredients.clone();
		
		if(ingredientPortionArray.length == 0) {
			throw new RuntimeException("ingredient array must not contain null");
			
		}
		if (ingredientPortionArray == null) {
			throw new RuntimeException("no");
		}
		
		int totalLength = roll_ingredients.length + 1;
		int counter = 0;
		IngredientPortion[] ingredArray = new IngredientPortion[totalLength];
		
		for(int i=0; i<ingredientPortionArray.length; i++) {
				for (int z=0; z<counter; z++) {
					if(ingredientPortionArray[z].getName().equals(ingredArray[z].getName())){
						for (int f=0; f<counter; f++) {
							if (ingredientPortionArray[i].getName().equals(ingredArray[f].getName())) {
								ingredArray[f] = ingredArray[f].combine(ingredientPortionArray[z]);
							}
						}
					} else {
						ingredArray[counter] = ingredientPortionArray[i];
						counter++;
					}
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
		double result = 0.0;
		double holder = 0.0;
		int integer = 0;
		for (int i=0; i<ingredientPortionArray.length; i++) {
			holder = ingredientPortionArray[i].getCalories();
			result = result + holder;
		}
		integer = (int)(result + 0.5);
		return integer;
	}

	@Override
	public double getCost() {
		double result = 0.0;
		double holder = 0.0;
		double value = 0.0;
		for (int i=0; i<ingredientPortionArray.length; i++) {
			holder = ingredientPortionArray[i].getCost();
			result = result +holder;
		}
		value = (int)((result + 100) + 0.5) / 100;
		return value;
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
			if (!ingredientPortionArray[i].getIsShellfish()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean getIsVegetarian() {
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if (!ingredientPortionArray[i].getIsVegetarian()) {
				return false;
			}
		}
		return true;
	}

}