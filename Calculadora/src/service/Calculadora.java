package service;

import javax.jws.*;
//import javax.jws.soap.*;
//import javax.jws.soap.SOAPBinding.*;

@WebService(
		targetNamespace="http://demo.com/ws"
		)
//@SOAPBinding(style=Style.RPC, use=Use.ENCODED)
public interface Calculadora {
	@WebMethod(operationName="sum")
	public Float sumar(@WebParam(name="a") Float a, @WebParam(name="b") Float b);
	public Float restar(@WebParam(name="a") Float a, @WebParam(name="b") Float b);
	public Float dividir(@WebParam(name="a") Float a, @WebParam(name="b") Float b);
	public Float multiplicar(@WebParam(name="a") Float a, @WebParam(name="b") Float b);
}
