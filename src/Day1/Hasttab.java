package Day1;

import java.util.Hashtable;

public class Hasttab {

	public static void main(String[] args) {
         Hashtable h = new Hashtable();
         
         h.put(1, "baba");
         h.put(2, 29);
         h.put(3, "QA");
         
         System.out.println(h.size());
         
         h.put(4, "stead");
         h.put(5, 2024);
         
         System.out.println(h.get(1));
         
         System.out.println(h.size());
         
         for( int i=1;i<=h.size();i++) {
        	 System.out.println(h.get(i));
         }
         Hashtable <Integer,String > h1 = new Hashtable <Integer,String >();
         h1.put(1, "1");
         
	}

}
