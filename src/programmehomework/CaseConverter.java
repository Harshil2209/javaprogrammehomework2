package programmehomework;

public class CaseConverter {
    /**
     * Convert a string from upper case to lower case
     */
    public static String convertToLowerCase(String input){
        return input.toLowerCase();
    }

    /**
     * Main method to to demontrate the usage of the case conversion.
     */
    public static void main(String[] args){
        String input = "HELLLO WORLD";
        String convertedString = convertToLowerCase(input);
        System.out.println("Converted string: " + convertedString);
    }

}
