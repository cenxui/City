package building.residence;

interface Bedroom {
	boolean hasBedroom();
	boolean hasDresser();
	boolean hasWardrodbe();
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
