package ws;

import javax.jws.WebService;

/**
 * Indica a CXF cómo es el servicio (para crear WSDL)
 */
@WebService
public interface HolaMundo {
	public String saludar(String nombre);
}
