package spr.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C:/Users/Manoranjan Gharai/workspace/spr_core/src/test/resources/inputFolder?noop=true")
        .to("file:C:/Users/Manoranjan Gharai/workspace/spr_core/src/test/resources/outputFolder");
    }

}