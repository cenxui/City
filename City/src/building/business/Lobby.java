package building.business;

import building.Room;

interface Lobby extends Room {
	boolean hasLobby();
	boolean hasCounter();
	boolean hasSofa();
	boolean hasMonitor();

}
