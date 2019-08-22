package chpater02;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		//protected > 같은 패키지에서 접근 가능
		c.name = "둘리";
		//private > 외부 접근 불가		
		c.setAge(10);				
	}
}
