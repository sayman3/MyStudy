
public class Exercise3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fahrenheit = 100;
		float celcius = (int)((5f/9 * (fahrenheit-32) + 0.005f)*100)/100f;
		
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:"+ celcius);
	}

}
