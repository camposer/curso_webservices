package ws;

import java.util.List;

import javax.jws.WebService;

import ws.PersonaSoap;

import org.springframework.beans.factory.annotation.Autowired;

import service.PersonaService;

@WebService(endpointInterface="ws.PersonaSoap")
public class PersonaSoapImpl implements PersonaSoap {
	@Autowired
	private PersonaService personaService;

	@Override
	public void agregarPersona(model.Persona persona) {
		personaService.agregarPersona(persona);
	}

	@Override
	public void modificarPersona(model.Persona persona) {
		personaService.modificarPersona(persona);
	}

	@Override
	public void eliminarPersona(Integer id) {
		personaService.eliminarPersona(id);
	}

	@Override
	public model.Persona obtenerPersona(Integer id) {
		return personaService.obtenerPersona(id);
	}

	@Override
	public List<model.Persona> obtenerPersonas() {
		return personaService.obtenerPersonas();
	}

}
