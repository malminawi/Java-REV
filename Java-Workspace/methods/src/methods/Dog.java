package methods;

public class Dog {
	public double size;
	public String name;
	public Dog() {}
	
	public void bark() {
		System.out.println("hella");
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	
	public double doggyAdd(double a, double b) {
		double result = a + b + 8;
		return result;
	}
}
