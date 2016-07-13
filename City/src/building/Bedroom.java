package building;

interface Bedroom extends RoomBasicEquipment{
	public static final int KingBed = 3;
	public static final int QueenBed = 2;
	public static final int TwinBed = 1;
	public static final int FutonBed = 0;
	
	boolean isRedecoratable();
	boolean hasBedroom();
	boolean hasDresser();
	boolean hasWardrodbe();
	boolean hasMirror();
	int getBedroomNumber();
	void setBedType(int bedType);
	int getBedType();
	void setBedNumber(int number);
	int getBedNumber();
}
