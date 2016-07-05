package building;

import asset.Structure;

/**
 * 
 * @author xenxui
 *	Building is for abstract buildings conception.
 */

public abstract class Building extends Structure implements Elevator, Basement{
	private final int mFloor;
	private final int mBasement;
	
	/**
	 * 
	 * @param Width 
	 * @param Long
	 * @param Height
	 * @param Depth
	 * @param Floor the building floor
	 * @param Basement the basement floor number , 0 if it has no basement 
	 */
	protected Building(double Width, double Long, double Height, double Depth,
			int Floor, int Basement) {
		super(Width, Long, Height, Depth);
		mFloor = Floor;
		mBasement = Basement;
	}
	
	public static long getGlobalBuidingNumber() {
		return Structure.getGlobalBuidingNumber();
	}
	
	public static boolean distoryBuilding() {
		return Structure.distoryBuilding();
	}
	
	/**
	 * @return mBasement
	 */
	@Override
	public int getBasementFloor() {
		return mBasement;
	}
	
	/**
	 * @return the mFloor
	 */
	public int getFloor() {
		return mFloor;
	}
}
