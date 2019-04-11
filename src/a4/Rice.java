package a4;

public class Rice extends IngredientImple{
	public Rice() {
		super("rice", 1.67, 42);
	}
	
	
	public boolean getIsRice() {
		return true;
	}
	
	public boolean getIsVegetarian() {
		return false;
	}
	
	public boolean getIsShellfish() {
		return false;
	}
}
