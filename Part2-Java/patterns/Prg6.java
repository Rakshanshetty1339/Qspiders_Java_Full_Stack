class  Prg6
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=9;
		for(int r=1;r<=5;r++){
			for(int c=1;c<=9;c++){
				if(c==a||c==b)
					System.out.print(" * ");
				else
					System.out.print("   ");6
			
			}
		System.out.println();
		a++;
		b--;
		
	}
}
}
