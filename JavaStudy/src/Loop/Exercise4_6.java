package Loop;

public class Exercise4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//1+5, 2+4, 3+3, 4+2, 5+1
		
		int dice1;
		int dice2;
		for(dice1=1; dice1<=6 ;dice1++) {
			for(dice2=1; dice2<=6; dice2++) {
				if((dice1+dice2)==6) {
					System.out.println("ù��° �ֻ��� : "+dice1 + " �ι�° �ֻ��� : "+ dice2);
				}
			}
		}
	}

}