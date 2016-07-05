/**
 * 
 */
package building;

import java.time.LocalDate;

import asset.LandLord;

/**
 * @author xenxui
 *
 */
public class BuildingWrapper extends Building {
	private final Building mBuilding;
	
	public BuildingWrapper(Building building) {
		super();
		mBuilding = building;
	}

	@Override
	public boolean hasElevator() {
		return mBuilding.hasElevator();
	}

	@Override
	public int getElevatorNumber() {
		return mBuilding.getElevatorNumber();
	}

	@Override
	public boolean hasBasment() {
		return mBuilding.hasBasment();
	}

	@Override
	public boolean isSoldable() {
		return mBuilding.isSoldable();
	}

	@Override
	public boolean isOnSold() {
		return mBuilding.isOnSold();
	}

	@Override
	public final double getPrice() {
		return mBuilding.getPrice();
	}

	@Override
	public final boolean isTaxable() {
		return mBuilding.isTaxable();
	}

	@Override
	public final double getTax() {
		return mBuilding.getTax();
	}

	@Override
	public final boolean isRentible() {
		return mBuilding.isRentible();
	}

	@Override
	public boolean isRentedState() {
		return mBuilding.isRentedState();
	}

	@Override
	public LandLord getLandLord() {
		return mBuilding.getLandLord();
	}

	@Override
	public double getRent() {
		return mBuilding.getRent();
	}

	@Override
	public LocalDate getStartDate() {
		return mBuilding.getStartDate();
	}

	@Override
	public LocalDate getEndDate() {
		return mBuilding.getEndDate();
	}

	@Override
	public int getBasementFloor() {
		return mBuilding.getBasementFloor();
	}

	@Override
	public int getFloor() {
		return mBuilding.getFloor();
	}

	@Override
	public Address getAddress() {
		return mBuilding.getAddress();
	}

	@Override
	public double getLongInMeter() {
		return mBuilding.getLongInMeter();
	}

	@Override
	public double getWidthInMeter() {
		return mBuilding.getWidthInMeter();
	}

	@Override
	public double getHeightInMeter() {
		return mBuilding.getHeightInMeter();
	}

	@Override
	public double getDepthInMeter() {
		return mBuilding.getDepthInMeter();
	}
}
