package Array;

import java.util.Arrays;

public class Exercise5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];//크기가 3인 1차원 배열을 0으로 초기화.
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i<ballArr.length ;i++) {
			int j = (int)(Math.random()*ballArr.length);//0~9사이의 정수
			int tmp = 0;
			
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;
			
		}
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		ball3 = Arrays.copyOfRange(ballArr, 0, 3);
		
		for(int i=0; i<ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}

}
