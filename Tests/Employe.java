public class Employe{
	String name = "";
	short age     = 0;
	BirthDate d = null;
	
	
	public Employe (){}
	
	public void setEmploye(String name, int age, BirthDate d){
		this.name = name;
		this.age = (short)age;
		this.d = d;
	}
	
	@Override
	public String toString(){
		return "Name " + name + " age: " + age + " BirthDate: "+" day " + d.day +" Month " +d.month + " year" + d.year ;
	}
	
	
}