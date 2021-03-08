package week3day4.collectionspack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
	//	Map<MyKey,String> m = new HashMap<>();
		Map<MyKey,String> m = new TreeMap<>();
		
		MyKey mykey1 = new MyKey("a1");
		MyKey mykey2 = new MyKey("a2");
		MyKey mykey3 = new MyKey("a3");
		
		m.put(mykey1,"ramu");
		m.put(mykey2,"somu");
		m.put(mykey3,"raju");
		
		System.out.println(m);
		
		Set<Map.Entry<MyKey,String>> set = m.entrySet();
		
		Iterator<Map.Entry<MyKey,String>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<MyKey,String> me = iter.next();
			System.out.println(me.getKey()+":"+me.getValue());	
		}
	}	
}

class MyKey implements Comparable<MyKey>{
	String key;
	public MyKey(String key) {
		this.key=key;
	}
	
	@Override
	public String toString() {
		return this.key;
	}

	@Override
	public int compareTo(MyKey o) {
		// TODO Auto-generated method stub
		return o.key.compareTo(this.key);
	}
	
}