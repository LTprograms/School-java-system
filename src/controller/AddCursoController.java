package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Alumno;
import model.Curso;
import view.AddCurso;

public class AddCursoController {
	AddCurso view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	public AddCursoController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos) {
		view = new AddCurso();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		this.view.btnRegistrar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					Curso curso = getCurso();
					if (curso != null) {
						if (addCurso(curso)) {
							JOptionPane.showMessageDialog(view, "Curso registrado con exito");
							AddCursoController fr = new AddCursoController(listaAlumnos, listaCursos);
							view.dispose();
							fr.run();
						} else {
							JOptionPane.showMessageDialog(view, "Curso ya registrado anteriormente");							
						}
					} else {
						JOptionPane.showMessageDialog(view, "LLena todos los campos");													
					}
			}
            
        });
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
		this.view.updateAlumno.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsultarAlumnosController fr = new ConsultarAlumnosController(listaAlumnos, listaCursos);
				view.dispose();
				fr.run();
			}
            
        });
		this.view.updateCurso.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsultarCursoController fr = new ConsultarCursoController(listaAlumnos, listaCursos);
				view.dispose();
				fr.run();
			}
            
        });
	}
	public void run() {
		this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
	}
	
	private boolean addCurso(Curso curso) {
		for (Curso c : this.listaCursos) {
			if (c.getCodCurso() == curso.getCodCurso()) {
				return false;
			}
		}
		this.listaCursos.add(curso);
		return true;
	}
	
	private Curso getCurso() {
		int cod = Integer.parseInt(this.view.txtCode.getText());
		String asignatura = this.view.txtAsignatura.getText();
		int ciclo = Integer.parseInt(this.view.txtCiclo.getText());
		int creditos = Integer.parseInt(this.view.txtCreditos.getText());
		int horas = Integer.parseInt(this.view.txtHoras.getText());
		return new Curso(cod, asignatura, ciclo, creditos, horas);
	}
}
