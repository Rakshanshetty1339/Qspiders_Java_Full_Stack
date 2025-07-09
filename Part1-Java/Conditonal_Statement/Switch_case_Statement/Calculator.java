/* Program to demonstrate a calculator which performs the arithmetic operations */
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1=s.nextInt();
        System.out.println("Enter the second number");
        float num2=s.nextInt();
        System.out.println("Enter the operator for calculation");
        char operator=s.next().charAt(0);
        float result;
        switch (operator) {
            case '+':result=num1+num2;
                    System.out.println(result);
                break;
            case '-':result=num1-num2;
                    System.out.println(result);
                break;
            case '*':result=num1*num2;
                    System.out.println(result);
                break;
            case '/':if(num1>num2){
                        result=num1/num2;
                        System.out.println(result);
                        }
                    else{
                        System.out.println("ERROR... ");
                    }
                break;
            case '%':result=num1%num2;
                    System.out.println(result);
                break;
        
            default:System.out.println("Invalid Operator");
                break;
        }
        
    }

    
}
