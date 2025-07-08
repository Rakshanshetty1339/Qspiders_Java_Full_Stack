import java.util.Scanner;
// Progarm to check the person has to pay the income tax or not...
public class Taxcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income of the person:");
        double income = sc.nextInt();
        if (income >= 1200000){
            System.out.println("You have to pay the income tax");
        }
        else {
            System.out.println("You don't have to pay the income tax");
        }
    }
    
}
