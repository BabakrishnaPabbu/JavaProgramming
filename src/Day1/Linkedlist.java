package Day1;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		
		LinkedList<String> l = new LinkedList<String> ();
		l.add("1");
		l.add("baba");
		l.add("QA");
		l.addFirst("ID");
		l.addLast("Java");
	System.out.println(l);
	l.set(2, "BK");
	System.out.println(l);
	l.remove("1");
	System.out.println(l);
	
	System.out.println("**********forloop********");
	//for loop
	for(int i=0; i<l.size();i++) {
		System.out.println(l.get(i));
	}
	
	
	System.out.println("**********foreach********");
	//for each
	for(String s: l) {
		System.out.println(s);
	}
	
	
	System.out.println("**********Iterator********");
	Iterator<String>i= l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	System.out.println("**********while********");
	int j=0;
	while( j<l.size()) {
		System.out.println(l.get(j));
		j++;
	}
	
	}

}
