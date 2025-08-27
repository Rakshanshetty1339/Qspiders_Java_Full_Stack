import java.util.*;
class DupilcateArray 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of elements");
		int size=s.nextInt();
		int array[]=new int[size];
		int duplarray[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++){
			array[i]=s.nextInt();
			duplarray[i]=array[i];
		}
		System.out.println("--------------------------------------");
		System.out.println("Original Array: "+Arrays.toString(array));
		System.out.println();
		System.out.println("Duplicate Array: "+Arrays.toString(duplarray));
		System.out.println("--------------------------------------");
		
	}
}
