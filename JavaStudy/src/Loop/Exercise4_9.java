package Loop;

public class Exercise4_9 {

	public static void main(String[] args) {

		//int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		//ex)num = 12345 이면 1+2+3+4+5의 결과인 15를 출력하라
		
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
