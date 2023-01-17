package week11;

public class App {
	public static void test() throws StudentException {
		Student s = new Student("Minh", 20);
		s.setAge(-1);
	}
	public static void main(String[] args) {
		try {
			test();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
