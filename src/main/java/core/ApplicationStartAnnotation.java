package core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import core.model.Car;
import core.model.Engine;

public class ApplicationStartAnnotation {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Engine engine = ctx.getBean(Engine.class);
		engine.printName();
		
		Car car = ctx.getBean(Car.class);
		car.start();
	}

}
