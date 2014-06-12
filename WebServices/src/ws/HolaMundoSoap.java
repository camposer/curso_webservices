package ws;

import javax.jws.WebService;

/**
 * Indica a CXF cómo es el servicio (para crear WSDL)
 */
@WebService
public interface HolaMundoSoap {
	public String saludar(String nombre);
}
