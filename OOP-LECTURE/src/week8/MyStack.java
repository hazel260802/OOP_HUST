package week8;

public class MyStack {
	private Student[] arr;
	private int index;
	private final int SIZE;
	
	public MyStack(int size) {
		SIZE = size;
		index = 0;
		arr = new Student[SIZE];
	}
	public boolean push(Student s) {
		if(index == SIZE) {
			return false;
		}
		else {
			arr[index]=s;
			index++;
			return true;
			
		}
	}
	public Student pop() {
		if(index == SIZE) {
			return null;
		}
		else {
			index--;
			return arr[index];
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack(100);
		
		stack.push(new Student("Hung",20));
		stack.push(new Student("Nam",20));
		stack.push(new Student("Hai",20));
		
		Student s = stack.pop();
		System.out.println(s);
	}

}
