package asset;

import java.time.LocalDate;

interface Rentable {
	boolean isRentible();
	boolean isRentedState();
	LandLord getLandLord();
	double getRent();
	LocalDate getStartDate();
	LocalDate getEndDate();	
}
