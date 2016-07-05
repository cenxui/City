package building;

import asset.Structure;

/**
 * 
 * @author xenxui
 *	Building is for abstract buildings conception.
 */

public abstract class Building extends Structure implements Elevator, Basement{
	
	public abstract int getFloor();

	public abstract Address getAddress();
	
	public abstract double getLongInMeter();

	public abstract double getWidthInMeter();
	
	public abstract double getHeightInMeter();
	
	public abstract double getDepthInMeter();
}
