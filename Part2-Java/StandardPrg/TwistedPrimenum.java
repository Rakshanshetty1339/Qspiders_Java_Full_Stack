//Twisted Prime number: If a number is a prime  and reversed of the number is also a prime number then it is called as Twisted Prime number.
//Eg: 13 is a prime number and its reverse 31 is also a prime number. So, 13 is a twisted prime number.
//Eg: 17 is a prime number and its reverse 71 is also a prime number. So, 17 is a twisted prime number.
//Eg: 23 is a prime number but its reverse 32 is not a prime number. So, 23 is not a twisted prime number.

import java.util.Scanner;
public class TwistedPrimenum {
public static int isPrime(int num){
    int count=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    return count;
}

public static int reverse(int num){
    int rev=0;
    while (num>0) {
    int digit=num%10;
    rev=rev*10+digit; 
    num=num/10;  
    }
    return rev;
}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number"); 
       // int num=s.nextInt();
       int start=s.nextInt();
       int end=s.nextInt();
       for(int i=start;i<=end;i++){
        if(isPrime(i)==2 && isPrime(reverse(i))==2){
            System.out.println(i+" Twisted prime number");
        }
        // else{
        //     System.out.println("not a twisted prime number");
        // }
        
    }
                                                                                                                               
    }
}