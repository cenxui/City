package building.residence;

import building.Room;

interface DiningRoom extends Room {
	boolean hasDiningRoom();
	boolean hasDiningTable();
	boolean hasCabinet();
	boolean hasCupboard();
}
