package OopsConcept2;

public class TestingCarandAudi {

	public static void main(String[] args) {
		Car c = new Car(); 
		c.start();
		c.stop();
		c.Brake();
		System.out.println("*************");
		Audi a = new Audi(); // static/compile time polymorphism
		a.start();
		a.stop();
		a.Brake();
		a.insurance();
		System.out.println("*************");
		Car cc = new Audi();// dynamic/run time polymorphism
		cc.start();
		cc.stop();
		cc.Brake();
		Audi aa = (Audi)new Car();//down casting
		
		
	}

	
}
