package chpater02;

public class Student extends Person {
	public Student() {
		// 1.자식 생성자에서 부모 생성자는 반드시 호출된다.
		// 2.그래서 코드에 명시적인 부모생성자 호출이 없는 경우
		//	컴파일라가 자동으로 부모의 기본생성자 호출을 넣어준다.
		
		//암시적 부모 기본생성자 호출
		//super();
		
		//명시적으로 부모생성자 호출
		//명시적으로 부모생성자 호출시에는 자동으로 부모의 기본생성자 호출을 하지 않는다.
		super("test");
		System.out.println("Student() called");
	}
}
