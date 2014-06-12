package client;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.activation.DataHandler;

import model.Persona;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ws.PersonaRest;

public class PersonaRestClient {
	private static final String AGREGAR = "AGREGAR";
	private static final String MODIFICAR = "MODIFICAR";
	private Scanner scanner;
	private PersonaRest personaClient;

	@SuppressWarnings("resource")
	public PersonaRestClient() {
		scanner = new Scanner(System.in);
		personaClient = 
				new ClassPathXmlApplicationContext("config/applicationContext.xml")
					.getBean("personaRestClient", PersonaRest.class);
			
	}
	
	public void iniciar() throws Exception {
		while (true) {
			System.out.println();
			System.out.println("1. Agregar");
			System.out.println("2. Modificar");
			System.out.println("3. Eliminar");
			System.out.println("4. Listar");
			System.out.println("5. Salir");
			System.out.print("? ");
			String opcion = scanner.nextLine();
			
			if (opcion.equals("1") || opcion.equals("2") ||
					opcion.equals("3") || opcion.equals("4")) {
			
				pedirDatos(opcion);
			} else if (opcion.equals("5")) {
				break;
			}
		}		
	}
	
	private void pedirDatos(String opcion) throws Exception {
		if (opcion.equals("1"))
			actualizar(AGREGAR);
		else if (opcion.equals("2"))
			actualizar(MODIFICAR);
		else if (opcion.equals("3"))
			eliminar();
		else if (opcion.equals("4"))
			listar();
	}
	
	private void listar() throws Exception {
		for (Persona p : personaClient.obtenerPersonas()) {
			System.out.println(p);

			// Guardando el avatar en el disco
			if (p.getAvatar() != null) {
				DataHandler dh = p.getAvatar();
				File archivoSalida = new File("img/avatar-" + 
						p.getId() + ".jpg");
				Files.copy(dh.getInputStream(), 
						archivoSalida.toPath(), 
						StandardCopyOption.REPLACE_EXISTING);
			}
		}
	}

	private void eliminar() {
		System.out.print("id? ");
		Integer id = Integer.parseInt(scanner.nextLine()); 
		
		personaClient.eliminarPersona(id);
	}

	private void actualizar(String operacion) throws Exception {
		Persona p = new Persona();
		
		if (operacion.equals(MODIFICAR)) {
			System.out.print("id? ");
			Integer id = Integer.parseInt(scanner.nextLine()); 
			p.setId(id);
		}

		System.out.print("nombre? ");
		p.setNombre(scanner.nextLine());
		
		System.out.print("apellido? ");
		p.setApellido(scanner.nextLine());
		
		System.out.print("fnac? ");
		String sfnac = scanner.nextLine();
		p.setFechaNacimiento(new SimpleDateFormat("dd-MM-yyyy").parse(sfnac));
		
		System.out.print("altura? ");
		String saltura = scanner.nextLine();
		p.setAltura(Float.parseFloat(saltura));
		
		System.out.print("avatar (url)? ");
		String urlAvatar = scanner.nextLine();
		if (!urlAvatar.equals(""))
			p.setAvatar(new DataHandler(new URL(urlAvatar)));

		if (operacion.equals(AGREGAR))
			personaClient.agregarPersona(p);
		else
			personaClient.modificarPersona(p.getId(), p);
	}

	public static void main(String[] args) throws Exception {
		new PersonaRestClient().iniciar();
	}

}
