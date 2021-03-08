package week3day4.collectionspack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("hello");
		v.add("vanakam");
		v.add("Bonjour");
		v.add("Namaste");
		
		System.out.println(v);
		
		Enumeration<String> e = v.elements();
		Iterator<String> i = v.iterator();
		
//		v.add("bye");
		
		while(e.hasMoreElements()) {
			System.out.println("Enumerator...."+e.nextElement());
		}
		
		while(i.hasNext()) {
			System.out.println("Iterator...."+i.next());
		}
		
		
		
	}
}

