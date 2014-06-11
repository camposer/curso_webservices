package ws;

import javax.jws.*;
import javax.xml.bind.annotation.XmlElement;
//import javax.jws.soap.*;
//import javax.jws.soap.SOAPBinding.*;

@WebService(
		targetNamespace="http://demo.com/ws"
		)
//@SOAPBinding(style=Style.RPC, use=Use.ENCODED)
public interface CalculadoraWs {
	@WebMethod(operationName="sum")
	public Float sumar(
		@WebParam(name="a") 
		@XmlElement(required=true) Float a, 
		@WebParam(name="b") 
		@XmlElement(required=true) Float b);
	public Float restar(@WebParam(name="a") Float a, @WebParam(name="b") Float b);
	public Float dividir(@WebParam(name="a") Float a, @WebParam(name="b") Float b);
	public Float multiplicar(@WebParam(name="a") Float a, @WebParam(name="b") Float b);
}
