/* 
Each object of the class would have its
own location where x would be held, and the compiler could not determine all
these places in advance of running the program.
 */


public class Test_Compiler{
	public static Integer x = new Integer(5); // This is static variable (obj) where have one copy of location address in Memory
	public  Integer y = new Integer(5);      // This is non- static variable (obj) ever object from it has copy location address in memory 
	public static void main (String abdelrazek[]){
	

     	Test_Compiler test = new Test_Compiler();
		Test_Compiler test1 = new Test_Compiler();
		
		
		System.out.println("test not ob -> " + Test_Compiler.x );
		
		System.out.println("test  ob-> " + test.x + " ,   Location address of object x  is \'" + Integer.toHexString(System.identityHashCode(test.x))+"\'");
		System.out.println("test  ob-> " + test1.x + " ,  The Same Location address for another object \'" + Integer.toHexString(System.identityHashCode(test1.x))+"\'");		
		
		System.out.println("test  ob-> " + test.x + " ,   Location addresss for obj with non-static variable \'" + Integer.toHexString(System.identityHashCode(test.y))+"\'");
		System.out.println("test  ob-> " + test1.x + " ,  Different address location for anohter object \'" + Integer.toHexString(System.identityHashCode(test1.y))+"\'");
	}
}