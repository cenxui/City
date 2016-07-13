package building;

interface LivingRoom extends RoomBasicEquipment{
	public static final int SmallSofa = 0;
	public static final int MediumSofa = 1;
	public static final int LargeSofa = 2;
	public static final int LTypeSofa = 3;
	public static final int LeatherMaterial = 10;
	public static final int FabricMaterial = 11;

	boolean hasLivingRoom();
	boolean hasSofa();
	int getSofaType();
	int getSofaNumber();
}
