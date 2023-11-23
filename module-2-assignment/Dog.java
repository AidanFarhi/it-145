/**
 * The `Dog` class represents a dog with attributes such as assigned space number,
 * weight, and grooming status.
 */
public class Dog {
    private int dogSpaceNumber;
    private double dogWeight;
    private boolean grooming;

    /**
     * Default constructor for the `Dog` class. Initializes attributes to default values.
     */
    public Dog() {
        this.dogSpaceNumber = 0;
        this.dogWeight = 0.0;
        this.grooming = false;
    }

    /**
     * Constructor for creating a `Dog` object with specific attributes.
     *
     * @param dogSpaceNumber The assigned space number for the dog.
     * @param dogWeight The weight of the dog.
     * @param grooming A boolean indicating if the dog requires grooming.
     */
    public Dog(int dogSpaceNumber, double dogWeight, boolean grooming) {
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    /**
     * Constructor for creating a `Dog` object with assigned space number and weight, 
     * assuming grooming status is false by default.
     *
     * @param dogSpaceNumber The assigned space number for the dog.
     * @param dogWeight The weight of the dog.
     */
    public Dog(int dogSpaceNumber, double dogWeight) {
        this(dogSpaceNumber, dogWeight, false);
    }

    /**
     * Constructor for creating a `Dog` object with assigned space number and grooming status, 
     * assuming default weight.
     *
     * @param dogSpaceNumber The assigned space number for the dog.
     * @param grooming A boolean indicating if the dog requires grooming.
     */
    public Dog(int dogSpaceNumber, boolean grooming) {
        this(dogSpaceNumber, 0.0, grooming);
    }

    /**
     * Constructor for creating a `Dog` object with weight and grooming status, 
     * assuming assigned space number is not specified.
     *
     * @param dogWeight The weight of the dog.
     * @param grooming A boolean indicating if the dog requires grooming.
     */
    public Dog(double dogWeight, boolean grooming) {
        this(0, dogWeight, grooming);
    }

    /**
     * Constructor for creating a `Dog` object with assigned space number, 
     * assuming default weight and grooming status is false.
     *
     * @param dogSpaceNumber The assigned space number for the dog.
     */
    public Dog(int dogSpaceNumber) {
        this(dogSpaceNumber, 0.0, false);
    }

    /**
     * Constructor for creating a `Dog` object with weight, assuming assigned space number 
     * is not specified and grooming status is false by default.
     *
     * @param dogWeight The weight of the dog.
     */
    public Dog(double dogWeight) {
        this(0, dogWeight, false);
    }

    /**
     * Constructor for creating a `Dog` object with grooming status, 
     * assuming assigned space number and weight are set to default values.
     *
     * @param grooming A boolean indicating if the dog requires grooming.
     */
    public Dog(boolean grooming) {
        this(0, 0.0, grooming);
    }

    /**
     * Get the assigned space number for the dog.
     *
     * @return The assigned space number.
     */
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

    /**
     * Set the assigned space number for the dog.
     *
     * @param dogSpaceNumber The space number to set.
     */
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    /**
     * Get the weight of the dog.
     *
     * @return The weight of the dog.
     */
    public double getDogWeight() {
        return dogWeight;
    }

    /**
     * Set the weight of the dog.
     *
     * @param dogWeight The weight to set.
     */
    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    /**
     * Check if the dog requires grooming.
     *
     * @return `true` if the dog requires grooming, `false` otherwise.
     */
    public boolean getGrooming() {
        return grooming;
    }

    /**
     * Set whether the dog requires grooming.
     *
     * @param grooming `true` if the dog requires grooming, `false` otherwise.
     */
    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}
