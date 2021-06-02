package spr.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("spr.camel")
public class ApplicationStartBoot {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStartBoot.class, args);
		
		try {
			Thread.sleep(5*60*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
