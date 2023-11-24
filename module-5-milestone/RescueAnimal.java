import java.lang.String;

public class RescueAnimal {

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

    public RescueAnimal() {}

	public RescueAnimal(
			String name, 
			String animalType, 
			String gender, 
			String age, 
			String weight, 
			String acquisitionDate, 
			String acquisitionCountry, 
			String trainingStatus, 
			boolean reserved, 
			String inServiceCountry) {
		this.name = name;
		this.animalType = animalType;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.acquisitionDate = acquisitionDate;
		this.acquisitionCountry = acquisitionCountry;
		this.trainingStatus = trainingStatus;
		this.reserved = reserved;
		this.inServiceCountry = inServiceCountry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}

	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

	public boolean getReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public String getInServiceLocation() {
		return inServiceCountry;
	}

	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
