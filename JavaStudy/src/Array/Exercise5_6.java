package Array;

import java.util.Scanner;

public class Exercise5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� �����̴�. �������� ���� �����ϵ���
		//������ �� ���� ä��ÿ�.
		
		String[] words = {"television","computer","mouse","phone"};
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<words.length;i++) {
			char[] question = words[i].toCharArray();//String�� char�� ��ȯ
			
			
			for(int j=0; j<question.length; j++) {
				int random = (int)(Math.random()*question.length);
				char tmp;
				
				tmp=question[random];
				question[random]=question[i];
				question[i]=tmp;
				
			}
			
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1,new String(question));
			
			String answer = scan.nextLine();
			
			//trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if(words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�.\n\n");
			else
				System.out.printf("Ʋ�Ƚ��ϴ�.\n\n");
		}
	}

}
