package week3day4.collectionsTest;

import java.util.List;

public class Ques8 {

	public static <E extends Number> List<E> process(List<E> nums) {
		return nums;
		
	}
	
	public static void main(String[] args) {
		List<Integer> input = null; List<Integer> output ;
		output = process(input);
	}
}
