/**
 * The Pet class represents a pet in a pet boarding facility.
 * It includes information such as the type of pet, name, age,
 * available spaces for dogs and cats, the duration of stay,
 * and the amount due for the stay.
 */
public class Pet {

    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    /**
     * Constructs a default Pet object with all attributes initialized with empty values.
     */
    public Pet() {
        this.petType = "";
        this.petName = "";
        this.petAge = 0;
        this.dogSpaces = 0;
        this.catSpaces = 0;
        this.daysStay = 0;
        this.amountDue = 0.0;
    }

    /**
     * Constructs a Pet object with specified values.
     *
     * @param petType   The type of the pet.
     * @param petName   The name of the pet.
     * @param petAge    The age of the pet.
     * @param dogSpaces The available spaces for dogs.
     * @param catSpaces The available spaces for cats.
     * @param daysStay  The duration of the pet's stay.
     * @param amountDue The amount due for the stay.
     */
    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    /**
     * Gets the type of the pet.
     *
     * @return The type of the pet.
     */
    public String getPetType() {
        return petType;
    }

    /**
     * Sets the type of the pet.
     *
     * @param petType The type of the pet.
     */
    public void setPetType(String petType) {
        this.petType = petType;
    }

    /**
     * Gets the name of the pet.
     *
     * @return The name of the pet.
     */
    public String getPetName() {
        return petName;
    }

    /**
     * Sets the name of the pet.
     *
     * @param petName The name of the pet.
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     * Gets the age of the pet.
     *
     * @return The age of the pet.
     */
    public int getPetAge() {
        return petAge;
    }

    /**
     * Sets the age of the pet.
     *
     * @param petAge The age of the pet.
     */
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    /**
     * Gets the available spaces for dogs.
     *
     * @return The available spaces for dogs.
     */
    public int getDogSpaces() {
        return dogSpaces;
    }

    /**
     * Sets the available spaces for dogs.
     *
     * @param dogSpaces The available spaces for dogs.
     */
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    /**
     * Gets the available spaces for cats.
     *
     * @return The available spaces for cats.
     */
    public int getCatSpaces() {
        return catSpaces;
    }

    /**
     * Sets the available spaces for cats.
     *
     * @param catSpaces The available spaces for cats.
     */
    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    /**
     * Gets the duration of the pet's stay.
     *
     * @return The duration of the pet's stay.
     */
    public int getDaysStay() {
        return daysStay;
    }

    /**
     * Sets the duration of the pet's stay.
     *
     * @param daysStay The duration of the pet's stay.
     */
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    /**
     * Gets the amount due for the stay.
     *
     * @return The amount due for the stay.
     */
    public double getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the amount due for the stay.
     *
     * @param amountDue The amount due for the stay.
     */
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}
