package Loop;

public class Exercise4_9 {

	public static void main(String[] args) {

		//int Ÿ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
		//ex)num = 12345 �̸� 1+2+3+4+5�� ����� 15�� ����϶�
		
		int num=12345;
		int sum=0;
		
		while(num>0) {
			sum = sum + num%10;
			num = num/10;
			System.out.println("sum : " + sum + " num : "+num);
		}
		
		
		
		System.out.println("sum="+sum);
	}

}