package building.residence;

import building.Room;

interface Bedroom extends Room {
	boolean hasBedroom();
	boolean hasDresser();
	boolean hasWardrodbe();
	boolean hasWalkInCloset();
	boolean hasHeadboardCabinet();
	boolean hasChestOfDrawers();
	boolean hasDressingTable();
	boolean hasMirror();
	int getBedroomNumber();
	void setBedType(int bedType);
	int getBedType();
	void setBedNumber(int number);
	int getBedNumber();
}
