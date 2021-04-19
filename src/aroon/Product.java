package aroon;
import java.lang.ref.Cleaner;
import java.util.Scanner;
public class Product {
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        System.out.println("enter first number");
        int a= scan.nextInt();
        System.out.println("enter second number");
        int b=scan.nextInt();
    
        int prod=a*b;
        System.out.println(prod);
 }
    }

