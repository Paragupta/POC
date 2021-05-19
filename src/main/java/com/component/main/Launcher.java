package com.component.main;

import org.apache.camel.main.Main;

import com.component.jms.JmsComponent;



public class Launcher {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Main main = new Main();
        main.addRouteBuilder(new JmsComponent());
        main.run(args);
	}

}
