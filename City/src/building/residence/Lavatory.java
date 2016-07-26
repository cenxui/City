package building.residence;

import building.Room;

interface Lavatory extends Room {
	boolean hasLavatory();
	boolean hasToilet();
	boolean hasUrinal();
	boolean hasSink();
	boolean hasMirror();
	boolean hasTowelRack();
	boolean hasCabinet();
	
}
