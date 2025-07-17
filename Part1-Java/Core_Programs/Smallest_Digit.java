import java.util.Scanner;

public class Smallest_Digit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int smallest=10;
        while(num>0){
            int ld=num%10;
            if(ld<smallest){
                smallest=ld;
            }  
            num=num/10;   
        }
        System.out.println(smallest); 
        
    }
    
}
