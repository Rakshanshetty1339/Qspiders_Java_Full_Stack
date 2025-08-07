import java.util.*;
public class PrimeElements {

    public static boolean isPrime(int num){
        
        if(num==1)
            return false;
        else{
            for(int i=2;i<num;i++){
                if(num%i==0)
                return false;
            }
            return true;
        }
    }         
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+"th array elements");
            arr[i]=s.nextInt();
        }
        for(int i=0;i<size;i++){
            if(isPrime(arr[i]))
            System.out.print(arr[i]+" ");

    }
    
    }
}
