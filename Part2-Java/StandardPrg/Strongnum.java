//Strong Number: A strong number is a special number whose sum of the factorial of digits is equal to the original number.
//Eg: 145: 1! + 4! + 5! = 145 (Strong number)
//Eg: 123: 1! + 2! + 3! = 9 (Not a strong number)

import java.util.Scanner;

public class Strongnum {

    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
        int digit=num%10;
        sum=sum+factorial(digit);
        num=num/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        System.out.println(sumOfDigits(num));
        if (num==sumOfDigits(num)) {
            System.out.println("Is a Strong Number"); 
        }
        else{
            System.out.println("Is not a Strong Number");
        }

        

        
    }
    
}
