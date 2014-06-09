package service;

import javax.jws.WebService;

/**
 * Indica a CXF cómo es el servicio (para crear WSDL)
 */
@WebService
public interface IHolaMundo {
	public String saludar(String nombre);
}
