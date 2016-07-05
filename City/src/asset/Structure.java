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
	private final double mDepth;
	private final List<LandLord> mHistoryOwner;
	
	static{
		BuildingNumber = 0;
	}
	
	/**
	 * 
	 * @param Width the building width in meter
	 * @param Long the building long in meter
	 * @param Height the building height in meter
	 * @param Depth the building depth in meter
	 */
	
	protected Structure(double Width, double Long, double Height, double Depth) {
		mWidth = Width;
		mLong = Long;
		mHeight = Height;
		mDepth = Depth;
		mHistoryOwner = new ArrayList<>();
		BuildingNumber = BuildingNumber +1;
	}
	
	/**
	 * return the building number in global
	 * @return
	 */
	public static long getGlobalBuidingNumber() {
		return BuildingNumber;
	}
	/**
	 * true if it can be destroy.
	 * @return whether it can be destroy or not.
	 */
	public static boolean distoryBuilding() {
		if (BuildingNumber<1) {
			return false;
		}
		if (BuildingNumber >= 1) {
			BuildingNumber = BuildingNumber -1;
		}
		return true;
	}
	
	public final LandLord getLandOwners() {
		return mHistoryOwner.get(mHistoryOwner.size()-1);
	}

	public final LocalDate getCreateDate() {
		return mCreateDate;
	}

	public final Duration getAge() {
		return Duration.between(mCreateDate, LocalDate.now());
	}
	
	public final double getLongInMeter() {
		return mLong;
	}

	public final double getWidthInMeter() {
		return mWidth;
	}
	
	public final double getHeightInMeter() {
		return mHeight;
	}
	
	public final double getDepthInMeter() {
		return mDepth;
	}
}
