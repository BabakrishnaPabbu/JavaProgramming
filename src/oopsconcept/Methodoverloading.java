package oopsconcept;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading m = new Methodoverloading();
		m.a();
		m.a(10);
		m.a(5,10);
		a(1.9, 2.3);

	}
	public  void a() {
		System.out.println("a method");

	}
	public  void a(int i) {
		System.out.println("a method with int i");
		System.out.println(i);


	}
	public  void a(int i, int j) {
		System.out.println("a method with int i,j");
		System.out.println(i+j);

	}
	public static void a(double i, double j) {
		System.out.println("a method with int i,j double");
		System.out.println(i+j);

	}


}
