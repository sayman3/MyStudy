package Loop;

public class Exercise4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		// i%2 != 0 && i%3 !=0
		int sum = 0;
		for(int i=1; i<=20 ;i++) {
			if((i%2!=0) && (i%3 !=0)) {
				sum += i;
				System.out.print(i+" ");
			}
		}
		
		System.out.println("������ : "+sum);
	}

}