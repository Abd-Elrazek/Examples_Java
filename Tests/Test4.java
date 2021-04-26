
import java.util.Scanner;


public class Test4 {
	
	public static void main (String args[]){
		Scanner in = new Scanner (System.in);
		double purchase = in.nextDouble();
		double tax = purchase * 0.6;
		
		System.out.println("the result is " + (int) ( (tax  * 100 ) / 100 ));
	}
	
	/* public static void (a + 3){ //illegel 
		System.out.println(a);
	} */
}