import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int rev=0;
        while (n>0) {
            int id=n%10;
            rev=rev*10+id;
            n=n/10;
        }
        System.out.println(rev);
        

    }
}
