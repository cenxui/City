package building.backyard;

import java.util.ArrayList;

public class Backyard {
	private boolean mHasFlowerGarden = false;
	private boolean mHasVegetableGarden = false;
	private boolean mHasBadmintonCourt = false;
	private boolean mHasBasketballCourt = false;
	private boolean mHasTennisCourt = false;
	private boolean mHasVolleyballCourt = false;
	private boolean mHasSwimmingPool = false;
	private String[] mSportsItem = {
			"BadmintonCourt", 
			"BasketballCourt", 
			"TennisCourt", 
			"VolleyballCourt", 
			"SwimmingPool"};
	private String[] mDecorateItem = {
			"Fountain", 
			"Slides", 
			"Swings"};
	private ArrayList<String> mBackyardItem = new ArrayList<>();
	private FlowerGarden mFlowerGarden;
	private VegetableGarden mVegetableGarden;
	
	public void setHasCourts(
			boolean hasBadmintonCourt, 
			boolean hasBasketballCourt, 
			boolean hasTennisCourt, 
			boolean hasVolleyballCourt, 
			boolean hasSwimmingPool) {
		if (hasBadmintonCourt) {
			mBackyardItem.add(mSportsItem[0]);
			mHasBadmintonCourt = true;
		} else if (hasBasketballCourt) {
			mBackyardItem.add(mSportsItem[1]);
			mHasBasketballCourt = true;
		} else if (hasTennisCourt) {
			mBackyardItem.add(mSportsItem[2]);
			mHasTennisCourt = true;
		} else if (hasVolleyballCourt) {
			mBackyardItem.add(mSportsItem[3]);
			mHasVolleyballCourt = true;
		} else if (hasSwimmingPool) {
			mBackyardItem.add(mSportsItem[4]);
			mHasSwimmingPool = true;
		}
	}
	
	public ArrayList<String> getBackyardItem() {
		return mBackyardItem;
	}
	
	public void setHasGardens(boolean hasFlowerGarden, boolean hasVegetableGarden) {
		if (hasFlowerGarden) {
			mFlowerGarden = new FlowerGarden();
			mHasFlowerGarden = true;
		} else if (hasVegetableGarden) {
			mVegetableGarden = new VegetableGarden();
			mHasVegetableGarden = true;
		}
	}
	
	public FlowerGarden getFlowerGarden() {
		return mFlowerGarden;
	}
	
	public VegetableGarden getVegetableGarden() {
		return mVegetableGarden;
	}
	
	public boolean hasFlowerGarden() {
		return mHasFlowerGarden;
	}
	
	public boolean hasVegetableGarden() {
		return mHasVegetableGarden;
	}

}
