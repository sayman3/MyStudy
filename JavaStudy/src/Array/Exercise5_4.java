package Array;

public class Exercise5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2���� �迭�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��϶�.
		
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length ; j++) {
				total += arr[i][j];
			}
		}
		average = total / (float)(arr.length*arr[1].length);
		
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}

}