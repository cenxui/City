package building.residence;

interface Kitchen extends DiningRoom {
	boolean hasKitchen();
	boolean hasGasStove();
	boolean hasCounter();
	
	//electric equipment
	boolean hasStove();
	boolean hasFridge();
	boolean hasOven();
	boolean hasMicrowaveOven();
	boolean hasPercolator();
	boolean hasToaster();
	boolean hasBlender();
	boolean hasRiceCooker();
	boolean hasDishWasher();
	boolean hasRangeFan();
	
	int getStoveNumber();

}
