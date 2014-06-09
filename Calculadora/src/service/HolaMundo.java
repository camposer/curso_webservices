package service;

import javax.jws.WebService;
// http://localhost:8080/Calculadora/service/HolaMundo?wsdl
@WebService(endpointInterface="service.IHolaMundo")
public class HolaMundo implements IHolaMundo {
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}
}
