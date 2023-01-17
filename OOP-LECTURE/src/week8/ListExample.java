package week8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("A"); // Them thi phai them String
		list.add("B");
		list.add("C");
		list.add(1,"D");// list: A,D,B,C
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()>o2.length())return 1;
				else if(o1.length()==o2.length())return 0;
				else return -1;
			}
		});
		
		// Các cách để lấy từng phần tử trong list
		//Cách 1: Dùng biến đếm
		for(int i = 0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		//Cách 2: Dùng biến chỉ định
		for(String s: list) {
			System.out.println(s);
		}
		//Cách 3: Dùng iterator
		Iterator<String> it = list.iterator();
		//Có thể làm với bất kỳ collection nào
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		
		list.remove(0); //list: D,B,C
		list.removeAll(list);
		
		System.out.println(list.contains(new String("B")));
		//Dung phuong thuc equals de kiem tra
		System.out.println(list);
	}

}
