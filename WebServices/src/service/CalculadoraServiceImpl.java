package service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public Float sumar(Float a, Float b) {
		return a + b;
	}

	@Override
	public Float restar(Float a, Float b) {
		// TODO Auto-generated method stub
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
