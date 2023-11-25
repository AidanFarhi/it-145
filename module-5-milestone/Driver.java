import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    private static final ArrayList<Dog> dogList = new ArrayList<>();
    private static final ArrayList<Monkey> monkeyList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static char menuChoice = ' ';

    public static void main(String[] args) {
        initializeDogList();
        initializeMonkeyList();
        while (menuChoice != 'q') {
            displayMenu();
            menuChoice = scanner.nextLine().charAt(0);
            if(!menuChoiceIsValid(menuChoice)) continue;
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
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    /**
     * Initializes several Monkey objects and puts them in a List.
     */
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey(
            "George", "male", "3", "23.5", "01-01-2017", 
            "Peru", "in service", false, 
            "United States", 32.4, 23.0, 54.2, "capuchin"
        );
        Monkey monkey2 = new Monkey(
            "Bingo", "female", "2", "25.5", "03-21-2020", 
            "Gabon", "in service", true, 
            "United States", 35.4, 53.0, 74.2, "tamarin"
        );
        Monkey monkey3 = new Monkey(
            "Chunky", "male", "8", "234.5", "11-24-2021", 
            "Peru", "in service", false, 
            "Canada", 13.4, 15.0, 21.2, "guenon"
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
        if (dogIsInSystem(name)) return;
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender (male/female)?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date (MM-DD-YYYY)?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's in-service country?");
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
        // Check if the monkey is already present.
        if (monkeyIsInSystem(name)) return;
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();
        // Check if the species is elligble.
        if (!Monkey.isAnElligbleSpecies(species)) return;
        System.out.println("What is the monkey's gender (male/female)?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's height?");
        double height = scanner.nextDouble();
        System.out.println("What is the monkey's tail length?");
        double tailLength = scanner.nextDouble();
        System.out.println("What is the monkey's body length?");
        double bodyLength = scanner.nextDouble();
        System.out.println("What is the monkey's acquisition date (MM-DD-YYYY)?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the monkey's in-service country?");
        String inServiceCountry = scanner.nextLine();
        monkeyList.add(new Monkey(
                name, gender, age, weight, acquisitionDate, acquisitionCountry, 
                "intake", false, inServiceCountry, tailLength,
                height, bodyLength, species
            )
        );
    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("The method reserveAnimal needs to be implemented");
    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved 
    // Remember that you only have to fully implement ONE of these lists. 
    // The other lists can have a print statement saying "This option needs to be implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(String listType) {
        switch (listType.toLowerCase()) {
            case "dog":
                System.out.println("printing all dogs...");
                break;
            case "monkey":
                System.out.println("printing all monkeys...");
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
    private static void printAvailableAnimals() {
        System.out.println("- available animals -");
        // print all available dogs
        for (Dog dog : dogList) {
            if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                System.out.println(
                    dog.getName() + " | " + dog.getTrainingStatus() + " | " +
                    dog.getAcquisitionLocation() + " | " + dog.getReserved()
                );
            }
        }
        // print all available monkeys
        for (Monkey monkey : monkeyList) {
            if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                System.out.println(
                    monkey.getName() + " | " + monkey.getTrainingStatus() + " | " +
                    monkey.getAcquisitionLocation() + " | " + monkey.getReserved()
                );
            }
        }
    }

    /**
     * Determines whether a given menu choice is valid.
     * 
     * @param menuChoice the menu choice.
     * @return whether or not the menu choice was valid.
     */
    public static boolean menuChoiceIsValid(char menuChoice) {
        // Check if menuChoice is a digit.
        if (Character.isDigit(menuChoice)) {
            int menuChoiceInt = Integer.parseInt(Character.toString(menuChoice));
            // menuChoice needs to be within the following interval: [1, 6].
            if (!(1 <= menuChoiceInt && menuChoiceInt <= 6)) {
                return false;
            }
        } else if (menuChoice != 'q') { // Check if 'q' was entered
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
            if (dog.getName().equalsIgnoreCase(dogName)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return true;
            }
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
            if (monkey.getName().equalsIgnoreCase(monkeyName)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return true;
            }
        }
        return false;
    }

    /**
     * Determines which method to call based on the given menu choice and calls the method.
     * 
     * @param menuChoice the menu choice.
     */
    public static void handleMenuChoice(char menuChoice) {
        switch (menuChoice) {
            case '1':
                intakeNewDog(scanner);
                break;
            case '2':
                intakeNewMonkey(scanner);
                break;
            case '3':
                reserveAnimal(scanner);
                break;
            case '4':
                printAnimals("dogs");
                break;
            case '5':
                printAnimals("monkeys");
                break;
            case '6':
                printAnimals("available");
                break;
            default:
                System.out.println("invalid input.");
                break;
        }
    }
}
