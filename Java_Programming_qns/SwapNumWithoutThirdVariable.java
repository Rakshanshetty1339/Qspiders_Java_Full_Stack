//5. WAPT swap two numbers without using third variable

import java.util.Scanner;

public class SwapNumWithoutThirdVariable {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1=s.nextInt();
        int num2=s.nextInt();
        num2=num1+num2;
        num1=num2-num1;
        num2=num2-num1;
        System.out.println("After Swapping");
        System.out.println(num1);
        System.out.println(num2);
    }
}
