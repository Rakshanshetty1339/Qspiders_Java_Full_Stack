import java.util.Scanner;

public class Sorting_Digit_In_Ase_Order {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        String sort="";
        for(int i=0;i<=9;i++){
            int temp=num;
            while (temp>0) {
                int digit=temp%10;
                if(digit==i){
                    sort=sort+i;
                }
                temp=temp/10;        
            } 
        }
    System.out.println(sort);
        
    }
    
}
