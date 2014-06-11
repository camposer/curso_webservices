package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ws.HolaMundo;

public class HolaMundoClient {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("config/applicationContext.xml");
		HolaMundo holaMundo = ctx.getBean("holaMundoClient", HolaMundo.class);
		String resultado = holaMundo.saludar("Rodolfo");
		System.out.println(resultado);
	}
}
