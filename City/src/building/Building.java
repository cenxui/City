package building;

import java.time.Duration;
import java.time.LocalDate;

/**
 * 
 * @author xenxui
 *	Building is for abstract buildings conception.
 */

public interface Building {
	LocalDate getCreateDate();
	
	Duration getAge();
	
	int getFloor();
	
	int getBasement();
	
	double getWidthInMeter();
	
	double getLongInMeter();
	
	double getHeightInMeter();
	
	boolean isBuildingTaxable();
	
	double getBuildingTax();
}
