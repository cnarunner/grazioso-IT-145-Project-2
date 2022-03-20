public class Monkey extends RescueAnimal{

	// Attributes
	private String tailLength;
	private String monkeyHeight;
	private String bodyLength;
	private String monkeySpecies;

	// Constructor
	public Monkey(String name, String monkeySpecies, String gender, String age,
	              String weight, String tailLength, String monkeyHeight, String bodyLength, String acquisitionDate,
	              String acquisitionCountry,
	              String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
		setMonkeySpecies(monkeySpecies);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setTailLength(tailLength);
		setMonkeyHeight(monkeyHeight);
		setBodyLength(bodyLength);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
	}

	//Accessors and Mutators

	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public String getMonkeyHeight() {
		return monkeyHeight;
	}

	public void setMonkeyHeight(String monkeyHeight) {
		this.monkeyHeight = monkeyHeight;
	}

	public String getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}

	public String getMonkeySpecies() {
		return monkeySpecies;
	}

	public void setMonkeySpecies(String monkeySpecies) {
		this.monkeySpecies = monkeySpecies;
	}
}

