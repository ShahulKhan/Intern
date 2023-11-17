package Program01;

interface bike{
	
	 String s1 = "Welcome To RS motors";
	
	  public double tvs(double Price ,double RoadTax);
	
     public	void welcome();
	
}

public class Pro01 implements bike {
	
	@Override
	public double tvs(double Price, double RoadTax) {
	
		double TotalPrice = Price +RoadTax;
		return TotalPrice;
	}
	@Override
	public void welcome() {
		
		 System.out.println(s1);
	}

public static void main(String[] args) {
	
	
	bike p1= new Pro01();
	p1.welcome();
	System.out.println("Total price of the bike is = "+p1.tvs(12000.0, 5400.0) );
		
	}

}
