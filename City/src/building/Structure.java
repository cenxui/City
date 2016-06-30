package building;

import java.time.Duration;
import java.time.LocalDate;

public abstract class Structure implements Building {
	private LocalDate mCreateDate = LocalDate.now();

	@Override
	public LocalDate getCreateDate() {

		return mCreateDate;
	}

	@Override
	public Duration getAge() {
		// TODO Auto-generated method stub
		return Duration.between(mCreateDate, LocalDate.now());
	}

	@Override
	public int getFloor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBasement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBuildingTaxable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBuildingTax() {
		// TODO Auto-generated method stub
		return 0;
	}

}
