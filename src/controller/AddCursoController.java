package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Alumno;
import model.Curso;
import view.AddCurso;

public class AddCursoController {
	AddCurso view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	public AddCursoController(ArrayList<Alumno> listaAlumnos, ArrayList<Curso> listaCursos) {
		view = new AddCurso();
		this.listaAlumnos = listaAlumnos;
		this.listaCursos= listaCursos;
		this.view.btnRegistrar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
            
        });
	}
	public void run() {
		this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
	}
}
