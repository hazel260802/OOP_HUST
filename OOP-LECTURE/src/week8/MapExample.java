package week8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		
		map.put("1", new Student("Binh", 10));
		map.put("2", new Student("An", 10));
		map.put("3", new Student("Nam", 10));
		
		Student s = map.get("1");
		System.out.println(s);
		
		System.out.println(map.get(new Student()));
		// Tra ve null, chu khong bao loi 
		
		System.out.println(map.containsKey("3"));
		System.out.println(map.containsKey(new String("3")));
		
		System.out.println(map.containsKey((new Student("Nam", 10))));
		
		System.out.println(map.keySet());
		System.out.println(map.values());

	}

}
