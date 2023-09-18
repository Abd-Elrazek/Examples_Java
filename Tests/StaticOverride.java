 public static class StaticOverride extends BaseClass {
		//it Hides the num field from BaseClass
		//You can even change the type, since this doesn't affect the signature
		public static String num = "test";
		//Cannot use @Override annotation, since this is static
		//This overrides the sayHello method from BaseClass
		public static void sayHello() {
			System.out.println("Static says Hi");
	}
}