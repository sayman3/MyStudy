package Loop;

public class Exercise4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Math.random을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하시오.
		
		int value = (int)(Math.random()*6+1);
		//Math.random()메서드는 0.0 이상 1.0 미만의 실수를 리턴한다.
		
		System.out.println("value " + value);
	}

}
