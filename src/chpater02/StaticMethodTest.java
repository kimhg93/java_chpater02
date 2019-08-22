package chpater02;

public class StaticMethodTest {
	private int n;
	private static int m;
	
	public void f1() {
		n = 10;
		// 원칙적으로 클래스이름(namespace)로 접근 해야한다
		// 하지만, 같은 클래 인 경우 생략 가능
		// StaticMethodTest.m = 20;
		m = 20;
	}
	public static void f2() {
		// static 에서는 인스턴스 변수 접근 불가능
		//n = 10;
		m = 20;
		
	}
	public void f3() {
		f1();
		// StaticMethodTest.f2();
		f2();
	}
	public static void f4() {
		// static에서 인스턴스 접근 불가
		// f1();
		f2();
	}
	public static void main(String args[]) {
		f2();
		f4();
	}
}
