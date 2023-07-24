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

		MainController controller = new MainController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
		controller.run();
	}

}
