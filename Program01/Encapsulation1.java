package Program01;

class Encap {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
		
	}

class Encapsulation1{
	public static void main(String[]args) {
		Encap o =new Encap();
		o.setAge(20);
		System.out.println(o.getAge());
	}
	
}
