import java.util.Scanner;

class VotingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input
        String name;
        int age;
        boolean isCitizen;

        // Start loop
        while (true) {
            // Ask user to enter name or type "exit" to stop
            System.out.print("\nEnter your name (or type 'exit' to quit): ");
            name = scanner.next();

            // Exit condition
            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }

            // Ask for age
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            // Ask for citizenship status
            System.out.print("Are you a citizen? (true/false): ");
            isCitizen = scanner.nextBoolean();

            // Check eligibility
            if (age >= 18 && isCitizen) {
                System.out.println("Hello " + name + ", you are eligible to vote.");
            } else if (age >= 18 && !isCitizen) {
                System.out.println("Hello " + name + ", you are old enough but not a citizen.");
            } else {
                System.out.println("Hello " + name + ", you are not eligible to vote yet.");
            }
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
