import java.util.Scanner;
// Program to check whether a person name starts with 's' or not....
public class charCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        if(name.startsWith("s"))
        {
            System.out.println("Your name starts with 's'");
            }
        else{
            System.out.println("Your name does not start with 's'");
        }
    }
    
}
