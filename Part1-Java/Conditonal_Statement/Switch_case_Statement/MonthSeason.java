import java.util.Scanner;
public class MonthSeason {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the month");
        String str=s.nextLine().toLowerCase();
        switch (str) {
            case "march":
            case "april":
            case "may":
            case "june":System.out.println("Its Summer Season");
                break;
            case "july":
            case "august":
            case "september":
            case "october":System.out.println("Its Rainy Season");
                break;
            case "novermber":
            case "december":
            case "january":
            case "febraury":System.out.println("Its Winter Season");
            break;
    
            default:System.err.println("Invalid month name");
                break;
        }
        
    }
    
}
