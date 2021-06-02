package core.model;

import org.springframework.stereotype.Component;

@Component
public class Engine1 {
	private String name="default car";
	
	Engine1()
	{
		
	}
	public Engine1(String name)
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
