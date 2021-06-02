package core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.model.Car;
import core.model.Engine;

public class ApplicationStartXML {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		Engine engine = ctx.getBean(Engine.class);
		engine.printName();
		
		Car car = ctx.getBean(Car.class);
		car.start();
	}

}
