package edu.Controladores;
import edu.Servicios.MenuInterfaz;
import edu.Servicios.OperativaAlumnoImplementacion;
import edu.Servicios.OperativaAlumnoInterfaz;
import edu.Servicios.AlumnoDto;
import edu.Servicios.MenuImplementacion;
import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.lang.classfile.instruction.SwitchCase;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de acceso a la aplicación.
 * 190924
 * @author CHI
 */
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("LDTS ALTAIR");
		List<AlumnoDto> alumnos = new ArrayList<AlumnoDto>();
		MenuInterfaz menu = new MenuImplementacion();
		OperativaAlumnoInterfaz alumnosNuevos = new OperativaAlumnoImplementacion();
		boolean cerrarMenu = false;
		
		while(!cerrarMenu) {
			try {
				
				int num = menu.opMenu();
				switch (num) {
					case 0: {
						
						System.out.println("Cerrar menú");
						cerrarMenu = true;
						break;
					}
					case 1: {
						System.out.println("Alta de alumno");
						alumnosNuevos.alumnoNuevo(alumnos);
						for (AlumnoDto alumnoDto : alumnos) {
							System.out.println(alumnoDto);
						}
						break;
					}
					case 2: {
						System.out.println("Modificación de alumno");
						break;
					}
					case 3: {
						System.out.println("Baja de alumno");
						break;
					}
					default:
						System.out.println("Opción no válida");
						break;
					}
			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Se ha producido un error " + e.getMessage());
			}
		}
	}

}
