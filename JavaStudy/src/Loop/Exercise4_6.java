package Loop;

public class Exercise4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		//1+5, 2+4, 3+3, 4+2, 5+1
		
		int dice1;
		int dice2;
		for(dice1=1; dice1<=6 ;dice1++) {
			for(dice2=1; dice2<=6; dice2++) {
				if((dice1+dice2)==6) {
					System.out.println("첫번째 주사위 : "+dice1 + " 두번째 주사위 : "+ dice2);
				}
			}
		}
	}

}
