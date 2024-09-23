package edu.Servicios;

import java.sql.Date;

public class AlumnoDto {

	long id;
	
	String nombre = "aaaaa";
	
	String apellidos = "aaaaa";
	
	String dni = "aaaaa";
	
	String email = "aaaaa";
	
	String tlf = "aaaaa";
	
	Date fchNac = new Date(9999/12/31);

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public Date getFchNac() {
		return fchNac;
	}

	public void setFchNac(Date fchNac) {
		this.fchNac = fchNac;
	}
	
	public AlumnoDto() {
		
	}

	@Override
	public String toString() {
		return "Alumnos [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", email="
				+ email + ", tlf=" + tlf + ", fchNac=" + fchNac + "]";
	}
	
	
			
			
}
