package building.backyard;

public class FlowerGarden extends Garden {
	public enum SpringSpecies {
		Tulip,
		PeachBlossom,
		Sakura,

		Plumflower,
		Camellia,
		Daisy,
	}
	
	public enum SummerSpecies {
		Lavender,
		Orchid,
		Lily,
		Rose,
		Marigolds,
		Hydrangea,
		Jasmine,
		
		Daisy,
		Sunflower,
	}
	
	public enum AutumnSpecies {
		GingerLily,
		Osmanthus,
		Campanula,
		Cosmos,
		Ginkgo,
		Saffron,
		
		Sunflower,
	}
	
	public enum WinterSpecies {
		Narcissus,
		Paradises,

		Plumflower,
		Camellia,
	}
	
	public SpringSpecies[] getSpringSpecies() {
		return SpringSpecies.values();
	}
	
	public SummerSpecies[] getSummerSpecies() {
		return SummerSpecies.values();
	}
	
	public AutumnSpecies[] getAutumnSpecies() {
		return AutumnSpecies.values();
	}
	
	public WinterSpecies[] getWinterSpecies() {
		return WinterSpecies.values();
	}

}
