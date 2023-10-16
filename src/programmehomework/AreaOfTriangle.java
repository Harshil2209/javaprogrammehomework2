package programmehomework;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        //Input the length of the base
        System.out.println("Enter the base of the Triangle");
        double b = s.nextDouble();

        //Input the length of the height
        System.out.println("Enter the height of the Triangle");
        double h = s.nextDouble();

        s.close();
        double area = (b * h) / 2; //calculating the area using the formula
        System.out.println("The area of Triangle is:" + area);
    }
}
