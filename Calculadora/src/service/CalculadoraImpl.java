package service;

import javax.jws.WebService;

@WebService(
		endpointInterface="service.Calculadora", 
		serviceName="CalculadoraService",
		targetNamespace="http://demo.com/ws"
	)
public class CalculadoraImpl implements Calculadora {

	@Override
	public Float sumar(Float a, Float b) {
		return a + b;
	}

	@Override
	public Float restar(Float a, Float b) {
		return a - b;
	}

	@Override
	public Float dividir(Float a, Float b) {
		return a / b;
	}

	@Override
	public Float multiplicar(Float a, Float b) {
		return a * b;
	}
	
}
