package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ws.HolaMundoSoap;

public class HolaMundoClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("config/applicationContext.xml");
		HolaMundoSoap holaMundo = ctx.getBean("holaMundoClient", HolaMundoSoap.class);
		String resultado = holaMundo.saludar("Rodolfo");
		System.out.println(resultado);
	}
}
