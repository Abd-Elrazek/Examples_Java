public class Test2{
	public static void main (String args[]){
		String val1 = new String ("v");
		String val2 = new String ("v");
		 // here Comparison with Location address in memory but not object data if
		 // we want to comparison with data we should use equals method
		if (val1 == val2){
			System.out.println("Equal");
		}else{
			System.out.println("Not equal " + Long.MAX_VALUE);
			
		}
	}
}