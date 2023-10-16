package programmehomework;

/**
 * Class demonstrates the usage of instance and static variables, instance and static method ,and the main method in Java.
 */
public class Programme3 {
    // Instatnce variable
    int instatnceVariale = 10;

    // Static variable
    int staticVariable = 20;

    /**
     * This method prints the values of the instance and static variable.
     */
    public void printInstanceAndStaticVariables(){
        System.out.println("Instance variable:" + instatnceVariale);
        System.out.println("Static variable:" + staticVariable);
    }

    /**
     * This static method prints the values of the instance and static variables.
     */
    public static void printInstanceAndStaticVariablesStatic(){
        //Creating an instance of the programme class to access the instance variable
        Programme3 programme = new Programme3();
        System.out.println("Instance variable (static method):" + programme.instatnceVariale);
        System.out.println("Static variable (static method): + staticVariable");
    }

    /**
     * The main method of programme.
     */
    public static void main(String[] args){
        //Creating instance of the Programme class
        Programme3 programme = new Programme3();

        //Calling the instatnce method
        programme.printInstanceAndStaticVariables();

        //Calling the static mehtod
        printInstanceAndStaticVariablesStatic();
    }
}
