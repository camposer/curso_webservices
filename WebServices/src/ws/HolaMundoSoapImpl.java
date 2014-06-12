package ws;

import javax.jws.WebService;
// http://localhost:8080/Calculadora/service/HolaMundo?wsdl
@WebService(endpointInterface="ws.HolaMundoSoap")
public class HolaMundoSoapImpl implements HolaMundoSoap {
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}
}
