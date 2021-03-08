package week3day4;

public class GenericsDemo3 {

	public static void main(String[] args) {
		
		GenericsDemo3 obj = new GenericsDemo3();
		obj.getObj(new String[] {"a","b","c"});
	}
	
	public <E>E getObj(E[] elements){
		
		for(E element:elements) {
			System.out.println(element);
		}
		return null;
	}
	
}
