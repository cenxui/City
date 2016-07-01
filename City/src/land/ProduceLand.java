package land;

public interface ProduceLand extends Land, Rentable{
	int getSubsidy();
	void setSubsidy();
}
