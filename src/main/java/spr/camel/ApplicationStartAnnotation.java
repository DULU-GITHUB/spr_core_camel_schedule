package spr.camel;

import org.apache.camel.CamelContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationStartAnnotation {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ctx.start();
		
		CamelContext camel = ctx.getBean(CamelContext.class);
		
		try {
			camel.start();
			Thread.sleep(5*60*1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctx.stop();
		ctx.close();
	}

}
