package thisisjavaclass;

public class Calculator {

	/*
	 * // 메소드 void powerOn() { System.out.println("전원을 켭니다."); }
	 * 
	 * int plus(int x, int y) { int result = x + y; return result; }
	 * 
	 * double divide(int x, int y) { double result = (double) x / (double) y; return
	 * result; }
	 * 
	 * void powerOff() { System.out.println("전원을 끕니다."); }
	 */

	/*
	 * // 클래스 내부에서 메소드 호출 int plus(int x, int y) { int result = x + y; return
	 * result; }
	 * 
	 * double avg(int x, int y) { double sum = plus(x, y); double result = sum / 2;
	 * return result; }
	 * 
	 * void execute() { double result = avg(7, 10); println("실행결과: " + result); }
	 * 
	 * void println(String message) { System.out.println(message); }
	 */

	/*
	 * // 메소드 오버로딩 // 정사각형의 넓이 double areaRectangle(double width) { return width *
	 * width; }
	 * 
	 * // 직사각형의 넓이 double areaRectangle(double width, double height) { return width
	 * * height; }
	 */

	// static: 고정된, 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메서드를 말한다.
	// 필드와 메소드 선언 시 static 키워드를 추가적으로 붙이면 된다.
	// 필드 선언시:
	// 객체마다 가지고 있어야 할 데이터면 인스턴스 필드로 선언
	// 공용적인 데이터라면 정적 필드로 선언

	// 정적 멤버 사용
	static double pi = 3.14159;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

}
