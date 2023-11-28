/**
 * The {@code Dog} class represents a dog that is part of a rescue operation.
 * It extends the {@link RescueAnimal} class and includes additional attributes
 * specific to dogs, such as breed.
 *
 * @author Aidan Farhi
 * @version 1.0
 * @see RescueAnimal
 */
public class Dog extends RescueAnimal {

    private static final String animalType = "DOG";
    private String breed;

    /**
     * Constructs a new {@code Dog} object with the specified attributes.
     *
     * @param name              the name of the dog
     * @param gender            the gender of the dog
     * @param age               the age of the dog
     * @param weight            the weight of the dog
     * @param acquisitionDate   the date when the dog was acquired
     * @param acquisitionCountry the country from which the dog was acquired
     * @param trainingStatus    the training status of the dog
     * @param reserved          a boolean indicating whether the dog is reserved
     * @param inServiceCountry  the country where the dog is in service
     * @param breed             the breed of the dog
     */
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

    /**
     * Returns the breed of the dog.
     *
     * @return the breed of the dog
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the breed of the dog.
     *
     * @param dogBreed the new breed of the dog
     */
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
}
