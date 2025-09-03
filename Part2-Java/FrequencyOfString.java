import java.util.*;
public class FrequencyOfString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String");
        String str= new String(s.next());
        int count=0;
        char arr[]=str.toCharArray();
        char arr1[]=new char[arr.length];
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr.length;j++){
                // if(arr[j]==-1)

                if (arr[i]==arr1[j]) {
                    count++;
                    arr1[j]=' ';
                }
                System.out.println("no of rep of "+arr[j]+ "is :"+ count);
            }

        }


    }

    
}