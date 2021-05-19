package com.component.jms;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class JmsComponent extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		 from("file:C:/inputFolder").split().tokenize("\n").to("jms:queue:myqueue");
		
		 from("jms:queue:myqueue")
		 .log(LoggingLevel.INFO, "Queue Data Transfered")
			.to("file:C:/outputFolder/");
	}

}
