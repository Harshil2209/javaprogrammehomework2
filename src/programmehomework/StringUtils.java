package programmehomework;

public class StringUtils {
    /**
     * Convert a given string to lowercase
      */
    public static String convertToLowercase(String input){
        return input.toLowerCase();
    }

    /**
     * Main method
     */
    public static void main(String[] args){
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String lowercase = convertToLowercase(input);
        System.out.println("Lowercase string: " + lowercase);
    }


}
