package asset;

import java.time.LocalDate;

import land.LandLord;

interface Rentable {
	boolean isRentible();
	boolean isRentedState();
	LandLord getLandLord();
	void setLandLord(LandLord landLord);
	double getRent();
	void setRent(double rent);
	LocalDate getStartDate();
	LocalDate getEndDate();	
}
