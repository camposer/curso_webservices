package ws;

import javax.jws.WebService;
// http://localhost:8080/Calculadora/service/HolaMundo?wsdl
@WebService(endpointInterface="ws.HolaMundo")
public class HolaMundoImpl implements HolaMundo {
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}
}
