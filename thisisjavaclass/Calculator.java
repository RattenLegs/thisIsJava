package thisisjavaclass;

public class Calculator {

	/*
	 * // �޼ҵ� void powerOn() { System.out.println("������ �մϴ�."); }
	 * 
	 * int plus(int x, int y) { int result = x + y; return result; }
	 * 
	 * double divide(int x, int y) { double result = (double) x / (double) y; return
	 * result; }
	 * 
	 * void powerOff() { System.out.println("������ ���ϴ�."); }
	 */

	/*
	 * // Ŭ���� ���ο��� �޼ҵ� ȣ�� int plus(int x, int y) { int result = x + y; return
	 * result; }
	 * 
	 * double avg(int x, int y) { double sum = plus(x, y); double result = sum / 2;
	 * return result; }
	 * 
	 * void execute() { double result = avg(7, 10); println("������: " + result); }
	 * 
	 * void println(String message) { System.out.println(message); }
	 */

	/*
	 * // �޼ҵ� �����ε� // ���簢���� ���� double areaRectangle(double width) { return width *
	 * width; }
	 * 
	 * // ���簢���� ���� double areaRectangle(double width, double height) { return width
	 * * height; }
	 */

	// static: ������, Ŭ������ ������ ����μ� ��ü�� �������� �ʰ� ����� �� �ִ� �ʵ�� �޼��带 ���Ѵ�.
	// �ʵ�� �޼ҵ� ���� �� static Ű���带 �߰������� ���̸� �ȴ�.
	// �ʵ� �����:
	// ��ü���� ������ �־�� �� �����͸� �ν��Ͻ� �ʵ�� ����
	// �������� �����Ͷ�� ���� �ʵ�� ����

	// ���� ��� ���
	static double pi = 3.14159;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

}
