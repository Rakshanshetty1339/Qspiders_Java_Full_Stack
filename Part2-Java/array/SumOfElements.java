import java.util.*;
class SumOfElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the length of array");
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
        System.out.println("Enter the "+(i+1)+"th array elements");
            arr[i]=s.nextInt();
        }
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of array elements are: "+sum);       
    }
}