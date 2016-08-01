package building.business;

interface StoreRoom {
	boolean hasStoreRoom();
	Size getStoreRoomSize();
	
	enum Size {
		Small,
		Medium,
		Large
	}

}
