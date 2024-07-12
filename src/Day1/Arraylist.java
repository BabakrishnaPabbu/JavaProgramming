package Day1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static <E> void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(100);
		a.add("baba");
		a.add("hyd");
		System.out.println(a.size());
		a.addFirst(1);
		a.addLast("TKR");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("*****************");
		ArrayList <Integer >a1 = new ArrayList< Integer>();
		
		a1.add(2);
		
		ArrayList<E> a2 = new ArrayList<E>();
		//***********************************//
		
		Objclass o1= new Objclass("baba",29);
		Objclass o2= new Objclass("Bk",28);
		Objclass o3= new Objclass("B",27);
		ArrayList<Objclass> a3 = new ArrayList<Objclass>();
		a3.add(o1);
		a3.add(o2);
		a3.add(o3);

	Iterator<Objclass> i  =a3.iterator();
	while(i.hasNext()) {
		Objclass o=i.next();
		System.out.println(o.name);
		System.out.println(o.age);
	}
	
	}

}
