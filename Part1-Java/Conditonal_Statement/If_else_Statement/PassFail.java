import java.util.Scanner;
//Program to check whether a student is passed or failed in exam 
//  -marks>=35

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if (marks >=35){
            System.out.println("You are passed");
        }
        else{
            System.out.println("You are failed");   
        }
    }
}
