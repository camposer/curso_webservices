package ws;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import service.CalculadoraService;

@WebService(
		endpointInterface="ws.Calculadora", 
		serviceName="CalculadoraService",
		targetNamespace="http://demo.com/ws"
	)
public class CalculadoraImpl implements Calculadora {
	@Autowired
	private CalculadoraService calculadoraService;
	
	@Override
	public Float sumar(Float a, Float b) {
		return calculadoraService.sumar(a, b);
	}

	@Override
	public Float restar(Float a, Float b) {
		return calculadoraService.restar(a, b);
	}

	@Override
	public Float dividir(Float a, Float b) {
		return calculadoraService.dividir(a, b);
	}

	@Override
	public Float multiplicar(Float a, Float b) {
		return calculadoraService.multiplicar(a, b);
	}
	
}
