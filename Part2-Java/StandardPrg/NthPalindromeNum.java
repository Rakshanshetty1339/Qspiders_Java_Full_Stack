import java.util.Scanner;

public class NthPalindromeNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  Nth the number");
        int nth=s.nextInt();
        int slno=0;
        int i=1;
        while (nth>0) {
                int temp=i;
                int rev=0;
                while (temp>0){
                    int digit=temp%10;
                    rev=rev*10+digit;
                    temp/=10;
                }
                if(rev==i){
                    slno++;
                }
                
            if(slno==nth){
                    System.out.println(i);
                    break;
                }
                i++;
            
        }

    }
}
