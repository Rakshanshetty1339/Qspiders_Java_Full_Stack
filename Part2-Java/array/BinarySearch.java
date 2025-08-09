import java.util.*;
 class BinarySearch 
{
	public static boolean targetvalue(int arr[],int target){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==target)
				return true;
			else if(target>arr[mid])
				low=mid+1;
			else
				high=mid-1;
				
		}
		return false;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		Arrays.sort(arr);
		System.out.println("Enter the target elements");
		int target=s.nextInt();
		
		System.out.println("is target found: "+targetvalue(arr,target));
		
		
	}
}
