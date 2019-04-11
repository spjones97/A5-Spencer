package a4;

public class Nigiri implements Sushi{
	protected String name;
	protected IngredientPortion[] ingredients;
	protected enum NigiriType {TUNA, YELLOTAIL, EEL, CRAB, SHRIMP};
	
	public Nigiri(NigiriType typeOne) {
		
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
