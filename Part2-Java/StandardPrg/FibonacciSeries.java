//Fibonacci Series: 0,1,1,2,3,5,8,13,21,34....
//In Fibonacci series, next number is the sum of previous two numbers.
//The first two numbers of the Fibonacci sequence is 0 followed by 1.
public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,count=10;
        System.out.print(n1+" "+n2);
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        
    }
    
}
