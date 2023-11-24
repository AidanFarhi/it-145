import java.util.Set;

public class Monkey extends RescueAnimal{

    private static final String animalType = "MONKEY";
    private static final Set<String> elligbleSpecies = Set.of(
        "capuchin",
        "guenon",
        "macaque",
        "marmoset", 
        "squirrel monkey",
        "tamarin"
    );
    private double tailLength;
    private double height;
    private double bodyLength;
    private String species;

    public Monkey() {};

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
            double tailLength, 
            double height, 
            double bodyLength, 
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

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Determines whether the given species is an elligble species.
     * 
     * @param species a monkey's species.
     * @return whether or not the species is elligble.
     */
    public static boolean isAnElligbleSpecies(String species) {
        return elligbleSpecies.contains(species.toLowerCase());
    }
}
