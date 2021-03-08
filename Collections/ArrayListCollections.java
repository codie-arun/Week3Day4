package week3day4.collectionspack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ArrayListCollections {
	public static void main(String[] args) {
		
		List<Employee> mylist = new ArrayList<>(10);
		
		mylist.add(new Employee("hello"));
		mylist.add(new Employee("kct"));
		mylist.add(new Employee("rock"));
		mylist.add(new Employee("elon"));
		
		System.out.println(mylist);
		System.out.println(mylist.get(1));
		System.out.println(mylist.contains("psg"));
		System.out.println(mylist.contains("kct"));
		System.out.println(mylist.size());
		
		
		int size = mylist.size();
		
		for(int i = 0;i<size;i++) {
			System.out.println(mylist.get(i));
		}
		
		for(Employee s:mylist) {
			System.out.println(s);
		}
		
		Iterator<Employee> iter = mylist.iterator();
		
		while(iter.hasNext()) {
			System.out.println("First...."+iter.next());
		}
		
//		while(iter.hasNext()) {
//			System.out.println("Second...."+iter.next());
//		}
		
		
		ListIterator<Employee> liter = mylist.listIterator();
		while(liter.hasNext()) {
			System.out.println("liter Next...."+liter.next());
		}
		
		while(liter.hasPrevious()) {
			System.out.println("liter Previous...."+liter.previous());
		}
		
		Collections.sort(mylist,(o1,o2)->{return o2.compareTo(o1);});
		System.out.println(mylist);
		
		Stream<Employee> s = mylist.stream();
		
		s.filter((emp)->emp.name.equals("ramu")).forEach(System.out::println);
		
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}	
}


class Employee implements Comparable<Employee>{
	String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee name=" + this.name;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
}
