import java.util.Scanner;
 class PrintRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and End of the range");
        int start=s.nextInt();
        int end=s.nextInt();
        int i=start;
        do{
            System.out.println(i+" ");
            i++;
        }
        while (i<=end) ;    
        }
    }

    
