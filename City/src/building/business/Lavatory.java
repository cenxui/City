package building.business;

interface Lavatory extends BusinessRoom {
	boolean hasLavatory();
	int getToiletNumber();
	Type getLavatoryType();
	Size getLavatorySize();

	enum Type {
		forMale,
		forFemale,
		forTheDisabled,
		forParentsWithInfants
	}
}
