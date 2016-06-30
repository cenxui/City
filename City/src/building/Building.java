package building;

import java.time.Duration;
import java.time.LocalDate;

public interface Building {
	LocalDate getCreateDate();
	
	Duration getAge();
	
	int getFloor();
	
	int getBasement();
	
	int getHeight();
	
	boolean isBuildingTaxable();
	
	double getBuildingTax();
}
