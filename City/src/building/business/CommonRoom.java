package building.business;

interface CommonRoom extends BusinessRoom {
	boolean hasCommonRoom();
	boolean hasChair();
	boolean hasSofa();
	boolean hasCounter();
	
	boolean hasDispenser();
	boolean hasFridge();
	boolean hasOven();
	boolean hasMicrowaveOven();
	boolean hasPercolator();
	boolean hasToaster();
	
	Size getCommonRoomSize();

}
