package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Alumno;
import model.Curso;
import view.MainFrame;

public class MainController {
	MainFrame view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	public MainController(ArrayList<Alumno> listaAlumnos, ArrayList<Curso> listaCursos) {
		view = new MainFrame();
		this.listaAlumnos = listaAlumnos;
		this.listaCursos= listaCursos;
		this.view.addAlumno.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddAlumnoController fr = new AddAlumnoController(listaAlumnos, listaCursos);
				view.dispose();
				fr.run();
			}
            
        });
		this.view.addCurso.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddCursoController fr = new AddCursoController(listaAlumnos, listaCursos);
				view.dispose();
				fr.run();
			}
            
        });
	}
	public void run() {
		this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
	}
}
