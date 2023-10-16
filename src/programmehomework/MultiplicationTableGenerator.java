package programmehomework;

/**
 * Class contain a method to generate and print the multiplication table of a given number.
 */
public class MultiplicationTableGenerator {
    /**
     * Generates and prints the multiplication table of a given number up to 10
     * The number for which the multiplication table needs to be generated
     */
    public static void generateMultiplicationTable(int number){
        System.out.println("Multiplication Table for " + number + ":");

        for (int i =1; i<=10; i++){
            int result =number * i;
            System.out.println(number + " x "+ i +" = " +result);
        }
    }

    /**
     * Main method to test the MultiplicationTableGenerator.
     */
    public static void main(String[] args) {
        int inputNumber = 8; //Generate other Multiplication table by changing this number
        generateMultiplicationTable(inputNumber);
    }

}
