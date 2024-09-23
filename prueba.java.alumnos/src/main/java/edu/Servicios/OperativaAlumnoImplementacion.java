package edu.Servicios;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class OperativaAlumnoImplementacion implements OperativaAlumnoInterfaz{

	
	public void alumnoNuevo(List<AlumnoDto> listaAlumnos) {
		
		/**AlumnoDto alumnoNuevo = new AlumnoDto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre del Alumno");
		String Nombre = sc.next();
		alumnoNuevo.setNombre(Nombre);
		
		System.out.println("Apellidos del Alumno (Juntos)");
		String apellidos = sc.next();
		alumnoNuevo.setApellidos(apellidos);
		
		System.out.println("DNI del alumno");
		String dni = sc.next();
		alumnoNuevo.setDni(dni);
		
		System.out.println("Email del alumno");
		String email = sc.next();
		alumnoNuevo.setEmail(email);
		
		System.out.println("Teléfono del alumno");
		String telefono = sc.next();
		alumnoNuevo.setTlf(telefono);
		
		System.out.println("Fecha de nacimiento del alumno");
		Date fecha = new Date(sc.nextInt());
		alumnoNuevo.setFchNac(fecha);
		
		
		alumnoNuevo.setId(idAutoincremental(listaAlumnos));*/
		
		AlumnoDto alumnoNuevo = new AlumnoDto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre del Alumno");
		alumnoNuevo.nombre = sc.next();
		
		
		System.out.println("Apellidos del Alumno (Juntos)");
		alumnoNuevo.apellidos = sc.next();
		
		System.out.println("DNI del alumno");
		alumnoNuevo.dni = sc.next();
		
		System.out.println("Email del alumno");
		alumnoNuevo.email = sc.next();
		
		System.out.println("Teléfono del alumno");
		alumnoNuevo.tlf = sc.next();
		
		System.out.println("Fecha de nacimiento del alumno");
		Date fecha = new Date(sc.next());
		
		
		alumnoNuevo.setId(idAutoincremental(listaAlumnos));
		listaAlumnos.add(alumnoNuevo);
		
		
		
		
	}
	
	private long idAutoincremental(List<AlumnoDto> listaAlumnos) {
		
		long idN = 0;
		
		int tamanioLista = listaAlumnos.size();
		
		if(tamanioLista > 0) {
			idN = listaAlumnos.get(tamanioLista - 1).getId() + 1;
		}
		else {
			idN = 1;
		}
		return idN;
		
	}
}
