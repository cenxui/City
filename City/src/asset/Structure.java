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
	
	protected Structure() {
		mHistoryOwner = new ArrayList<>();
		BuildingNumber = BuildingNumber +1;
	}
	
	/**
	 * return the building number in global
	 * @return
	 */
	public static final long getGlobalBuidingNumber() {
		return BuildingNumber;
	}
	
	public final LandLord getLandOwner() {
		if (mHistoryOwner.size() == 0) {
			return null;
		}
		return mHistoryOwner.get(mHistoryOwner.size()-1);
	}

	public final LocalDate getCreateDate() {
		return mCreateDate;
	}

	public final Duration getAge() {
		return Duration.between(mCreateDate, LocalDate.now());
	}
}
