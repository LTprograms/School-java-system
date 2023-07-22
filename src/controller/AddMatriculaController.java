package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Alumno;
import model.Curso;
import model.Matricula;
import model.Retiro;
import view.AddMatricula;

public class AddMatriculaController {
	AddMatricula view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	ArrayList<Matricula> listaMatriculas;
	ArrayList<Retiro> listaRetiros;
	public AddMatriculaController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos, ArrayList<Matricula> matriculas, ArrayList<Retiro> retiros) {
		view = new AddMatricula();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		this.listaMatriculas = matriculas;
		this.listaRetiros = retiros;
		
		this.view.btnRegistrar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Matricula m = getMatricula();
				if (getCurso(m.getCodCurso())!=null) {
					if (getAlumno(m.getCodAlumno())!=null) {
						listaMatriculas.add(m);
						JOptionPane.showMessageDialog(view, "Matricula agregada con exito");
						AddMatriculaController fr = new AddMatriculaController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
						view.dispose();
						fr.run();
					} else {
						JOptionPane.showMessageDialog(view, "Alumno ionexistente o ya matriculado");											
					}
				} else {
					JOptionPane.showMessageDialog(view, "Curso ionexistente");						
				}
			}
            
        });
		
		this.view.addAlumno.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddAlumnoController fr = new AddAlumnoController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}
            
        });
		this.view.addCurso.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddCursoController fr = new AddCursoController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}
            
        });
		this.view.updateAlumno.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsultarAlumnosController fr = new ConsultarAlumnosController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}
            
        });
		this.view.updateCurso.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsultarCursoController fr = new ConsultarCursoController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}           
        });		
		
	}
	public void run() {
		this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
	}
	private Matricula getMatricula() {
		int code = Integer.parseInt(this.view.lblCode.getText());
		String fecha = this.view.lblDate.getText();
		String hora = this.view.lblHour.getText();
		int alumno = Integer.parseInt(this.view.txtAlumno.getText());
		int curso = Integer.parseInt(this.view.txtCurso.getText());
		return new Matricula(code, alumno, curso, fecha, hora);
	}
	private Alumno getAlumno(int cod) {
		for (Alumno a : listaAlumnos) {
			if (a.getCodAlumno() == cod) {	
				if (a.getEstado() != 1) {
					a.setEstado(1);
					return a;				
				} else {
					return null;
				}
			}
		}		
		return null;
	}
	private Curso getCurso(int cod) {
		for (Curso c : listaCursos) {
			if (c.getCodCurso() == cod) {
				return c;
			}
		}
		return null;
	}
}
