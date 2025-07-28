import java.util.Scanner;
class NthLargestDigit
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		System.out.println("Enter the Nth number");
		int Nth=s.nextInt();
		int slno=0;
		int nthlarge=9;
		int large=0;
		while(true)
		{
			int temp=num;
			while(temp>0)
				{
					int ld=temp%10;
					if(ld>large && ld< nthlarge)
						{
						large=ld;
						}
					temp=temp/10;
				}
				nthlarge=large;
				slno++;
				if(slno==Nth)
					{
						break;
					}
				
			
		
			
			
		}	
		System.out.println("The "+Nth+" largest number is : "+nthlarge);
	}
}
