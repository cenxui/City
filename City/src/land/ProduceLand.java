package land;

public abstract class ProduceLand implements Land, Buildable{
	abstract int getSubsidy();
	abstract void setSubsidy();
}
