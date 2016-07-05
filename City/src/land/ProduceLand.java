package land;

public abstract class ProduceLand extends Land implements Buildable{
	abstract int getSubsidy();
	abstract void setSubsidy();
}
