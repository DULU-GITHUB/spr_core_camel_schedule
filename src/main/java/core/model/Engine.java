package core.model;

public class Engine {
	private String name;
	
	Engine()
	{
		
	}
	public Engine(String name)
	{
		this.name=name;
	}
	
	public void printName()
	{
		System.out.println("This is a big "+name+" engine");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
