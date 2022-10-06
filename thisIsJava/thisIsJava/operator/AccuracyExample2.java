package operator;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		
		System.out.println("사과 한개에서 " + System.lineSeparator() + "0.7조각을 빼면," + System.lineSeparator() + result + "조각이 남는다.");

	}

}
