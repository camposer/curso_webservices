package ws;

import java.util.List;

import javax.ws.rs.PathParam;

import model.Persona;

import org.springframework.beans.factory.annotation.Autowired;

import service.PersonaService;

public class PersonaRestImpl implements PersonaRest {
	@Autowired
	private PersonaService personaService;
	
	@Override
	public void agregarPersona(Persona persona) {
		personaService.agregarPersona(persona);
	}
	
	@Override
	public void modificarPersona(
			@PathParam("id") Integer id, 
			Persona persona) {
		
		persona.setId(id);
		personaService.modificarPersona(persona);
	}

	@Override
	public void eliminarPersona(@PathParam("id") Integer id) {
		personaService.eliminarPersona(id);
	}
	
	@Override
	public Persona obtenerPersona(@PathParam("id") Integer id) {
		return personaService.obtenerPersona(id);
	}
	
	@Override
	public List<Persona> obtenerPersonas() {
		return personaService.obtenerPersonas();
	}
}
