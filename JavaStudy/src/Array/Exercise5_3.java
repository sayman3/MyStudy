package Array;

public class Exercise5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum="+sum);
	}

}
