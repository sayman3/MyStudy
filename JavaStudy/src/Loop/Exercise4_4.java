package Loop;

public class Exercise4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1+(-2)+3+(-4)+...�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
		
		/*
		int i=0;
		int sum=0;
		while(true) {
			++i;
			
			if(i%2==0) {
				i=i*(-1);
			}			
			sum = sum + i;
			
			if(i<0) {
				i=i*(-1);
			}
			
			if(sum>=100) {
				break;
			}
		}
		System.out.println(sum);
		System.out.println(i);
		*/
		
		int sum = 0; //������ ������ ����
		int s = 1; //��ȣ�� �ٲ��� ����
		int num = 0;
		
		for(int i=1; sum<100 ; i++,s=-s) {
			num = s* i;
			sum += num;
			
			if(sum>=100)
				break;			
		}
		System.out.println("����: "+sum+ " num: "+ num);
	}

}