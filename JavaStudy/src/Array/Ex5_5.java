package Array;

import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		// �ζ� ��ȣ ����

		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		//System.out.println(Arrays.toString(ball));
		
		int j;
		int tmp;
		for(int i=0; i<6 ;i++) {
			j= (int)(Math.random()*45); //0~���� 45������ ���� ������.
			tmp = ball[j];
			ball[j] = ball[i];
			ball[i] = tmp;
		}
		
		//System.out.println(Arrays.toString(ball));
		
		for(int i=0; i<6 ;i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		}
		
	}

}
