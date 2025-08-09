class InvertoryManagment 
{
	String ProductName;
	double ProductPrize;
	int Quantity;
	InvertoryManagment(String ProductName, Double ProductPrize, int Quantity){
		this.ProductName=ProductName;
		this.ProductPrize=ProductPrize;
		this.Quantity=Quantity;
	}
	public void ProductDetails(){
		System.out.println("Product:"+ProductName+"\nPrize:"+ProductPrize+"/nQuantity:"+Quantity);
	}
	public double Pdprize(){
		return ProductPrize*Quantity;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("1st Product Details");
		InvertoryManagment str1=new InvertoryManagment("Pen",20.00,2);
		str1.ProductDetails();
		System.out.println("Total cost of 1st product is Rs:"+str1.Pdprize());
	}
}
