public class Person {
	
	String name = "";
	
	public Person (String n){
		name = n;
		// we use this key to differ "name of parameter" than variable of class if two names are the same 
		// String name , this.name = name;
		// but when the String name = n , it doesn't matter "this"
	}
	
	public void print (){
		System.out.println(name);
	}
}