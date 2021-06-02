package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import core.model.Car1;

@SpringBootApplication
public class ApplicationStartBoot {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ApplicationStartBoot.class, args);
		Car1 car1 = ctx.getBean(Car1.class);
		car1.start();
	}

}
