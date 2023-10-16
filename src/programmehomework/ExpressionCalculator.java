package programmehomework;

/**
 * This class contains a method to compute the specified expression and print the output.
 */

public class ExpressionCalculator {
        public static void computeExpression () {
            double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
            System.out.println("The result of the Expression is: " + result);
        }

    /**
     * Main method to run programme and compute the expression
     */
    public static void main(String[] args){
        computeExpression();
    }



}
