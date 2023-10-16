package programmehomework;

public class Programme1 {
    //1. Declare two instance variables
    String name = "Harry";
    int age = 25;

    //2. Declare one instance method
    public void programme1() {

    //3.Call both instance variables into the instance method
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    }

    //4.Declare the main method
    public static void main(String[] args){

    //5.Call the above instance method into the Main method and Run the programme

        Programme1 programme =new Programme1();
        System.out.println(programme.name);
        System.out.println(programme.age);

    }

}
