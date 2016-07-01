package asset;

public enum LandLord {
	Country,
	State,
	City,
	Company,
	Personality;
	
	private String name;
	
	LandLord() {

	}
	
	public final String getName() {
		return name;
	}
	
	public final void setName(String name) {
		this.name = name;
	}
}
