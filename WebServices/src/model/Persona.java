package model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import adapter.DateAdapter;

@XmlType(propOrder={
		"id", 
		"nombre", 
		"apellido", 
		"fechaNacimiento",
		"altura"
	})
public class Persona implements Serializable {
	private static final long serialVersionUID = 6704642679088438716L;

	private Integer id;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Float altura;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@XmlElement(required=true)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlElement(required=true)
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
}
