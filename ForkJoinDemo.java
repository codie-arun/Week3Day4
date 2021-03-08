package week3day4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
	
	public static void main(String[] args) {
		
		
		MyStringArray msa=new MyStringArray();
		
		ForkJoinPool fjPool=ForkJoinPool.commonPool();
		MyTask task1=new MyTask(0,3,msa.arr,"ramu");
		MyTask task2=new MyTask(3,6,msa.arr,"ramu");
		MyTask task3=new MyTask(6,8,msa.arr,"ramu");
		MyTask task4=new MyTask(8,10,msa.arr,"ramu");
		
		int result1=fjPool.invoke(task1);
		int result2=fjPool.invoke(task2);
		int result3=fjPool.invoke(task3);
		int result4=fjPool.invoke(task4);
		
		int finalresult = result1+result2+result3+result4;
		System.out.println("Number of ramus....in array is...:"+finalresult);
	}
	
}

class MyTask extends RecursiveTask<Integer>{
	
	int startPosition;
	int endPosition;
	String array[];
	String searchElement;
	
	
	
	public MyTask(int startPosition, int endPosition, String[] array, String searchElement) {
		super();
		this.startPosition = startPosition;
		this.endPosition = endPosition;
		this.array = array;
		this.searchElement = searchElement;
	}



	protected Integer compute() {
		int count=0;
		for(int i=startPosition;i<endPosition;i++)
		{ 
			if(array[i].equalsIgnoreCase(searchElement)) 
			{ 
				count++;
			}
		} 
		return count;
	}
}

class MyStringArray{
	String arr[]= {"ramu","somu","monu","nikki","ramu","maggi","khader","refayi","ramu","mokarram"}; 
}
