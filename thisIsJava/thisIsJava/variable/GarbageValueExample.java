package variable;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
			//실행 중 저장할 수 있는 값의 범위를 초과하면 최소값부터 다시 반복 저장: 쓰레기값
		}

	}

}
