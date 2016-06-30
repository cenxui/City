package land;

import java.time.LocalDate;

public interface Rentable {
	boolean isRentedState();
	int getRent();
	LocalDate getStartDate();
	LocalDate getEndDate();
}
