package variable;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte �ȵ�");
			System.out.println("�ٽú�");
		} else {
			byte b= (byte) i;
			System.out.println(b);
		}
	}

}
