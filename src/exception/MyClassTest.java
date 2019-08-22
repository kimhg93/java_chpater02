package exception;

public class MyClassTest {

	public static void main(String[] args) {		
		try {
			MyClass mc = new MyClass();
			mc.dangerMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
