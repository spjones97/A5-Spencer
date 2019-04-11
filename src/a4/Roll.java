package a4;

public class Roll implements Sushi{
	protected String ingredientName;
	protected IngredientPortion[] ingredientPortionArray;
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {

		ingredientPortionArray = new IngredientPortion[50];
				
		ingredientName = name;
		
		ingredientPortionArray = roll_ingredients.clone();

		if (name == null) {
			throw new RuntimeException ("no");
		}
		
		
		if(ingredientPortionArray.length == 0 || ingredientPortionArray == null) {
			throw new RuntimeException("no");
		}
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if(ingredientPortionArray[i].equals(null)) {
				throw new RuntimeException("no");
			}
		}
				
		int totalLength = roll_ingredients.length + 1;
		int counter = 0;
		int z=0;
		int i=0;
		
		IngredientPortion[] ingredArray = new IngredientPortion[totalLength];
		
		while(i<ingredientPortionArray.length) {
			if (has(ingredArray, counter, ingredientPortionArray[i])) {
						for (int f=0; f<counter; f++) {
							if (ingredientPortionArray[i].getName().equals(ingredArray[f].getName())) {
								ingredArray[f] = ingredArray[f].combine(ingredientPortionArray[i]);
							}
						} 					
			} else {
				ingredArray[counter] = ingredientPortionArray[i];
				counter++;
				} 
			i++;
			}
		
		IngredientPortion seaweedPortion = new SeaweedPortion(0.1);
		int y=0; 
		int b = 0;
			if(has(ingredArray, counter, seaweedPortion)){
				while(y<counter) {
					if((ingredArray[y].getName().equals("seaweed")) && (ingredArray[y].getAmount() <0.1)) {
							IngredientPortion seaweeds = new SeaweedPortion(0.1 - ingredArray[y].getAmount());
							ingredArray[y] = ingredArray[y].combine(seaweeds);
						}
					y++;
				}
			} else { //might need to change
				ingredArray[counter] = new SeaweedPortion(0.1);
				counter++;
			}

		
		IngredientPortion[] countArray = new IngredientPortion[counter];
		int f=0;
		while(f<counter ) {
			countArray[f]=ingredArray[f];
			f++;
		}	
		ingredientPortionArray=countArray;
		
}
	
	public String getName() {
		// TODO Auto-generated method stub
		return ingredientName;
	}

	
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		return ingredientPortionArray;
	}
	
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
	
	public double getCost() {
		double result = 0.0;
		double holder = 0.0;
		double value = 0.0;
		for (int i=0; i<ingredientPortionArray.length; i++) {
			holder = ingredientPortionArray[i].getCost();
			result =+ ingredientPortionArray[i].getCost();
		}
		value = (int)((result + 100) + 0.5) / 100;
		return value;
	}
	
	public boolean getHasRice() {
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if (ingredientPortionArray[i].getIsRice()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean getHasShellfish() {
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if (!ingredientPortionArray[i].getIsShellfish()) {
				return false;
			}
		}
		return true;
	}

	public boolean getIsVegetarian() {
		for (int i=0; i<ingredientPortionArray.length; i++) {
			if (!ingredientPortionArray[i].getIsVegetarian()) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean has (IngredientPortion[] ingredientArray, int counter, IngredientPortion ingredientPortion) {
		int i = 0;
		while (i<counter) {
			if (ingredientPortion.getName().equals(ingredientArray[i].getName())) {
				return true;
			}
			i++;
		}
		return false;
	}

}