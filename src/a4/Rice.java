package a4;

public class Rice extends IngredientImple{
	public Rice() {
		super("rice", .13, 34);
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