package week3day4.collectionspack;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> myset = new HashSet<String>();
		
		myset.add("hello");
		myset.add("hello");
		myset.add("hai");
		myset.add("hai");
		myset.add("Vanakam");
		
		System.out.println(myset);
		
		Set<String> myset2 = new TreeSet<String>((o1,o2)->{return o2.compareTo(o1);});
		
		myset2.add("lion");
		myset2.add("tiger");
		myset2.add("elephant");
		myset2.add("bear");
		myset2.add("wolf");
		
		System.out.println(myset2);
	}
	
}
