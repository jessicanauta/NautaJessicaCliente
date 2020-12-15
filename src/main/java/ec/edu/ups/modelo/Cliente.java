package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String fecha;
	//private Date fecha_nacimiento;
	
	public Cliente() {
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

//	public Date getFecha_nacimiento() {
//		return fecha_nacimiento;
//	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

//	public void setFecha_nacimiento(Date fecha_nacimiento) {
//		this.fecha_nacimiento = fecha_nacimiento;
//	}
//
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + "]";
	}
	
	
	

}
