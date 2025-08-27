//WAP to reverse an array
import java.util.*;
class  ReverseArray
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int arr[]={1,2,3,4,5};
		int revarray[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			revarray[arr.length-1-i]=arr[i];
		}
		System.out.println("-------------------------------");
		System.out.println("Original array:"+Arrays.toString(arr));
		System.out.println();
		System.out.println("Reverse of array:"+Arrays.toString(revarray));
		System.out.println("-------------------------------");
					
	}
}
