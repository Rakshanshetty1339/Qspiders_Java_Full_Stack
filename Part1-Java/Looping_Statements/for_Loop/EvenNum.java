import java.util.Scanner;
class EvenNum{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and End of the range");
        int start=s.nextInt();
        int end=s.nextInt();
            for(int i=start;i<=end;i++){
                if(i%2==0){
                     System.out.print(i+" ");
                }
            }
    }
    
}
        
    

