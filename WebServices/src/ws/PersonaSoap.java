package ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public interface PersonaSoap {
	public void agregarPersona(@WebParam(name="persona") @XmlElement(required=true) model.Persona persona);
	public void modificarPersona(@WebParam(name="persona") @XmlElement(required=true) model.Persona persona);
	public void eliminarPersona(@WebParam(name="id") @XmlElement(required=true) Integer id);
	public model.Persona obtenerPersona(@WebParam(name="id") @XmlElement(required=true) Integer id);
	public List<model.Persona> obtenerPersonas();
}
