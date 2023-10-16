package programmehomework;

public class Rectangle {

    public static void main(String[] args){

        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width);


        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
        System.out.print("Area is %.1f * %.1f = %.2f \n, width, height, area");
    }
}

