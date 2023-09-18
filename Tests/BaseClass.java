public class BaseClass {
	public static int num = 5;
	public static void sayHello() {
		System.out.println("Hello");
	}
	public static void main(String[]args) {
		BaseClass.sayHello();
		System.out.println("BaseClass's num: " +BaseClass.num);
		SubClass.sayHello();
		//This will be different than the above statement's output, since it runs
		//A different method
		SubClass.sayHello(true);
		StaticOverride.sayHello();
		System.out.println("StaticOverride's num: " +StaticOverride.num);
	}
}
  class SubClass extends BaseClass {
	//Inherits the sayHello function, but does not override it 
	public static void sayHello(boolean test) {
		System.out.println("Hey");
	}
}
  class StaticOverride extends BaseClass {
		//it Hides the num field from BaseClass
		//You can even change the type, since this doesn't affect the signature
		public static String num = "test";
		//Cannot use @Override annotation, since this is static
		//This overrides the sayHello method from BaseClass
		public static void sayHello() {
			System.out.println("Static says Hi");
		}
}