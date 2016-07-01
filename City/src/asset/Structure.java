package asset;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Structure is for default building, which
 * has create time and it's age.
 * @author xenxui
 * please remember initial BuildingNumber 
 */

public abstract class Structure implements Soldable , Taxable, Rentable{
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
		if (BuildingNumber >= 1) {
			BuildingNumber = BuildingNumber -1;
		}
	}
	
	public LandLord getLandOwners() {
		return mHistoryOwner.get(mHistoryOwner.size()-1);
	}

	public LocalDate getCreateDate() {
		return mCreateDate;
	}

	public Duration getAge() {
		return Duration.between(mCreateDate, LocalDate.now());
	}
	
	public int getFloor() {
		return mFloor;
	}
	
	public int getBasement() {
		return mBasement;
	}
	
	public double getLongInMeter() {
		return mLong;
	}

	public double getWidthInMeter() {
		return mWidth;
	}
	
	public double getHeightInMeter() {
		// TODO Auto-generated method stub
		return mHeight;
	}
}
