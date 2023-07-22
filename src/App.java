/**
 * 
 */
import java.util.ArrayList;

import controller.MainController;
import model.Alumno;
import model.Curso;
import model.Matricula;
import model.Retiro;
/**
 * 
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Alumno> listaAlumnos = new ArrayList<>();
		ArrayList <Curso> listaCursos = new ArrayList<>();
		ArrayList <Matricula> listaMatriculas = new ArrayList<>();
		ArrayList <Retiro> listaRetiros = new ArrayList<>();
		// add alumnos
		listaAlumnos.add(new Alumno(20231001, "Luis", "La Torre", "72682166", 20, 922345683, 0));
		listaAlumnos.add(new Alumno(20231002, "María", "Gómez", "73891234", 22, 911234567, 1));
		listaAlumnos.add(new Alumno(20231003, "Carlos", "Pérez", "76549876", 21, 922345678, 2));
		listaAlumnos.add(new Alumno(20231004, "Ana", "Ramírez", "71234567", 23, 933456789, 0));
		listaAlumnos.add(new Alumno(20231005, "Pedro", "López", "72134568", 20, 944567890, 1));
		listaAlumnos.add(new Alumno(20231006, "Laura", "Fernández", "72345678", 22, 955678901, 2));
		listaAlumnos.add(new Alumno(20231007, "Javier", "García", "73456789", 21, 966789012, 0));
		listaAlumnos.add(new Alumno(20231008, "Mariana", "Martínez", "74567890", 23, 977890123, 1));
		listaAlumnos.add(new Alumno(20231009, "Diego", "Hernández", "75678901", 20, 988901234, 2));
		listaAlumnos.add(new Alumno(20231010, "Paula", "Díaz", "71234567", 22, 999012345, 0));
		// add cursos
		listaCursos.add(new Curso(1252, "Programacion 1", 1, 3, 5));
		listaCursos.add(new Curso(1001, "Base de Datos", 2, 4, 6));
		listaCursos.add(new Curso(1002, "Matemáticas", 1, 3, 4));
		listaCursos.add(new Curso(1003, "Física", 3, 5, 7));
		listaCursos.add(new Curso(1004, "Programación 2", 2, 4, 5));
		listaCursos.add(new Curso(1005, "Inglés", 1, 2, 3));
		listaCursos.add(new Curso(1006, "Arte", 4, 3, 4));
		listaCursos.add(new Curso(1007, "Historia", 3, 2, 3));
		listaCursos.add(new Curso(1008, "Química", 2, 4, 6));
		listaCursos.add(new Curso(1009, "Economía", 4, 3, 5));

		MainController controller = new MainController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
		controller.run();
	}

}
