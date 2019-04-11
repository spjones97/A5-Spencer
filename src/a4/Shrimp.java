package a4;

public class Shrimp extends IngredientImple{
	public Shrimp() {
		super("shrimp", 1.67, 42);
	}
	
	public boolean getIsRice() {
		return false;
	}
	
	public boolean getIsVegetarian() {
		return false;
	}
	
	public boolean getIsShellfish() {
		return true;
	}
}
