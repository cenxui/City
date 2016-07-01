package building;

import land.Farm;

public abstract class FarmHouse extends Structure implements Farm, Building {

	FarmHouse(double Width, double Long, double Height, int Floor, int Basement) {
		super(Width, Long, Height, Floor, Basement);
	}
	
}
