package Loop;

public class Exercise4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다음은 숫자맞히기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을
		//맞히면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
		//사용자가 컴퓨터가 생각한 숫자를 맞히면 게임이 끝나고 몇 번 만에 숫자를 맞혔는지 알려준다. 
		
		int answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		do {
			count ++;
			System.out.println("1과 100사이의 값을 입력하세요 :");
			input =scan.nextInt();
			
			//코드 입력
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else{
				System.out.println("맞혔습니다. \n시도횟수는 "+count+"번입니다.");
				break;
			}			
			
		}while(true);
		
	}

}
