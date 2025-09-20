//Magic Number: A magic number is a number which eventually reaches 1 when replaced by the sum of the square of each digit.
//Eg: 123: 1*5 + 2*5 + 3*5 = 1 + 32 + 243 = 246
//Eg: 236: 2*5 + 3*5 + 6*5 = 32 + 243 + 7776 = 8051
public class MagicNumber {
    public static void main(String[] args) {
        int num=123;
        int sum=0;
        int power=0;
        while(num>0){
            int rem=num%10;
            sum=sum+(rem*(int)Math.pow(5, power));
            power++;
            num=num/10;
        }
        System.out.println(sum);
    }
    
}
