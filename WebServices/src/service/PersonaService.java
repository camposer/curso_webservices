package service;

import java.util.List;

import model.Persona;

public interface PersonaService {
	public void agregarPersona(Persona persona);
	public void modificarPersona(Persona persona);
	public void eliminarPersona(Integer id);
	public Persona obtenerPersona(Integer id);
	public List<Persona> obtenerPersonas();
}
