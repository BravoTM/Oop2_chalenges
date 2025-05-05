//using if statement to veriffy voting eligibility
class VotingEligibility {
    void checkEligibility() {
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        }

        if (age >= 18 && !isCitizen) {
            System.out.println("You are old enough, but only citizens can vote.");
        } else if (age < 18) {
            System.out.println("You are not old enough to vote.");
        }
    }

    public static void main(String[] args) {
        (new VotingEligibility()).checkEligibility();
    }
}
