
import java.util.Random;

 public class Alphabet_Random{
    public static Random rand = new Random();
	public static String alphabet_en = "abcdefghijklmnopqrstuvwxyz";
    public static void main (String []args){
		int i = 0;
		int j = 0;
		for (i = 0; i < 30; i++){
			System.out.print("\' ");
			for (j = 0; j < 26; j++){
				char char_ = alphabet_en.charAt(rand.nextInt(alphabet_en.length()));
				System.out.print(char_);
			}
			System.out.print(" \'");
			System.out.println("");
			try {
				Thread.sleep(1000);
			}catch (Exception e){
				
			}
		}
	}
 }