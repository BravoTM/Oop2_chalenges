public class Greeter {

    void welcome() {
        System.out.println("Welcome to my class alpha");
    }

    public static void main(String[] args) {
        (new Greeter()).welcome();
    }
}