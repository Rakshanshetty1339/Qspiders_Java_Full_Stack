//6.WAPT swap two numbers with Using third variable

import java.util.Scanner;

public class SwapNumUsingThirdVaraible {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping");
        System.out.println(num1);
        System.out.println(num2);
    }
    
}
