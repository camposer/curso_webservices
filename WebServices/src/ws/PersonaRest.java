package ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import model.Persona;

import org.springframework.beans.factory.annotation.Autowired;

import service.PersonaService;

@Consumes("application/json")
@Produces("application/json") // Esto es posible porque tenemos la dependencia de Jackson
public class PersonaRest {
	@Autowired
	private PersonaService personaService;
	
	/**
	 * POST /personas/
	 * 
	 * Por ejemplo:
	 * 
	 * POST /personas
	 * { "nombre": "Juan", "apellido": "Pérez" }
	 */
	@POST
	@Path("")
	public void agregarPersona(Persona persona) {
		personaService.agregarPersona(persona);
	}
	
	/**
	 * PUT /personas/{id}
	 * 
	 * Por ejemplo:
	 * 
	 * PUT /personas/1
	 * { "nombre": "Juan", "apellido": "Pérez" }
	 */
	@PUT
	@Path("/{id}")
	public void modificarPersona(
			@PathParam("id") Integer id, 
			Persona persona) {
		
		personaService.modificarPersona(persona);
	}

	/**
	 * DELETE /personas/{id}
	 * 
	 * Por ejemplo:
	 * 
	 * DELETE /personas/1
	 */
	@DELETE
	@Path("/{id}")
	public void eliminarPersona(@PathParam("id") Integer id) {
		personaService.eliminarPersona(id);
	}
	
	/**
	 * GET /personas/{id}
	 * 
	 * Por ejemplo:
	 * 
	 * GET /personas/1
	 */
	@GET
	@Path("/{id}")
	public Persona obtenerPersona(@PathParam("id") Integer id) {
		return personaService.obtenerPersona(id);
	}
	
	/**
	 * GET /personas
	 * 
	 * Por ejemplo:
	 * 
	 * GET /personas
	 */
	@GET
	@Path("")
	public List<Persona> obtenerPersonas() {
		return personaService.obtenerPersonas();
	}
}
