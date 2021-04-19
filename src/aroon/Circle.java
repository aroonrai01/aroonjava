package aroon;

import java.util.Scanner;

public class Circle {
    public static void main( String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter radius");
        double r= scan.nextDouble();
        double area=3.14*r*r;
        System.out.println("the of circle is "+area);
        double perimeter=2*3.14*r;
        System.out.println("the perimeter is"+perimeter);
    }
    
}
