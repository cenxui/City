package building;

import asset.Structure;

/**
 * 
 * @author xenxui
 *	Building is for abstract buildings conception.
 */

public abstract class Building extends Structure{

	protected Building(double Width, double Long, double Height, int Floor, int Basement) {
		super(Width, Long, Height, Floor, Basement);
	}
	
}
