package Assignment6_qns;

import java.util.Scanner;

public class Factor_Of_Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of number is: "+fact);
        System.out.println("");
        System.out.print("Factor of factorial of number is: ");
        for(int i=1;i<=fact;i++){
            if(fact%i==0){
                System.out.print( " "+i+" ");
            }
        }
    }
    
}
