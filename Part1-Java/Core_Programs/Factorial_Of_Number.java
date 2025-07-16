//Program to Print Factorial of a number
import java.util.Scanner;
class Factorial_Of_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of Range");
        int num=s.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of number "+num+" is "+fact);
    }   
}
