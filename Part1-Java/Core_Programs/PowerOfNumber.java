import java.util.Scanner;

public class PowerOfNumber {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        System.out.println("Enter the power");
        int power=s.nextInt();
        int result=1;
        for(int i=1;i<=power;i++)//We can skip the "{}" when we have only one line in the if block of code
             result=result*num;
        System.out.println(result);

}
}