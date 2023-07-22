/**
 * 
 */
import java.util.ArrayList;

import controller.MainController;
import model.Alumno;
import model.Curso;
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
		MainController controller = new MainController(listaAlumnos, listaCursos);
		controller.run();
	}

}
