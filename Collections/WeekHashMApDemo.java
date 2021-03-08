package week3day4.collectionspack;

import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMApDemo {

	public static void main(String[] args) {
		
		Map<MyKey,String> map = new WeakHashMap<MyKey, String>();
		
		MyKey mykey1 = new MyKey("a1");
		MyKey mykey2 = new MyKey("a2");
		MyKey mykey3 = new MyKey("a3");
		
		map.put(mykey1,"ramu");
		map.put(mykey2,"somu");
		map.put(mykey3,"raju");
		
		System.out.println(map);
		
		mykey1 = null;
		System.gc();
		System.out.println(map);
		
	}
	
}
