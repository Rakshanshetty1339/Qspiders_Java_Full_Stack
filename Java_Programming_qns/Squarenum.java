//7. WAPTP square of a given number

import java.util.Scanner;

public class Squarenum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int product=num*num;
        System.out.println("Product of given number is: "+product);
    }
    
}
