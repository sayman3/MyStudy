package Array;

import java.util.Arrays;

public class Exercise5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��̴�.
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];//ũ�Ⱑ 3�� 1���� �迭�� 0���� �ʱ�ȭ.
		
		//�迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i=0; i<ballArr.length ;i++) {
			int j = (int)(Math.random()*ballArr.length);//0~9������ ����
			int tmp = 0;
			
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;
			
		}
		
		//�迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		ball3 = Arrays.copyOfRange(ballArr, 0, 3);
		
		for(int i=0; i<ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}

}
