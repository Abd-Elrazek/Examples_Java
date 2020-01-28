

 public class Test1{
	static int x1 = 2;
	static {
		x1 += 1;
	}
	
	public static void main(String args[]){
		Test tst = new Test();
	    tst.testFunc();
		System.out.println("X1 = "+ x1);
		int x = ~5;
		System.out.println(x);
	}
	
	static{
		x1 -= 2;
	}
 }
 // you can create class outerr and inner without identifier public or private ....
	 class Test{
		 public void testFunc(){
			 System.out.println("this command from Outer class ....for test that's okey");
		 }
	 }