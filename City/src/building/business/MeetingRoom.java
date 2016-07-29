package building.business;

import building.Room;

interface MeetingRoom extends Room {
	boolean hasMeetingRoom();
	MeetingRoomSize getMeetingRoomSize();
	
	enum MeetingRoomSize {
		Small,
		Medium,
		Large
	}

}
