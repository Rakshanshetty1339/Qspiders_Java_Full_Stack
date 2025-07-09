import java.util.Scanner;
public class Stream {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Stream");
        String str=s.nextLine().toLowerCase();
        switch (str) {
            case "cse":System.out.println("Computer Science and Engineering");
                break;
            case "ece":System.out.println("Electronics and Communication Engineering");
                break;
            case "eee":System.out.println("Electronics and Electrical Engineering");
                break;
            case "mec":System.out.println("Mechanical Engineering");
                break;
            case "ise":System.out.println("Information Science and Engineering");
                break;
            default:System.out.println("Invalid Stream Entered");
                break;
        }
        }
        
    }
    

