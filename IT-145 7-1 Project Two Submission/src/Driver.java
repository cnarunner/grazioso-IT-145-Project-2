import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static final ArrayList<Dog> dogList = new ArrayList<>();
    private static final ArrayList<Monkey> monkeyList = new ArrayList<>();
    // Instance variables (if needed)

    /**
     * Loop that displays the menu, accepts the users input and takes the appropriate action.
     * Validates user input -- All input to only accept 1, 2, 3, 4, 5, 6, or q
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        initializeDogList();
        initializeMonkeyList();

        // main loop
        while (true) {
            displayMenu();
            userInput = scnr.next().toLowerCase();  // collects the first character of the input
            scnr.nextLine();  // clears left-over input, whitespace, or newline
            switch ( userInput ) {
                case "1" -> intakeNewDog(scnr);
                case "2" -> intakeNewMonkey(scnr);
                case "3" -> reserveAnimal(scnr);
                case "4" -> printAnimals("dog");
                case "5" -> printAnimals("monkey");
                case "6" -> printAnimals("available");
                case "q" -> System.exit(0);
                default -> System.out.println("Please enter: '1', '2', '3', '4', '5', '6' or 'q'");
            }
        }
    }

    /**
     * Prints the main menu options
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
     * Adds dogs to a list for testing
     * Optional for testing
     */
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        Dog dog4 = new Dog("Doug", "Border Collie", "male", "5", "40","06-24-2018", "United States","in service", false, "United States");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }


    /**
     * Adds monkeys to a list for testing
     * Optional for testing
     */
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Geraldine", "Tamarin","female", "4", "1.5", "14", "6", "10", "07-15-2021", "Brazil", "in service", false, "United States");

        monkeyList.add(monkey1);
    }


    /**
     * Add new dog with all parameters set.
     * <p>
     * Input validation to check that the dog is not already in the list is done for you.
     * @param scnr gets user input to be assigned to variable
     */
    public static void intakeNewDog(Scanner scnr) {
        String userInput;
        boolean reserved = false;
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();

        // Input validation
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Adds all of the input dog information to the new dog
        System.out.println("What is the dog's breed?");
        String breed = scnr.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scnr.nextLine();

        System.out.println("What is the dog's age?");
        String age = scnr.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scnr.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scnr.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scnr.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scnr.nextLine();

        // loop to validate yes or no for boolean variable
        do {
            System.out.println("Is the dog in reserve? Input 'yes' or 'no'.");
            userInput = scnr.next();
            if (userInput.equals("yes")) {
                reserved = true;
            }
        } while (!userInput.equals("yes") && !userInput.equals("no"));

        System.out.println("What is the dog's service country?");
        String inServiceCountry = scnr.nextLine();

        // Adds new monkey to list
        Dog dog = new Dog( name, breed, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        dogList.add(dog);

    }


    /**
     * Instantiate and adds the new monkey to the appropriate list.
     * Validates the input to make sure the monkey doesn't already exist and the species type is allowed
     * @param scnr gets user input to be assigned to variable
     */
    public static void intakeNewMonkey(Scanner scnr) {
        String[] allowedSpecies = { "Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"};
        String userInput;
        boolean reserved = false;

        System.out.println("What is the monkey's name?");
        String name = scnr.nextLine();
        System.out.println("What is the monkey's species?");
        String monkeySpecies = scnr.nextLine();

        for ( Monkey monkey : monkeyList ) { // for each monkey in the list
            if ( monkey.getName().equalsIgnoreCase(name) ) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
            boolean isAllowedSpecies = Arrays.asList( allowedSpecies ).contains( monkeySpecies );
            if ( !isAllowedSpecies ) {
                System.out.println("\n\nThat is not an allowed species\n\n");
                return; //returns to menu
            }
        }

        // Adds all of the input monkey information to the new monkey
        System.out.println("What is the monkey's gender?");
        String gender = scnr.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scnr.nextLine();

        System.out.println("What is the monkey's weight?");
        String weight = scnr.nextLine();

        System.out.println("What is the monkey's tail length");
        String tailLength = scnr.nextLine();

        System.out.println("What is the monkey's height?");
        String monkeyHeight = scnr.nextLine();

        System.out.println("What is the monkey's body length?");
        String bodyLength = scnr.nextLine();

        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scnr.nextLine();

        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scnr.nextLine();

        System.out.println("What is the monkey's training status?");
        String trainingStatus = scnr.nextLine();

        // loop to validate yes or no for boolean variable
        do {
            System.out.println("Is the monkey in reserve? Input 'yes' or 'no'.");
            userInput = scnr.next();
            if (userInput.equals("yes")) {
                reserved = true;
            }
        } while (!userInput.equals("yes") && !userInput.equals("no"));

        System.out.println("What is the monkey's service country?");
        String inServiceCountry = scnr.nextLine();

        // Adds new monkey to list
        Monkey monkey = new Monkey(name, monkeySpecies, gender, age, weight, tailLength, monkeyHeight, bodyLength, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        monkeyList.add(monkey);

    }

    /**
     * Has User input an animal type and the service country wanted.
     * <p>
     * If an animal is found that is in the country requested and not in reserve, the animal's name is printed,
     * and the status of reserve is set to true.
     *
     * @param scnr gets user input to be assigned to variable
     */
    public static void reserveAnimal(Scanner scnr) {
        System.out.println("Input animal type");
        String animalType = scnr.next().toLowerCase();
        scnr.nextLine();  // clears left-over whitespace or newline

        System.out.println("Input service country");
        String serviceCountry = scnr.nextLine();

        if ( animalType.equals("dog") ) {
            for ( Dog dog : dogList ) {
                if ( !dog.getReserved() && serviceCountry.equals(dog.getInServiceLocation())) {
                    System.out.println("Changing reserve status to 'true' for " + dog.getName());
                    dog.setReserved(true);
                    break; // returns to menu
                }
            }
        }

        if (animalType.equals("monkey")) {
            for (Monkey monkey : monkeyList) {
                if ( !monkey.getReserved() && serviceCountry.equals(monkey.getInServiceLocation())) {
                    System.out.println("Changing reserve status to 'true' for " + monkey.getName());
                    monkey.setReserved(true);
                }
            }
        }
    }

    /**
     * Prints information based on parameter used.
     * <p>
     * The printAnimals() method has three different outputs based on the listType parameter
     * <p>dog - prints the list of dogs</p>
     * <p>monkey - prints the list of monkeys</p>
     * <p>available - prints a combined list of all animals that are fully trained ("in service") but not reserved</p>
     * @param action can be dog, monkey, or available; will print different information based on parameter used.
     */
    public static void printAnimals(String action) {

        if (action.equals("dog")) {
            System.out.println("The action print dog needs to be implemented");
        }

        if (action.equals("monkey")) {
            System.out.println("The action print monkey needs to be implemented");
        }

        if (action.equals("available")) {
            System.out.println("\n\nThese animals are fully trained and not in reserve.");
            System.out.println("___________________________________________________");
            for (Dog dog: dogList) {
                if ( dog.getTrainingStatus().equals("in service") && !dog.getReserved() ) {
                    printDog(dog);
                }

            }
            for (Monkey monkey: monkeyList) {
                if ( monkey.getTrainingStatus().equals("in service") && !monkey.getReserved()){
                    printMonkey(monkey);
                }
            }
        }
    }

    /**
     * Prints dog name, status, acquisition country and reserve status.
     * @param dog object from printAnimals()
     */
    public static void printDog(Dog dog) {
        System.out.print("Dogs\n\n" +
                         "Name: " + dog.getName() + "\n" +
                         "Status: " + dog.getTrainingStatus() + "\n" +
                         "Acquisition country: " + dog.getAcquisitionLocation() + "\n" +
                         "Reserved: " + dog.getReserved() + "\n\n");
    }

    /**
     * Prints monkey name, status, acquisition country and reserve status.
     * @param monkey object from printAnimals()
     */
    public static void printMonkey(Monkey monkey) {
        System.out.print("Monkeys\n\n" +
                         "Name: " + monkey.getName() + "\n" +
                         "Status: " + monkey.getTrainingStatus() + "\n" +
                         "Acquisition country: " + monkey.getAcquisitionLocation() + "\n" +
                         "Reserved: " + monkey.getReserved() + "\n\n");
    }
}

