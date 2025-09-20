//Perfect Number: Sum of factors of a given number ia also same number (excluding that number)
//6: 1,2,3 (1+2+3=6) , 28: 1,2,4,7,14 (1+2+4+7+14=28)
//12: 1,2,3,4,6 (1+2+3+4+6=16) Not a perfect number
//97: 1 (1=97) Not a perfect number

import java.util.Scanner;
public class PerfectNum {

    public static int sumOfFactors(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
             sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num =s.nextInt();
        System.out.println(sumOfFactors(num));
        if (num==sumOfFactors(num)) {
            System.out.println("Perfect Number");   
        }
        else {            
            System.out.println(" Not Perfect Number");   
        }
    }
    
} 
