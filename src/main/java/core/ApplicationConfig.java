package core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import core.model.Car;
import core.model.Engine;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Car car(Engine engine)
	{
		Car car = new Car();
		car.setEngine(engine);
		return car;
	}
	
	@Bean
	public Engine engine()
	{
		return new Engine("Audi");
	}

}
