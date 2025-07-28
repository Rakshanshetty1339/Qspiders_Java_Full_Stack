import java.util.Scanner;
class Range_Of_Primenumbers
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in):
		System.out.println("Enter the range");
		int start=s.nextInt();
		int end=s.nextInt();
		for(int i=start;i<=end;i++){
			System.out.println("Enter the number");
			int num=s.nextInt();
			int count=0;
			for(int j=1;j<=num;j++){
				if(i%j!==0)
					count++;
			}
		}
		
				
	}
}
