package thisisjavaclass;

public class Car {
	/*
	 * // �ʵ� String company = "�����ڵ���"; String model = "�׷���"; String color = "����";
	 * int maxSpeed = 350; int speed;
	 */

	/*
	 * Car(String color, int cc) {
	 * 
	 * 
	 * }
	 */

	/*
	 * String company = "�����ڵ���"; String model; String color; int maxSpeed;
	 * 
	 * Car() {
	 * 
	 * }
	 * 
	 * 
	 * Car(String model) { this.model = model; }
	 * 
	 * Car(String model, String color) { this.model = model; this.color = color; }
	 * 
	 * Car(String model, String color, int maxSpeed) { this.model = model;
	 * this.color = color; this.maxSpeed = maxSpeed; }
	 * 
	 * 
	 * Car(String model) { this(model, "����", 250); }
	 * 
	 * Car(String model, String color) { this(model, color, 250); }
	 * 
	 * Car(String model, String color, int maxSpeed) { this.model = model;
	 * this.color = color; this.maxSpeed = maxSpeed; }
	 */

	/*
	 * // �ʵ� int gas;
	 * 
	 * // ������
	 * 
	 * // �޼ҵ� void setGas(int gas) { this.gas = gas; }
	 * 
	 * boolean isLeftGas() { if (gas == 0) { System.out.println("������ �����ϴ�."); return
	 * false; } else { System.out.println("gas�� " + gas + "��ŭ �ֽ��ϴ�."); return true;
	 * } }
	 * 
	 * void run() { while (true) { if (gas > 0) { System.out.println("�޸��ϴ�.(gas�ܷ�:"
	 * + gas + ")"); gas -= 1; } else { System.out.println("����ϴ�.(gas�ܷ�:" + gas +
	 * ")"); return; // �޼ҵ� ���� ���� } } }
	 */

	/*
	 * // Ŭ���� �ܺο��� �޼ҵ� ȣ�� // �ʵ� int speed;
	 * 
	 * // ������
	 * 
	 * // �޼ҵ� int getSpeed() { return speed; }
	 * 
	 * void keyTurnOn() { System.out.println("Ű�� �����ϴ�."); }
	 * 
	 * void run() { for (int i = 10; i <= 50; i += 10) { speed = i;
	 * System.out.println("�޸��ϴ�.(�ü�: " + speed + "km/h)"); } }
	 */

	// �ν��Ͻ� ����� this
	// �ʵ�
	String model;
	int speed;

	// ������
	Car(String model) {
		this.model = model;
	}

	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�: " + this.speed + "km/h)");
		}
	}
}
