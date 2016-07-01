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
 *
 */

public abstract class Structure implements Building ,Soldable , Taxable, Rentable{
	private final LocalDate mCreateDate = LocalDate.now();
	private final double mWidth;
	private final double mLong;
	private final double mHeight;
	private final int mFloor;
	private final int mBasement;
	private final List<LandLord> mHistoryOwner;
	
	protected Structure(double Width, double Long, double Height, int Floor, int Basement) {
		mWidth = Width;
		mLong = Long;
		mHeight = Height;
		mFloor = Floor;
		mBasement = Basement;
		mHistoryOwner = new ArrayList<>();
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
