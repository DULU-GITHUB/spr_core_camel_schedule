package core.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car1 {
	
	@Autowired
	private Engine1 engine1;
	
	public void start()
	{
		
		System.out.println("car started with engine :"+engine1.getName());
	}

	public Engine1 getEngine1() {
		return engine1;
	}

	public void setEngine1(Engine1 engine1) {
		this.engine1 = engine1;
	}

}
