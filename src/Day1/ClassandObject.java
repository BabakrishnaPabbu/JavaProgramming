package Day1;

public class ClassandObject {
	String veh;
	int mod;

	public static void main(String[] args) {
		ClassandObject a = new ClassandObject();
		ClassandObject b = new ClassandObject();
		ClassandObject c = new ClassandObject();
         a.veh="BMW";
         a.mod=2023;
         b.veh="Benz";
         b.mod=2024;
         c.veh="Audi";
         c.mod=2025;
		System.out.println(a.veh);
		System.out.println(a.mod);
		System.out.println(b.veh);
		System.out.println(b.mod);
		System.out.println(c.veh);
		System.out.println(c.mod);
		a=b;
		b=c;
		c=a;
		System.out.println(a.veh);
		System.out.println(a.mod);
		System.out.println(b.veh);
		System.out.println(b.mod);
		System.out.println(c.veh);
		System.out.println(c.mod);
		
	}

}
