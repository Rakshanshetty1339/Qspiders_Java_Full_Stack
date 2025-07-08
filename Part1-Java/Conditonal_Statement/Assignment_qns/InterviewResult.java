import java.util.Scanner;
//program to check whether a candidate is shortlisted or not for an interview
//      -percentage >60%
public class Asg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage of candidate");
        int per= sc.nextInt();
        if (per>=60){
            System.out.println(per+"% Candidate is shortlisted for interview");
        }
        else {
            System.out.println(per+"% Candidate is not shortlisted for interview");
            }
            sc.close(); 
    }
    
}
