//Perfect Square number: A perfect square is a number that can be expressed as the product of two equal integers.
//For example, 36 is a perfect square because it can be written as 6 × 6 = 36.
//Similarly, 1, 4, 9, 16, and 25 are also perfect squares.
public class PerfectSquarenumOrNot {
    public static void main(String[] args) {
        int num=16;
        int i;
        for(i=1;i*i<=num;i++){
            if(i*i==num){
                System.out.println("Perfect square number");
                break;
            }
        }
        if(i*i!=num)
            System.out.println("Not a perfect square number");
    }
    
}
