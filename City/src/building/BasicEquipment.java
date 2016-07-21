package building;

interface RoomBasicEquipment {
	//Equipment
	boolean hasAirConditioner();
	boolean hasElectricFan();
	boolean hasHeater();
	boolean hasFirePlace();
	boolean hasBalcony();
	
	//Furniture
	boolean hasTV();
	boolean hasDesk();
	boolean hasFireExtinguisher();	
	boolean hasTrashCan();
	
	//Decorator
	boolean hasPaintings();
	boolean hasFlowers();
	boolean hasWallPaper();
	boolean hasPaint();
	boolean hasCathedralCeilings();
}
