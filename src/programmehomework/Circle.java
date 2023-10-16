package programmehomework;

/**
 * Method for calculating properties of a circle.
 */
public class Circle {

    /**
     * Calculate the area of a circle given its radius.
     *
     * radius The radius of circle.
     *The area of the circul.
     */
    public static double calculateArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }

    /**
     * Main method to demonstrate the usage of the calculateArea method.
     */
    public static void main(String[] args){
        double radius =5.0; //hypothetical radius value
        double area =calculateArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

}
