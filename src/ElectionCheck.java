import java.util.Scanner;

class ElectionCheck {
    Scanner scanner = new Scanner(System.in);

    public void checkVotingEligibility() {
        String name;
        int age;
        boolean isCitizen;

        System.out.print("What is your name? ");
        name = scanner.next();

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        isCitizen = scanner.nextBoolean();

        System.out.println("\n--- Eligibility Result ---");

        if (age >= 18 && isCitizen) {
            System.out.println("Hello " + name + ", you are eligible to vote.");
        } else if (age >= 18) {
            System.out.println("Hello " + name + ", you are old enough but not a citizen.");
        } else {
            System.out.println("Hello " + name + ", you are not eligible to vote yet.");
        }
    }

    public static void main(String[] args) {
        (new ElectionCheck()).checkVotingEligibility();
    }
}
