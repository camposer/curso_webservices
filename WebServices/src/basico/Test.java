package basico;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		IUno uno = UnoFactory.createUno();
		uno.imprimir();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		uno = ctx.getBean("uno", IUno.class);
		uno.imprimir();
	}
}
