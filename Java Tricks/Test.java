public class Test{
	public static void main(String args[]){
		System.out.println(1 + 2 + "="+ 1+ 2);
		try{
		Runtime.getRuntime().exec("ping -t google.com");
		}catch(Exception e){
			
		}
	}
}