package programmehomework;

import java.util.Scanner;

/**
 * This class calculates the average of three numbers.
 */
public class AverageCalculator {

    /** Calculate the average of three numbers
     *
     * num1 The first number
     * num2 The second number
     * num3 The third number
     * Return the average of the three numbers
     */
    public static double calculateAverage(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3;

    }
    /**
     * Main method for take user input and calculate the average
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average of three number is: " + average);
        scanner.close();
    }
}
