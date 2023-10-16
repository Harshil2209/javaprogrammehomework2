package programmehomework;

/**
 * This class demostrates the usage of static variables and methods in java.
 */
public class Programme2 {
    // Step 2.1: Declare two static variables
   static int num1 = 10;
   static int num2 = 20;

    /**
     *  This method prints the vaalues of static variables.
     */
      static void printStaticVariabes (){
          // 2.3: Call both static variables into the static method inside the print statement.
          System.out.println("num1: " + num1);
          System.out.println("numb2: " + num2);
      }

    /**
     * Write main method of programm.
     */
    public static void main(String[] args){
        // Step 2.5: Call the static method into the MAin amethod and Run the programme.
        printStaticVariabes();
    }

}
