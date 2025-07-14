import java.util.Scanner;

class SwapNumber {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the start and end of Range");
    int num1=s.nextInt();
    int num2=s.nextInt();
    num2=num1+num2;
    num1=num2-num1;
    num2=num2-num1;
    System.out.println(num1);
    System.out.println(num2);
    } 
}

