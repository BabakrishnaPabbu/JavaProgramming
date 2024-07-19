package Constructor;



public class Constuctor {
	
	public Constuctor() {
		System.out.println("constuctor");
	}
public Constuctor(int a) {
	System.out.println("single para constuctor");
	}
public Constuctor(int a, int b) {
	System.out.println("single constuctor");
} 


	public static void main(String[] args) {
		Constuctor c = new Constuctor();
		Constuctor c1 = new Constuctor(10);
		Constuctor c2 = new Constuctor(1,2);


	}

}
