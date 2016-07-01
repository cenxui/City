package asset;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import building.Building;

/**
 * Structure is for default building, which
 * has create time and it's age.
 * @author xenxui
 * please remember initial BuildingNumber 
 */

public abstract class Structure implements Building ,Soldable , Taxable, Rentable{
	private static long BuildingNumber;
	
	private final LocalDate mCreateDate = LocalDate.now();
	private final double mWidth;
	private final double mLong;
	private final double mHeight;
	private final int mFloor;
	private final int mBasement;
	private final List<LandLord> mHistoryOwner;
	
	static{
		BuildingNumber = 0;
	}
	
	protected Structure(double Width, double Long, double Height, int Floor, int Basement) {
		mWidth = Width;
		mLong = Long;
		mHeight = Height;
		mFloor = Floor;
		mBasement = Basement;
		mHistoryOwner = new ArrayList<>();
		BuildingNumber = BuildingNumber +1;
	}
	
	public static long getGlobalBuidingNumber() {
		// TODO Auto-generated method stub
		return BuildingNumber;
	}
	
	public static void distoryBuilding() {
		BuildingNumber = BuildingNumber -1;
	}
	
	public LandLord getLandOwners() {
		return mHistoryOwner.get(mHistoryOwner.size()-1);
	}

	@Override
	public LocalDate getCreateDate() {
		return mCreateDate;
	}

	@Override
	public Duration getAge() {
		return Duration.between(mCreateDate, LocalDate.now());
	}
	
	@Override
	public int getFloor() {
		return mFloor;
	}
	
	@Override
	public int getBasement() {
		return mBasement;
	}
	
	@Override
	public double getLongInMeter() {
		return mLong;
	}
	
	@Override
	public double getWidthInMeter() {
		return mWidth;
	}
	
	@Override
	public double getHeightInMeter() {
		// TODO Auto-generated method stub
		return mHeight;
	}
}
