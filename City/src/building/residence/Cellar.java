package building.residence;

public class Cellar {
	private Type[] mType;
	
	public Cellar(Type[] wineType) {
		mType = wineType;
	}
	
	public Type[] getWineType() {
		return mType;
	}
	
	public enum Type {
		Beer,
		Brandy,
		Gin,
		RedWine,
		Rum,
		Spirit,
		Tequila,
		Wine,
		Whiskey,
		WhiteWine,
	}
	
}
