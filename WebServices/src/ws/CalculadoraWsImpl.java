package ws;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import service.CalculadoraService;

@WebService(
		endpointInterface="ws.CalculadoraWs", 
		serviceName="CalculadoraWs",
		targetNamespace="http://demo.com/ws"
	)
public class CalculadoraWsImpl implements CalculadoraWs {
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
