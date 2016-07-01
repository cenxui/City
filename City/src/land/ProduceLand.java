package land;

interface ProduceLand extends Land, Rentable{
	int getSubsidy();
	void setSubsidy();
}
