package asset;

import land.Land;

public interface ProduceLand extends Land, Rentable, Taxable{
	int getSubsidy();
	void setSubsidy();
}
