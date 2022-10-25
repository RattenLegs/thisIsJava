package thisisjavaclass;

public class Car {
	/*
	 * // 필드 String company = "현대자동차"; String model = "그랜저"; String color = "검정";
	 * int maxSpeed = 350; int speed;
	 */

	/*
	 * Car(String color, int cc) {
	 * 
	 * 
	 * }
	 */

	/*
	 * String company = "현대자동차"; String model; String color; int maxSpeed;
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
	 * Car(String model) { this(model, "은색", 250); }
	 * 
	 * Car(String model, String color) { this(model, color, 250); }
	 * 
	 * Car(String model, String color, int maxSpeed) { this.model = model;
	 * this.color = color; this.maxSpeed = maxSpeed; }
	 */

	/*
	 * // 필드 int gas;
	 * 
	 * // 생성자
	 * 
	 * // 메소드 void setGas(int gas) { this.gas = gas; }
	 * 
	 * boolean isLeftGas() { if (gas == 0) { System.out.println("가스가 없습니다."); return
	 * false; } else { System.out.println("gas가 " + gas + "만큼 있습니다."); return true;
	 * } }
	 * 
	 * void run() { while (true) { if (gas > 0) { System.out.println("달립니다.(gas잔량:"
	 * + gas + ")"); gas -= 1; } else { System.out.println("멈춥니다.(gas잔량:" + gas +
	 * ")"); return; // 메소드 실행 종료 } } }
	 */

	// 클래스 외부에서 메소드 호출
	// 필드
	int speed;

	// 생성자

	// 메소드
	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다.(시속: " + speed + "km/h)");
		}
	}
}
