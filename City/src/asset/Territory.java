package asset;

public abstract class Territory implements Taxable, Soldable, Rentable{
	abstract int getAra();
	abstract int getWidth();
	abstract int getLong();	
}
