package thisisjavaclass;

public class CarExample {

	public static void main(String[] args) {
		/*
		 * // 객체 생성 Car myCar = new Car();
		 * 
		 * // 필드값 읽기 System.out.println("제작회사: " + myCar.company);
		 * System.out.println("모델명: " + myCar.model); System.out.println("색깔: " +
		 * myCar.color); System.out.println("최고속도: " + myCar.maxSpeed);
		 * System.out.println("현재속도: " + myCar.speed);
		 * 
		 * // 필드값 변경 myCar.speed = 60; System.out.println("수정된 속도: " + myCar.speed);
		 */

		/*
		 * Car myCar = new Car("검정", 3000); // Car myCar = new Car();
		 */

		/*
		 * Car car1 = new Car(); System.out.println("car1.company: " + car1.company);
		 * System.out.println("car1.model: " + car1.model); System.out.println();
		 * 
		 * Car car2 = new Car("자가용"); System.out.println("car2.company: " +
		 * car2.company); System.out.println("car2.model: " + car2.model);
		 * System.out.println("car2.color: " + car2.color); System.out.println();
		 * 
		 * Car car3 = new Car("자가용", "빨강"); System.out.println("car3.company: " +
		 * car3.company); System.out.println("car3.model: " + car3.model);
		 * System.out.println("car3.color: " + car3.color); System.out.println();
		 * 
		 * Car car4 = new Car("택시", "검정", 200); System.out.println("car4.company: " +
		 * car4.company); System.out.println("car4.model: " + car4.model);
		 * System.out.println("car4.color: " + car4.color);
		 * System.out.println("car4.maxSpeed: " + car4.maxSpeed); System.out.println();
		 */

		/*
		 * Car myCar = new Car();
		 * 
		 * myCar.setGas(5); // Car의 setGas 메소드 호출
		 * 
		 * boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas() 메소드 호출 if
		 * (gasState) { System.out.println("출발합니다."); myCar.run(); // Car의 run() 메소드 호출
		 * }
		 * 
		 * if (myCar.isLeftGas()) {// Car의 isLeftGas() 메소드 호출
		 * System.out.println("gas를 주입할 필요가 없습니다."); } else {
		 * System.out.println("gas를 주입하세요."); }
		 */

		/*
		 * // 클래스 외부에서 메소드 호출 Car myCar = new Car(); myCar.keyTurnOn(); myCar.run(); int
		 * speed = myCar.getSpeed(); System.out.println("현재 속도: " + speed + "km/h");
		 */

		// 인스턴스 멤버와 this
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");

		myCar.run();
		yourCar.run();
	}

}
