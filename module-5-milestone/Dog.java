
public class Dog extends RescueAnimal {

    private static final String animalType = "DOG";
    private String breed;

    public Dog(
            String name, 
            String gender, 
            String age,
            String weight, 
            String acquisitionDate, 
            String acquisitionCountry,
	        String trainingStatus, 
            boolean reserved, 
            String inServiceCountry,
            String breed) {
        super(
            name, animalType, gender, age, weight, acquisitionDate, 
            acquisitionCountry, trainingStatus, reserved, inServiceCountry
        );
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
}
