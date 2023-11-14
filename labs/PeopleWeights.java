import java.util.ArrayList;
import java.util.Scanner;

public class PeopleWeights {

    private static final int NUMBER_OF_WEIGHTS = 5;
    private static final ArrayList<Double> weights = new ArrayList<>();

    /**
     * Gets weights from input and stores them in an ArrayList.
     * 
     * @param scanner the scanner object used to obtain weights from input.
     */
    public static void getWeightsFromInput(Scanner scanner) {
        for (int i = 1; i <= NUMBER_OF_WEIGHTS; i++) {
            System.out.print("Enter weight " + i + ": ");
            weights.add(scanner.nextDouble());
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Gets all of the weights from the weights ArrayList.
     * 
     * @return a String containing each individual weight.
     */
    public static String getAllWeights() {
        String allWeights = "";
        for (double weight : weights) allWeights += weight + " ";
        return allWeights;
    }

    /**
     * Gets the total weight from the weights ArrayList.
     * 
     * @return the sum of all the weights.
     */
    public static double getTotalWeight() {
        double totalWeight = 0.0;
        for (double weight : weights) totalWeight += weight;
        return totalWeight;
    }

    /**
     * Gets the average weight from the weights ArrayList.
     * 
     * @return the average of all the weights.
     */
    public static double getAverageWeight() {
        return getTotalWeight() / weights.size();
    }

    /**
     * Gets the max weight from the weights ArrayList.
     * 
     * @return the max of all the weights.
     */
    public static double getMaxWeight() {
        double maxWeight = weights.get(0);
        for (double weight : weights) maxWeight = Math.max(maxWeight, weight);
        return maxWeight;
    }

    public static void main(String[] args) {
        // Initialize a Scanner object to obtain input.
        try (Scanner scanner = new Scanner(System.in)) {
            // Get all of the weights from input.
            getWeightsFromInput(scanner);
            // Display the provided input weights along with 
            // statistical data regarding the weights.
            System.out.println("You entered: " + getAllWeights());
            System.out.println("Total weight: " + getTotalWeight());
            System.out.println("Average weight: " + getAverageWeight());
            System.out.println("Max weight: " + getMaxWeight());
        }
    }
}