

import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor
    public RescueAnimal() {
    }


	public String getName() {
		return name;
	}  // name


	public void setName(String name) {
		this.name = name;
	}


	public String getAnimalType() {
		return animalType;
	}  // animalType


	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	public String getGender() {
		return gender;
	}  // gender


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAge() {
		return age;
	}  // age


	public void setAge(String age) {
		this.age = age;
	}


	public String getWeight() {
		return weight;
	}  // weight


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getAcquisitionDate() {
		return acquisitionDate;
	}  // acquisitionDate


	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}


	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}  // acquisitionCountry


	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}


	public boolean getReserved() {
		return reserved;
	}  // reserved


	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}


	public String getInServiceLocation() {
		return inServiceCountry;
	}  // inServiceCountry


	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}


	public String getTrainingStatus() {
		return trainingStatus;
	}  // trainingStatus


	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
