package building;

public class Floor {
	private static Material mMaterial;
	private static State mState;
	
	public Floor(Material material, State state) {
		mMaterial = material;
		mState = state;
	}
	
	public Material getFloorMaterial() {
		return mMaterial;
	}
	
	public void setFloorState(State state) {
		mState = state;
	}
	
	public State getFloorState() {
		return mState;
	}

	public enum Material {
		Marble,
		Tile,
		Hardwood,
		Cement,
		Glass
	}
	
	public enum State {
		Waxed,
		Clean,
		Dusty,
		Rotten
	}

}
