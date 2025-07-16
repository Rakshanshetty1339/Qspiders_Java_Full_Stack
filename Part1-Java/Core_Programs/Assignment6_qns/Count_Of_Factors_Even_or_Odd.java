package Assignment6_qns;
import java.util.Scanner;

public class Count_Of_Factors_Even_or_Odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=s.nextInt();
        int count=0;
        System.out.print("The Factors of numbers are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0)
            {
                System.out.print(" "+i+" ");
                count++;
            }
        }
        if(count%2==0)
        {
            System.out.println("");
            System.out.println("Count of factor of number "+num+" is  Even");
        }
        else{
            System.out.println("Count of factor of number "+num+" is odd");
        }
        }
         
    }  
    
    
