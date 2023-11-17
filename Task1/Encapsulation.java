package Task1;

public class Encapsulation {
	
	public String name;
	
	private long number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

public static void main(String[] args) {
	
	Encapsulation obj = new Encapsulation();
	
	obj.setName("Shahul");
	obj.setNumber(9870654312l);
	
	System.out.println(obj.getName());
	System.out.println(obj.getNumber());

}

}
