package Loop;

public class Exercise4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ ���ڸ����� ������ �ۼ��� ���̴�. 1�� 100������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ����
		//������ ������ ������. ����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�.
		//����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ������ ������ ������ �� �� ���� ���ڸ� �������� �˷��ش�. 
		
		int answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		do {
			count ++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� :");
			input =scan.nextInt();
			
			//�ڵ� �Է�
			if(answer>input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if(answer<input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else{
				System.out.println("�������ϴ�. \n�õ�Ƚ���� "+count+"���Դϴ�.");
				break;
			}			
			
		}while(true);
		
	}

}