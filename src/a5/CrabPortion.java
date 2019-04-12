package a5;

public class CrabPortion extends IngredientPortionImpl{
	private static Crab crab = new Crab();
	public CrabPortion(double _amount) {
		super (crab, _amount);
	}
}
