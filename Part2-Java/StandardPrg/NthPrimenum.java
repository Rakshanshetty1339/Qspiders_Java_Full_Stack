//Nth Prime number: A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers. 
//A natural number greater than 1 that is not prime is called a composite number. 
//For example, 5 is prime because the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself.
//The first ten prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
import java.util.Scanner;

public class NthPrimenum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int nth=s.nextInt();
        int count=0,slno=0,num=1;
        while (num>0) {
            count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
                if(count==2){
                    slno++;
                }
                if(slno==nth){
                    System.out.println(num);
                    break;
                }
                num++;
            }    
        }   
    }    

