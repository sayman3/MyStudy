package Loop;

public class Exercise4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*���� for ���� while������ �����Ͻÿ�
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i ;j++)
				System.out.println("*");
			System.out.println();
		}
		
		*/
		
		int j=0;
		int i=0;
		while(i<=10) {
			
			while(j<=i) {
				System.out.println("*");
				j++;
			}
			
			i++;
			j=0;
			
			System.out.println();
			
		}
	}

}