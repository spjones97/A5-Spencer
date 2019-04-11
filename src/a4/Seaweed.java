package a4;

public class Seaweed extends IngredientImple{
	public Seaweed() {
		super("seaweed", 2.85, 105);
	}
	
	public boolean getIsRice() {
		return false;
	}
	
	public boolean getIsVegetarian() {
		return true;
	}
	
	
	public boolean getIsShellfish() {
		return false;
	}
}
