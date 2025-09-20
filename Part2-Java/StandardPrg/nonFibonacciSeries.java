//Non-Fibonacci Series: A non-Fibonacci number is a number that does not appear in the Fibonacci sequence.
//Eg: 4,6,7,9,10,11,12,14,15,16,18,19,20,21,22,23,25,26,27,28,29,30
//it
public class nonFibonacciSeries {
    public static void main(String[] args) {
        int n=30;
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            if(i!=c && i<n)
                System.out.print(i+" ");
            else if(i==c)
                n++;
        }
    }
    
}
    