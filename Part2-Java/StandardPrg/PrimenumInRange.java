import java.util.Scanner;

public class PrimenumInRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Range");
        int start=s.nextInt();
        int end=s.nextInt();
        
        for(int i=start;i<=end;i++){
            int count=0;
            for(int j=1;j<=i;j++){
            if(i%j==0)
                count++;  
        }
        if(count==2){
            System.out.print(i+" ");

        }
    }
       
    }
    
}
