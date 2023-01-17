package week8;

public class MyStack_template<T> {
	private T[] arr;
	private int index;
	private final int SIZE;
	
	public MyStack_template(int size) {
		SIZE = size;
		index = 0;
		arr = (T[]) new Object[SIZE] ;
	}
	public <X, Y> void test(X x, Y y){
		System.out.println(x.toString() + "..." + y.toString());
	}
	public boolean push(T s) {
		if(index == SIZE) {
			return false;
		}
		else {
			arr[index]=s;
			index++;
			return true;
			
		}
	}
	public T pop() {
		if(index == SIZE) {
			return null;
		}
		else {
			index--;
			return arr[index];
			
		}
	}
	public static void main(String[] args) {
		MyStack_template<Student> stack = new MyStack_template<>(100);
		stack.push(new Student("Hung",20));
		stack.push(new Student("Nam",20));
		
		//stack.push("ABC");
		// Se duoc bao loi
		
		Student s = stack.pop();
		stack.<Student, String>test(s, "ABC");
		
//		MyStack stack = new MyStack(100);
//		
//		stack.push(new Student("Hung",20));
//		stack.push(new Student("Nam",20));
//		stack.push(new Student("Hai",20));
//		
//		Student s = stack.pop();
//		System.out.println(s);
	}

}
