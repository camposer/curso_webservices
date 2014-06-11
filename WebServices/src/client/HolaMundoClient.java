package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ws.HolaMundoWs;

public class HolaMundoClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("config/applicationContext.xml");
		HolaMundoWs holaMundo = ctx.getBean("holaMundoClient", HolaMundoWs.class);
		String resultado = holaMundo.saludar("Rodolfo");
		System.out.println(resultado);
	}
}
