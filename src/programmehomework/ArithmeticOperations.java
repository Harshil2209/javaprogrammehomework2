package programmehomework;

/**
 * This class provides methods for performing arithmetics on two numbers
 */

public class ArithmeticOperations {
    /**
     * Calculate sum of twp numbers
     */

    public static int add(int num1, int num2){
        return num1 + num2;

    }
    /**
     * Calculate the product of two numbers
     */
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    /**
     * Calculate difference between two numbers
     */
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    /**
     * Calculate divison of two number
     */
    public static double divide(int num1, int num2){
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) num1 / num2;
    }

    /**
     * Calculate the division between two numbers
     */

    public static int remainder(int num1, int num2){
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 % num2;

    }
    /**
     * Main method to test the arithmetic operations
     */
    public static void main(String[] args){
        int num1 = 125;
        int num2 = 24;

        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));
        System.out.println("Remainder: " + remainder(num1, num2));
    }

}
