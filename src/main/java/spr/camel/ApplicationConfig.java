package spr.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public RouteBuilder simpleRouteBuilder()
	{
		return new SimpleRouteBuilder();
	}
	
	@Bean
	public CamelContext camelContext(RouteBuilder simpleRouteBuilder)
	{
		CamelContext ctx = new DefaultCamelContext();
		try {
			ctx.addRoutes(simpleRouteBuilder);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ctx;
	}

}
