package Day1;

public class Nonstaticmethods {
	public static void main(String[] args) {
		Nonstaticmethods ob= new Nonstaticmethods();
		ob.a();
		int b1= ob.b();
		System.out.println(b1);
		int c1=ob.c(10);
		System.out.println(c1);
		String d1 =ob.d("V","I");
		System.out.println(d1);
		
		
	}
	public void a() {
		System.out.println("a method");
	}
	public int b() {
		System.out.println("b method");
		int i=1;
		int j=2;
		int k= i+j;
		return k;
		
	}
	public int c(int l) {
		
	return l;
		
	}
	public String d(String l,String j) {
		
		return l+j;
			
		}
}
