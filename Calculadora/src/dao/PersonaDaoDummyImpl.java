package dao;

import java.util.ArrayList;
import java.util.List;

import model.Persona;

import org.springframework.stereotype.Component;

@Component
public class PersonaDaoDummyImpl implements PersonaDao {
	private List<Persona> personas;
	private Integer id;

	public PersonaDaoDummyImpl() {
		personas = new ArrayList<Persona>();
		id = 1;
	}
	
	@Override
	public void agregar(Persona persona) {
		persona.setId(id++);
		personas.add(persona);
	}

	@Override
	public void modificar(Persona persona) {
		Persona p = obtener(persona.getId());
		
		if (p != null)
			personas.set(personas.indexOf(p), persona);
	}

	@Override
	public void eliminar(Integer id) {
		Persona p = obtener(id);
		
		if (p != null)
			personas.remove(p);
	}

	@Override
	public Persona obtener(Integer id) {
		for (Persona p : personas) 
			if (p.getId().equals(id))
				return p;

		return null;
	}

	@Override
	public List<Persona> obtenerTodos() {
		return personas;
	}

}
