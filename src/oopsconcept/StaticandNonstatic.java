package oopsconcept;

public class StaticandNonstatic {
  static int a =20;
  String s="baba";
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(StaticandNonstatic.a);
		staticmethod();
		StaticandNonstatic.staticmethod();
		StaticandNonstatic s= new StaticandNonstatic();
		System.out.println(s.s);
		s.nonstatic();
		s.staticmethod();
		System.out.println(s.a);
		String s1 = "100";
		int i = Integer.parseInt(s1);
		System.out.println(i);
		int p =10;
		String s2= String.valueOf(p);
		System.out.println(s2);
		String ss="true";
		Boolean.parseBoolean(ss);
		String ss1="10.02";
		Double.parseDouble(ss1);
		Boolean sb = true;
		System.out.println(sb);
		
	}
	public  void nonstatic() {
		System.out.println("nonstatic method");

	}
	public static void staticmethod() {
		System.out.println("static method");

	}
	
	

}
