package week8;

import java.util.List;
import java.util.ArrayList;

public class Baitap {
	public static void removeAll(List<?> list) {
		for (int i = list.size()-1; i>=0; --i) {
			list.remove(i);
		}
		// int n = list.size();
		// for(int i = 0; i <= n; i++)list.remove(i); 
	}
	public static void removeEven(List<?> list) {
		for (int i = list.size()-1; i>=0; i-=2) {
			list.remove(i);
		}
		// int n = list.size();
		// for(int i = 0; i <= n; i+=2)list.remove(i); 
	}
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		//removeAll(list);
		removeEven(list);
		
		System.out.println(list);
	}

}
