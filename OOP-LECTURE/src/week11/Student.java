package week11;

public class Student {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setAge (int age) throws StudentException{
		if(age > 0) {
			this.age = age;
		}
		else {
			throw new StudentException("Tuoi phai duong", this);
		}
	}
	@Override
	public String toString() {
		return "Name: " + this.name + ". Age: " + this.age ;
	}
}
