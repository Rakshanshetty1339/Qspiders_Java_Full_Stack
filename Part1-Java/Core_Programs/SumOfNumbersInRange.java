import java.util.Scanner;
class SumOfNumbersInRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of Range" );
        int start=s.nextInt();
        int end=s.nextInt();
        int sum=0;
        for(int i=start;i<=end;++i){
            //In for loop the post and pre increments are same.
            //"It only matters when you use the result of the expression".
            //the increment happens after the loop body is executed and before the next iteration starts.
            //so in looping Statements pre increment and post increments are same.
            sum+=i;
        }
        System.out.println("Sum of the Range is: "+sum);
    }   
}
