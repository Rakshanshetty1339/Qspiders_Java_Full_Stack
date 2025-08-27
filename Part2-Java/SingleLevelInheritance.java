class SingleLevelInheritance 
{
	int i=20;
	public void parent(){
		System.out.println("In parent");
	}
}
	class Sample extends SingleLevelInheritance{
		int j=50;
		public void child(){
			System.out.println("In child");
		}
	
	
	public static void main(String[] args) 
	{
		Sample slh=new Sample();
		slh.ample();
		
	}
}
