package programmehomework;

import java.util.Scanner;

/**
 * This class represent a calculator with addition,subtrsaction,multiplication, and divition method.
 */
public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner object for user input
        System.out.println("Hello! Please input first number and press enter:");
        int a =scanner.nextInt(); //saving first user input
        System.out.println("Awsome! Now please input second number and press enter:");
        int b = scanner.nextInt(); //saving second user input
        addition(a, b); //addtion static method call
        subtraction(a, b); //subtraction static method call
        Calculator obj = new Calculator(); //object creation
        obj.division(a, b); //instance method call through object
        obj.multiplication(a, b); //instance method call through object
        scanner.close(); //closing scanner
    }

    //static method
    public static void addition(int a, int b){
        int add = a + b;
        System.out.println("The addition of the two numbers is:" + add);
    }

    //static method
    public static void subtraction(int a, int b){
        int sub = a - b;
        System.out.println("The subtrction of the two numbers is: " + sub);
    }

    //instance method
    public void division(int a, int b){
        int div = a/b;
        System.out.print("The division of the two numbers is: " + div);
    }

    //instance method
    public void multiplication(int a, int b){
        int mul =a + b;
        System.out.println("The multiplication of the two numbers is: " + mul);
    }

}


