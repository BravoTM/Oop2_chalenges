package Exceptions;


public class ArithmeticJava{
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;

        try{
        int ans = num1 / num2; // This will cause an ArithmeticException
        System.out.println("The answer is: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program continues after handling the exception.");
        }
    }
}