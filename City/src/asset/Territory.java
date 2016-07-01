package asset;

public interface Territory extends Taxable, Soldable, Rentable{
	int getAra();
	int getWidth();
	int getLong();	
}
