package client;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ws.Calculadora;

public class CalculadoraClient {
	private Scanner scanner;
	private Calculadora calculadoraClient;

	@SuppressWarnings("resource")
	public CalculadoraClient() {
		scanner = new Scanner(System.in);
		calculadoraClient = 
				new ClassPathXmlApplicationContext("config/applicationContext.xml")
					.getBean("calculadoraClient", Calculadora.class);
			
	}
	
	public void iniciar() {
		while (true) {
			System.out.println();
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			System.out.print("?");
			String opcion = scanner.nextLine();
			
			if (opcion.equals("1") || opcion.equals("2") ||
					opcion.equals("3") || opcion.equals("4")) {
			
				pedirDatos(opcion);
			} else if (opcion.equals("5")) {
				break;
			}
		}		
	}
	
	private void pedirDatos(String opcion) {
		System.out.print("a?");
		Float a = Float.parseFloat(scanner.nextLine());
		System.out.print("b?");
		Float b = Float.parseFloat(scanner.nextLine());
		
		if (opcion.equals("1"))
			System.out.println(a + " + " + b + " = " +
					calculadoraClient.sumar(a, b));
		else if (opcion.equals("2"))
			System.out.println(a + " - " + b + " = " +
					calculadoraClient.restar(a, b));
		else if (opcion.equals("3"))
			System.out.println(a + " * " + b + " = " +
					calculadoraClient.multiplicar(a, b));
		else if (opcion.equals("4"))
			System.out.println(a + " / " + b + " = " +
					calculadoraClient.dividir(a, b));
	}
	
	public static void main(String[] args) {
		new CalculadoraClient().iniciar();
	}

}
