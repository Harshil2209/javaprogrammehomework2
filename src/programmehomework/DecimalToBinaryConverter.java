package programmehomework;

import java.util.Scanner;

public class DecimalToBinaryConverter {

    /**
     * Converts decimal number to binary.
     */
    public static String decimalToBinary(int decimalNumber){
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0){
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }
        return binary.toString();
    }
    /**
     * Main method to execute the programme
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryNumber);
    }



}


