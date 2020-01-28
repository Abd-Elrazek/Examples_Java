

public class Overriding_Class{
	

public static void main(String abdelrazek []){
	B ob = new B();
	ob.display();
}
}

class A{
	void display(){
		System.out.println("A");
	}
}

 class  B extends A{
void display(){
	System.out.println("B");
}

}
