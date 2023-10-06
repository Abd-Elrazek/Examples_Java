public class Manager extends Employe{ 
	String Department = "";
	
	
	public Manager(){
		super();
	}
		@Override
	public String toString(){
		return "Name " + name + " age: " + age + " Department : "+Department+  " BirthDate: "+" day " + d.day +" Month " +d.month + " year " + d.year ;
	}
}