package a4;

public class IngredientPortionImpl implements IngredientPortion{
	
	private Ingredient iObject;
	private double amt;
	
	public IngredientPortionImpl(Ingredient _ingredient, double _amount) {		
		amt = _amount;
		iObject = _ingredient;
		
		if (amt<= 0) {
			throw new RuntimeException("amount must be positive");
		}
		
	}

	@Override
	public Ingredient getIngredient() {
		return iObject;
	}

	@Override
	public double getAmount() {
		return amt;
	}
	
	public String getName() {
		return iObject.getName();
	}

	@Override
	public double getCalories() {
		double x = iObject.getCaloriesPerOunce();
		double z = (x * amt);
		return z;
	}

	@Override
	public double getCost() {
		double f = iObject.getPricePerOunce();
		double x = f * amt;
		return x;
	}

	@Override
	public boolean getIsVegetarian() {
		return iObject.getIsVegetarian();
	}

	@Override
	public boolean getIsRice() {
		return iObject.getIsRice();
	}

	@Override
	public boolean getIsShellfish() {
		return iObject.getIsShellfish();
	}

	@Override
	public IngredientPortion combine(IngredientPortion secondIngred) {
		if (secondIngred == null) {
			return this;
		}
		if (secondIngred.getAmount()<0) {
			throw new RuntimeException("IngredientPortion must have the same amount");
		
		}
		
		if (!(this.getName().equals(otherPortion.getName()))) {
			throw new RuntimeException("IngredientPortion must be same");
		}
		
		IngredientPortion ingredientPortionObject = new IngredientPortionImpl(iObject, amt + secondIngred.getAmount());
		
		return ingredientPortionObject;
	}
	
}
