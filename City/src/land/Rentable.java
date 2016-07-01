package land;

import java.time.LocalDate;

interface Rentable {
	boolean isRentedState();
	double getRent();
	void setRent(double rent);
	LocalDate getStartDate();
	LocalDate getEndDate();
}
