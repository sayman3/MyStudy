package Loop;

public class Exercise4_7 {

	public static void main(String[] args) {
		// ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
		// ���� ���ڿ��� "12345"���, 1+2+3+4+5�� ����� 15�� ����ؾ��Ѵ�.
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			//sum = sum + Integer.parseInt(str.substring(i, i+1));
			
			sum = sum + str.charAt(i)-'0';
			
			
			
		}
		System.out.println("sum=" + sum);

	}

}