package Loop;

public class Exercise4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1+(1+2)+(1+2+3+4)+ ... +(1+2+3+...+10)�� ����� ����Ͻÿ�.
		int sum=0;
		for(int j=1; j<=10 ;j++) {
			for(int i=1; i<=j ;i++) {
				sum += i;
			}
		}
		System.out.println("��� ����� " + sum +"�̴�");
	}

}
