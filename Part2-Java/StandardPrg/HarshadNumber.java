// Harshad Number: If a number is divisible by sum of digits
// 18: is a Harshad number because 1 + 8 = 9, and 18 ÷ 9 = 2. 
// 24: is a Harshad number because 2 + 4 = 6, and 24 ÷ 6 = 4. 
// 35: is not a Harshad number because 3 + 5 = 8, and 35 is not divisible by 8. 
// 39: is not a Harshad number because 3 + 9 = 12, and 39 is not divisible by 12.
import java.util.Scanner;

public class HarshadNumber {

    public static int SumofDigits(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numer");
        int num=s.nextInt();
        int temp=num;
        if(temp%SumofDigits(num)==0){
            System.out.println("Number is a harshad number");
        }
         else
         System.out.println("Number is not a Harshad number");
    }
    
}
