//Neon Number: A neon number is a number where the sum of digits of square of the number is equal to the number itself.
 //Example: 9 is a neon number, because 9^2 = 81 and 8 + 1 = 9.
 //Example: 5 is not a neon number, because 5^2 = 25 and 2 + 5 = 7.
public class Neonnumber {
    public static void main(String[] args) {
        int num=9;
        int sq=num*num;
        int sum=0;
        while(sq>0){
            int rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        if(sum==num)
            System.out.println(num+" is a neon number");
        else
            System.out.println(num+" is not a neon number");
    }
    
}
