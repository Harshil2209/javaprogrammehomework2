package programmehomework;

/**
 * This class demonstrates the usage of instance and static variables, instance ans static methods,and the main method in Java.
 */
public class Programme4 {
    
    //4.1 Declare two insrtance and two static variables.
    int instanceVariable1;
    String instanceVariable2;
    double stiticVariable1;
    boolean staticVariable2;

    /**
     * Instance method that prints the values of instance and static variables.
     */
    public void instanceMethod(){
        //4.4 : Call all four instance and static variables into both instance and static methods inside the print statement.
        System.out.println("Instance Mehtod:");
        System.out.println("Instance Variable 1: " + instanceVariable1);
        System.out.println("Instance Variable 2: " + instanceVariable2);
        System.out.println("Static Variable 1: " +  stiticVariable1);
        System.out.println("Static Variable 2: " + staticVariable2);
    }

    /**
     * The main method is the entry point of the programme.
     * It calls both the instance and static methods to demonstrate their usage.
     */
    
    public static void main(String[] args){
        //4.6 Call both instance and static methods into the Main method and run the programme.
        Programme4 pragramme =new Programme4();
        pragramme.instanceMethod();
        staticMethod();
    }

    public static void staticMethod() {
    }

}
