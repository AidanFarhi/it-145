import java.util.Set;

/**
 * The {@code Monkey} class represents a monkey that is part of a rescue operation.
 * It extends the {@link RescueAnimal} class and includes additional attributes
 * specific to monkeys, such as tail length, height, body length, and species.
 *
 * <p>Instances of this class are used to store information about individual monkeys
 * in the system. It provides methods to access and modify the attributes of a monkey,
 * as well as a static method to check whether a given species is elligble.
 *
 * @author Aidan Farhi
 * @version 1.0
 * @see RescueAnimal
 */
public class Monkey extends RescueAnimal {

    private static final String animalType = "MONKEY";
    private static final Set<String> eligibleSpecies = Set.of(
        "capuchin",
        "guenon",
        "macaque",
        "marmoset",
        "squirrel monkey",
        "tamarin"
    );
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;

    /**
     * Default constructor for the {@code Monkey} class.
     * Creates an empty instance of a monkey with default attribute values.
     */
    public Monkey() {
    }

    /**
     * Constructs a new {@code Monkey} object with the specified attributes.
     *
     * @param name              the name of the monkey
     * @param gender            the gender of the monkey
     * @param age               the age of the monkey
     * @param weight            the weight of the monkey
     * @param acquisitionDate   the date when the monkey was acquired
     * @param acquisitionCountry the country from which the monkey was acquired
     * @param trainingStatus    the training status of the monkey
     * @param reserved          a boolean indicating whether the monkey is reserved
     * @param inServiceCountry  the country where the monkey is in service
     * @param tailLength        the length of the monkey's tail
     * @param height            the height of the monkey
     * @param bodyLength        the length of the monkey's body
     * @param species           the species of the monkey
     */
    public Monkey(
            String name,
            String gender,
            String age,
            String weight,
            String acquisitionDate,
            String acquisitionCountry,
            String trainingStatus,
            boolean reserved,
            String inServiceCountry,
            String tailLength,
            String height,
            String bodyLength,
            String species) {
        super(
            name, animalType, gender, age, weight, acquisitionDate,
            acquisitionCountry, trainingStatus, reserved, inServiceCountry
        );
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
        this.species = species;
    }

    /**
     * Returns the length of the monkey's tail.
     *
     * @return the tail length of the monkey
     */
    public String getTailLength() {
        return tailLength;
    }

    /**
     * Sets the length of the monkey's tail.
     *
     * @param tailLength the new tail length of the monkey
     */
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    /**
     * Returns the height of the monkey.
     *
     * @return the height of the monkey
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the height of the monkey.
     *
     * @param height the new height of the monkey
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Returns the length of the monkey's body.
     *
     * @return the body length of the monkey
     */
    public String getBodyLength() {
        return bodyLength;
    }

    /**
     * Sets the length of the monkey's body.
     *
     * @param bodyLength the new body length of the monkey
     */
    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

    /**
     * Returns the species of the monkey.
     *
     * @return the species of the monkey
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the species of the monkey.
     *
     * @param species the new species of the monkey
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Determines whether the given species is eligible.
     *
     * @param species a monkey's species
     * @return {@code true} if the species is eligible, {@code false} otherwise
     */
    public static boolean isAnEligibleSpecies(String species) {
        return eligibleSpecies.contains(species.toLowerCase());
    }

    /**
     * Prints all elligble species.
     */
    public static void printEllibleSpecies() {
        eligibleSpecies.stream().forEach(System.out::println);
    }
}
