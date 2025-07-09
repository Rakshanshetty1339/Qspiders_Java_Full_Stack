/*Program to print the instructions to be followed based on the displayed colour in traffic signal
    * Red- Stop and wait for few seconds
    * Yellow- Please be ready to move
    * Green- Thanks for waiting you can go now */
import java.util.Scanner;
public class Traffic_Signal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the colour of the Traffic Signal");
        String signal=s.nextLine();
        switch (signal) {
            case "red":System.out.println("Stop and wait for few seconds");
                break;

            case "yellow":System.out.println("Please be ready to move");
                break;

            case "green":System.out.println("Thanks for waiting you can go now!!");
            break;

            default:System.out.println("Inavlid input....");
                break;
        }

        
    }
    
}
