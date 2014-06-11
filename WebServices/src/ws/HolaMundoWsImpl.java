package ws;

import javax.jws.WebService;
// http://localhost:8080/Calculadora/service/HolaMundo?wsdl
@WebService(endpointInterface="ws.HolaMundoWs")
public class HolaMundoWsImpl implements HolaMundoWs {
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}
}
