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

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car() {

	}

	/*
	 * Car(String model) { this.model = model; }
	 * 
	 * Car(String model, String color) { this.model = model; this.color = color; }
	 * 
	 * Car(String model, String color, int maxSpeed) { this.model = model;
	 * this.color = color; this.maxSpeed = maxSpeed; }
	 */

	Car(String model) {
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
