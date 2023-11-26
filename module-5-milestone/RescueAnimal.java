/**
 * The {@code RescueAnimal} class represents an animal that is part of a rescue operation.
 * It serves as a base class for specific animal types, such as dogs and monkeys,
 * and includes common attributes shared among rescue animals.
 *
 * <p>Instances of this class store information about individual rescue animals, including
 * their name, animal type, gender, age, weight, acquisition details, training status,
 * reservation status, and in-service location.
 *
 * <p>The class provides accessor and mutator methods for each attribute to allow external
 * access and modification of the instance variables. Additionally, it includes a default
 * constructor for creating an empty instance and a parameterized constructor for initializing
 * an instance with specific attributes.
 *
 * @author Aidan Farhi
 * @version 1.0
 */
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

    /**
     * Default constructor for the {@code RescueAnimal} class.
     * Creates an empty instance of a rescue animal with default attribute values.
     */
    public RescueAnimal() {
    }

    /**
     * Constructs a new {@code RescueAnimal} object with the specified attributes.
     *
     * @param name              the name of the rescue animal
     * @param animalType        the type of the rescue animal
     * @param gender            the gender of the rescue animal
     * @param age               the age of the rescue animal
     * @param weight            the weight of the rescue animal
     * @param acquisitionDate   the date when the rescue animal was acquired
     * @param acquisitionCountry the country from which the rescue animal was acquired
     * @param trainingStatus    the training status of the rescue animal
     * @param reserved          a boolean indicating whether the rescue animal is reserved
     * @param inServiceCountry  the country where the rescue animal is in service
     */
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

    /**
     * Returns the name of the rescue animal.
     *
     * @return the name of the rescue animal
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the rescue animal.
     *
     * @param name the new name of the rescue animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the type of the rescue animal.
     *
     * @return the type of the rescue animal
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * Sets the type of the rescue animal.
     *
     * @param animalType the new type of the rescue animal
     */
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    /**
     * Returns the gender of the rescue animal.
     *
     * @return the gender of the rescue animal
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the rescue animal.
     *
     * @param gender the new gender of the rescue animal
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns the age of the rescue animal.
     *
     * @return the age of the rescue animal
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the age of the rescue animal.
     *
     * @param age the new age of the rescue animal
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * Returns the weight of the rescue animal.
     *
     * @return the weight of the rescue animal
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the rescue animal.
     *
     * @param weight the new weight of the rescue animal
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Returns the acquisition date of the rescue animal.
     *
     * @return the acquisition date of the rescue animal
     */
    public String getAcquisitionDate() {
        return acquisitionDate;
    }

    /**
     * Sets the acquisition date of the rescue animal.
     *
     * @param acquisitionDate the new acquisition date of the rescue animal
     */
    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }



    /**
     * Returns the acquisition country of the rescue animal.
     *
     * @return the acquisition country of the rescue animal
     */
    public String getAcquisitionLocation() {
        return acquisitionCountry;
    }

    /**
     * Sets the acquisition country of the rescue animal.
     *
     * @param acquisitionCountry the new acquisition country of the rescue animal
     */
    public void setAcquisitionLocation(String acquisitionCountry) {
        this.acquisitionCountry = acquisitionCountry;
    }

    /**
     * Returns the reservation status of the rescue animal.
     *
     * @return the reservation status of the rescue animal
     */
    public boolean getReserved() {
        return reserved;
    }

    /**
     * Sets the reservation status of the rescue animal.
     *
     * @param reserved the new reservation status of the rescue animal
     */
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    /**
     * Returns the in-service location of the rescue animal.
     *
     * @return the in-service location of the rescue animal
     */
    public String getInServiceLocation() {
        return inServiceCountry;
    }

    /**
     * Sets the in-service location of the rescue animal.
     *
     * @param inServiceCountry the new in-service location of the rescue animal
     */
    public void setInServiceCountry(String inServiceCountry) {
        this.inServiceCountry = inServiceCountry;
    }

    /**
     * Returns the training status of the rescue animal.
     *
     * @return the training status of the rescue animal
     */
    public String getTrainingStatus() {
        return trainingStatus;
    }

    /**
     * Sets the training status of the rescue animal.
     *
     * @param trainingStatus the new training status of the rescue animal
     */
    public void setTrainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
    }
}
