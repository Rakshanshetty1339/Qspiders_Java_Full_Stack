package Assignment5_qns;

//Write a Program to add two numbers without using arithmetic operator
import java.util.Scanner;

public class Add_Num_Without_Arithmetic_Operator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=s.nextInt();
        System.out.println("Enter second number");
        int b=s.nextInt();
        while(b!=0)
            {
                int carry=a&b;
                a=a^b;
                b=carry<<1;
                }        
        System.out.println("Sum of two numbers is "+a);
        }
        

       


    }
    

