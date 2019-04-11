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
		int z=0;
		IngredientPortion[] ingredArray = new IngredientPortion[totalLength];
		
		for(int i=0; i<ingredientPortionArray.length; i++) {
				while (z<counter) {
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
				z++;
				}
		}
		
		IngredientPortion seaweedPortion = new SeaweedPortion(0.1);
		while (z<counter) {
			if (seaweedPortion.getName().equals(ingredArray[z].getName())) {
				for(int i=0; i<counter; i++) {
					if((ingredArray[i].getName().equals("seaweed")) && (ingredArray[i].getAmount() <0.1)) {
							IngredientPortion seaweeds = new SeaweedPortion(0.1 - ingredArray[i].getAmount());
							ingredArray[i] = ingredArray[i].combine(seaweeds);
						}
					}
			} else { //might need to change
				ingredArray[counter] = new SeaweedPortion(0.1);
				counter++;
			}
			z++;
		}
		IngredientPortion[] countArray = new IngredientPortion[counter];
		int i=0;
		while(i<counter ) {
			countArray[i]=ingredArray[i];
			i++;
		}
		ingredientPortionArray=countArray;
		
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