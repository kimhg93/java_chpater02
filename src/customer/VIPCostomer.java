package customer;

import chpater02.Customer;

public class VIPCostomer extends Customer {
	public void showInfo() {
		//protected 같은 패키지 뿐만 아니라 자식클래스 에서도 접근 가능
		System.out.println(name);
	}
}
