import java.util.Scanner;

public class Largest_Digit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int large=0;
        while(num>0){
            int ld=num%10;
            if(ld>large){
                large=ld;
            }  
            num=num/10;   
        }
        System.out.println(large);
        
    }
    
}
