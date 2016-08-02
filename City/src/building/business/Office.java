package building.business;

interface Office {
	boolean hasOffice();
	int getOfficeFloor();
	Size getOfficeSize();
	
	enum Size {
		Small,
		Medium,
		Large
	}

}
