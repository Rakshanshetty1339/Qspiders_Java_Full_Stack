import java.util.Scanner;

public class PrimenumInMethods {

    public static int isprime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)
            count++;
        }

        return  count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        if(isprime(num)==2)
        System.out.println(num+"is prime");
        else{
            System.out.println(num+" is not prime");
        }

    }
}
