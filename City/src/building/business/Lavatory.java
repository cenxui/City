package building.business;

interface Lavatory {
	boolean hasLavatory();
	int getToiletNumber();
	Type getLavatoryType();

	enum Type {
		forMale,
		forFemale,
		forTheDisabled,
		forParentsWithInfants
	}
}
