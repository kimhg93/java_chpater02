package exception;

public class ExceptionTest {
	public static void main(String args[]) {
		try {
			int a = 0;
			System.out.println("some codes....1");
			int k = 10000000 / a;
			System.out.println("some codes....2");
			System.out.println("some codes....3");
		} catch(ArithmeticException e) {
			//1. 로그 남기기(파일)
			System.out.println("error : "+ e);
			//2. 사과하기
			System.out.println("죄송합니다. 예기치....");
			//3. 정상종료(자원정리)
			return;
			
			//4. 이거라도 안되면 최소한....
			//e.printStackTrace();
		} finally {
			System.out.println("자원정리");
		}
	}
}
