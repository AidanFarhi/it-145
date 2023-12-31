import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The {@code Driver} class serves as the main entry point for the Rescue Animal System application.
 * It provides functionality for interacting with a list of dogs and monkeys, allowing users to
 * perform actions such as adding new animals, reserving animals, and printing lists of animals.
 *
 * <p>This class uses instances of the {@link Dog} and {@link Monkey} classes to represent dogs
 * and monkeys in the system, respectively. It also utilizes a {@link Scanner} object for user input
 * and maintains lists of dogs and monkeys as {@code ArrayList} objects.
 *
 * @author Aidan Farhi
 * @version 1.0
 * @see Dog
 * @see Monkey
 * @see Scanner
 */
public class Driver {
    
    public static final ArrayList<Dog> dogList = new ArrayList<>();
    public static final ArrayList<Monkey> monkeyList = new ArrayList<>();
    public static final Scanner scanner = new Scanner(System.in);
    public static String menuChoice = "";

    /**
     * The main method of the {@code Driver} class, serving as the entry point for the Rescue Animal System application.
     * It initializes lists of dogs and monkeys, displays the main menu in a loop, and handles user input
     * to perform various actions until the user chooses to quit the application.
     * 
     * @param args the command-line arguments (unused in this application)
     */
    public static void main(String[] args) {
        // Add some dogs and monkeys to each respective ArrayList for testing purposes.
        initializeDogList();
        initializeMonkeyList();
        while (!menuChoice.equals("q")) {
            displayMenu();
            menuChoice = scanner.nextLine();
            // Validate input.
            if(!isValidMenuChoice(menuChoice)) {
                System.out.printf("Error: %s is not a valid option.\n", menuChoice);
                continue;
            }
            handleMenuChoice(menuChoice);
        }
    }

    /**
     * Displays a menu of options to the user.
     */
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    /**
     * Initializes several Dog objects and puts them in a List.
     */
    public static void initializeDogList() {
        Dog dog1 = new Dog(
            "Spot", "male", "1", "25.6", 
            "05-12-2019", "United States", "intake", 
            false, "United States", "German Shepherd"
        );
        Dog dog2 = new Dog(
            "Rex", "male", "3", "35.2", 
            "02-03-2020", "United States", "Phase I", 
            false, "United States", "Great Dane"
        );
        Dog dog3 = new Dog(
            "Bella", "female", "4", "25.6", 
            "12-12-2019", "Canada", "in service", 
            true, "Canada", "Chihuahua"
        );
        Dog dog4 = new Dog(
            "Sparky", "male", "1", "29.6", 
            "01-12-2018", "Canada", "in service", 
            false, "Canada", "Mini Australian Shepard"
        );
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }

    /**
     * Initializes several Monkey objects and puts them in a List.
     */
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey(
            "George", "male", "3", "23.5", "01-01-2017", 
            "Peru", "in service", false, 
            "United States", "32.4", "23.0", "54.2", "capuchin"
        );
        Monkey monkey2 = new Monkey(
            "Bingo", "female", "2", "25.5", "03-21-2020", 
            "Gabon", "in service", true, 
            "United States", "35.4", "53.0", "74.2", "tamarin"
        );
        Monkey monkey3 = new Monkey(
            "Chunky", "male", "8", "234.5", "11-24-2021", 
            "Peru", "in service", false, 
            "Canada", "13.4", "15.0", "21.2", "guenon"
        );
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    /**
     * Prompts user for dog information. If the dog already exists in the system,
     * a message will be displayed. Otherwise, the dog will be entered into the system.
     * 
     * @param scanner used for obtaining input from the user.
     */
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        // Check if the dog is already present in the system.
        if (dogIsInSystem(name)) {
            System.out.println("Error: That dog is already in the system.");
            return;
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender (male/female)?");
        String gender = scanner.nextLine();
        if (!gender.equals("male") && !gender.equals("female")) {
            System.out.println("Error: Gender must be (male/female).");
            return;
        }
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        if (!isValidNumberInput(age)) {
            System.out.println("Error: Age must be a number greater than 0.");
            return;
        }
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        if (!isValidNumberInput(weight)) {
            System.out.println("Error: Weight must be a number greater than 0.");
            return;
        }
        System.out.println("What is the dog's acquisition date (MM-DD-YYYY)?");
        String acquisitionDate = scanner.nextLine();
        if (!isValidDateFormat(acquisitionDate)) {
            System.out.println("Error: Acquisition date must be in the following format: (MM-DD-YYYY).");
            return;
        }
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's in service country?");
        String inServiceCountry = scanner.nextLine();
        dogList.add(new Dog(
                name, gender, age, weight, acquisitionDate, acquisitionCountry, 
                "intake", false, inServiceCountry, breed
            )
        );
    }

    /**
     * Prompts user for monkey information. If the monkey already exists in the system
     * or an ineligble species is entered, a message will be displayed. 
     * Otherwise, the monkey will be entered into the system.
     * 
     * @param scanner used for obtaining input from the user.
     */
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        // Check if the monkey is already present in the system.
        if (monkeyIsInSystem(name)) {
            System.out.println("Error: That monkey is already in the system.");
            return;
        }
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();
        // Check if the species is elligble.
        if (!Monkey.isAnEligibleSpecies(species)) {
            System.out.println("Error: That is not an eligble species.");
            System.out.println("Elligble species:");
            Monkey.printEllibleSpecies();
            return;
        }
        System.out.println("What is the monkey's gender (male/female)?");
        String gender = scanner.nextLine();
        if (!gender.contains("male") && !gender.contains("female")) {
            System.out.println("Error: Gender must be (male/female).");
            return;
        }
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        if (!isValidNumberInput(age)) {
            System.out.println("Error: Age must be a number greater than 0.");
            return;
        }
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        if (!isValidNumberInput(weight)) {
            System.out.println("Error: Weight must be a number greater than 0.");
            return;
        }
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();
        if (!isValidNumberInput(height)) {
            System.out.println("Error: Height must be a number greater than 0.");
            return;
        }
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();
        if (!isValidNumberInput(tailLength)) {
            System.out.println("Error: Tail length must be a number greater than 0.");
            return;
        }
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();
        if (!isValidNumberInput(bodyLength)) {
            System.out.println("Error: Body length must be a number greater than 0.");
            return;
        }
        System.out.println("What is the monkey's acquisition date (MM-DD-YYYY)?");
        String acquisitionDate = scanner.nextLine();
        if (!isValidDateFormat(acquisitionDate)) {
            System.out.println("Error: Acquisition date must be in the following format: (MM-DD-YYYY).");
            return;
        }
        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the monkey's in service country?");
        String inServiceCountry = scanner.nextLine();
        monkeyList.add(new Monkey(
                name, gender, age, weight, acquisitionDate, acquisitionCountry, 
                "intake", false, inServiceCountry, tailLength,
                height, bodyLength, species
            )
        );
    }

    /**
     * Checks whether an input string is a number greater than zero.
     * 
     * @param numberInput the number input to validate.
     * @return whether or not the number input is valid.
     */
    public static boolean isValidNumberInput(String numberInput) {
        try {
            double numberInputDouble = Double.parseDouble(numberInput);
            if (numberInputDouble <= 0) return false;
        } catch (NumberFormatException e) { 
            return false; 
        };
        return true;
    }

    /**
     * Checks whether an input string is a valid date format.
     * 
     * @param dateInput the date input to validate.
     * @return whether or not the date input is valid.
     */
    public static boolean isValidDateFormat(String dateInput) {
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            LocalDate.parse(dateInput, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    /**
     * Prompts user for information regarding the animal they want to reserve and then
     * reserves it if there is a match.
     * 
     * @param scanner used for obtaining input from the user.
     */
    public static void reserveAnimal(Scanner scanner) {
        // Get animal type and in service country from input.
        System.out.println("Enter the animal type (dog/monkey):");
        String animalType = scanner.nextLine();
        if (!animalType.equals("dog") && !animalType.equals("monkey")) {
            System.out.println("Error: Invalid animal type. Available types: (dog/monkey)");
            return;
        }
        System.out.println("Enter the country:");
        String inServiceCountry = scanner.nextLine();
        // Determine whether an available animal matches the criteria.
        RescueAnimal reservedRescueAnimal = null;
        if (animalType.equalsIgnoreCase("dog")) {
            // Find an in service and unreserved dog that has a matching in service country.
            for (Dog dog : dogList) {
                if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !dog.getReserved() &&
                    dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                    dog.setReserved(true);
                    reservedRescueAnimal = dog;
                    break;
                }
            }
        } else { // Animal type is MONKEY
            // Find an in service and unreserved monkey that has a matching in service country.
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !monkey.getReserved() &&
                    monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                    monkey.setReserved(true);
                    reservedRescueAnimal = monkey;
                    break;
                }
            }
        }
        // Print result.
        if (reservedRescueAnimal != null) {
            System.out.println("You have reserved: " + reservedRescueAnimal.getName());
        } else {
            System.out.printf("Sorry, there are no available %ss in %s.\n", animalType, inServiceCountry);
        }
    }

    /**
     * Prints out detailed rescue animal information.
     * 
     * @param listType the type of rescue animal information to print out. 
     *                 <p>"dogs" (prints all dogs in the system)
     *                 <p>"monkeys" (prints all monkeys in the system)
     *                 <p>"available" (prints all available rescue animals in the system)
     */
    public static void printAnimals(String listType) {
        switch (listType.toLowerCase()) {
            case "dogs":
                printAllDogs();
                break;
            case "monkeys":
                printAllMonkeys();
                break;
            case "available":
                printAvailableAnimals();
                break;
            default:
                System.out.println("invalid input. options: [dog|monkey|available]");
                break;
        }
    }

    /**
     * Prints all available animals. The criteria for availability is:
     * <p>
     * - fully trained ("in service")
     * <p>
     * - not reserved
     */
    public static void printAvailableAnimals() {
        String formatString = "| %-18s | %-18s | %-18s | %-18s | %-18s |\n";
        String separatorString = "+%-20s+%-20s+%-20s+%-20s+%-20s+\n";
        String line = "--------------------";
        System.out.println("Available animals:");
        System.out.printf(separatorString, line, line, line, line, line);
        System.out.printf(formatString, "Type", "Name", "Training Status", "In Service Country", "Reserved");
        System.out.printf(separatorString, line, line, line, line, line);
        // print all available dogs
        for (Dog dog : dogList) {
            if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                System.out.printf(
                    formatString, dog.getAnimalType(), dog.getName(), dog.getTrainingStatus(), 
                    dog.getInServiceLocation(), dog.getReserved()
                );
            }
        }
        // print all available monkeys
        for (Monkey monkey : monkeyList) {
            if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                System.out.printf(
                    formatString, monkey.getAnimalType(), monkey.getName(), monkey.getTrainingStatus(), 
                    monkey.getInServiceLocation(), monkey.getReserved()
                );
            }
        }
        System.out.printf(separatorString, line, line, line, line, line);
    }

    /**
     * Prints all dogs in the system.
     */
    public static void printAllDogs() {
        String formatString = "| %-18s | %-18s | %-18s | %-18s | %-18s |\n";
        String separatorString = "+%-20s+%-20s+%-20s+%-20s+%-20s+\n";
        String line = "--------------------";
        System.out.println("Dogs:");
        System.out.printf(separatorString, line, line, line, line, line);
        System.out.printf(formatString, "Type", "Name", "Training Status", "In Service Country", "Reserved");
        System.out.printf(separatorString, line, line, line, line, line);
        // print all available dogs
        for (Dog dog : dogList) {
            System.out.printf(
                formatString, dog.getAnimalType(), dog.getName(), dog.getTrainingStatus(), 
                dog.getInServiceLocation(), dog.getReserved()
            );
        }
        System.out.printf(separatorString, line, line, line, line, line);
    }

    /**
     * Prints all monkeys in the system.
     */
    public static void printAllMonkeys() {
        String formatString = "| %-18s | %-18s | %-18s | %-18s | %-18s |\n";
        System.out.println("Monkeys:");
        String separatorString = "+%-20s+%-20s+%-20s+%-20s+%-20s+\n";
        String line = "--------------------";
        System.out.printf(separatorString, line, line, line, line, line);
        System.out.printf(formatString, "Type", "Name", "Training Status", "In Service Country", "Reserved");
        System.out.printf(separatorString, line, line, line, line, line);
        // print all available dogs
        for (Monkey monkey : monkeyList) {
            System.out.printf(
                formatString, monkey.getAnimalType(), monkey.getName(), monkey.getTrainingStatus(), 
                monkey.getInServiceLocation(), monkey.getReserved()
            );
        }
        System.out.printf(separatorString, line, line, line, line, line);
    }

    /**
     * Determines whether a given menu choice is valid.
     * 
     * @param menuChoice the menu choice.
     * @return whether or not the menu choice was valid.
     */
    public static boolean isValidMenuChoice(String menuChoice) {
        if (menuChoice.length() != 1) { // Check if menuChoice is a single char.
            return false;
        } else if (Character.isDigit(menuChoice.charAt(0))) { // Check if menuChoice is a digit.
            int menuChoiceInt = Integer.parseInt(menuChoice);
            // menuChoice needs to be within the following interval: [1, 6].
            if (!(1 <= menuChoiceInt && menuChoiceInt <= 6)) return false;
        } else if (!menuChoice.equals("q")) { // Check if 'q' was entered
            return false;
        }
        return true;
    }

    /**
     * Determines whether a given dog's name is already in the system.
     * 
     * @param dogName the dog's name.
     * @return whether or not the dog is in the system.
     */
    public static boolean dogIsInSystem(String dogName) {
        for(Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(dogName)) return true;
        }
        return false;
    }

    /**
     * Determines whether a given monkey's name is already in the system.
     * 
     * @param monkeyName the monkey's name.
     * @return whether or not the monkey is in the system.
     */
    public static boolean monkeyIsInSystem(String monkeyName) {
        for(Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(monkeyName)) return true;
        }
        return false;
    }

    /**
     * Determines which method to call based on the given menu choice and calls the method.
     * 
     * @param menuChoice the menu choice.
     */
    public static void handleMenuChoice(String menuChoice) {
        switch (menuChoice) {
            case "1":
                intakeNewDog(scanner);
                break;
            case "2":
                intakeNewMonkey(scanner);
                break;
            case "3":
                reserveAnimal(scanner);
                break;
            case "4":
                printAnimals("dogs");
                break;
            case "5":
                printAnimals("monkeys");
                break;
            case "6":
                printAnimals("available");
                break;
            case "q":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("invalid input.");
                break;
        }
    }
}
