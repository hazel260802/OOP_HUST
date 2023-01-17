package week11;

public class ExceptionDemo{
	public static int divide(int i, int j){
			return i/j;
	}
public static void main(String args[]){
		System.out.println("begin");
	
		int i = 5;
		int j = 0;

		int k;

		try{
				k = divide(i, j);
				System.out.println(k);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		} finally {
			System.out.println("Final execution");
		}

		System.out.println("end");
	}
}