package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Alumno;
import model.Curso;
import model.Matricula;
import model.Retiro;
import view.AddAlumno;

public class AddAlumnoController {
	AddAlumno view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	ArrayList<Matricula> listaMatriculas;
	ArrayList<Retiro> listaRetiros;
	public AddAlumnoController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos, ArrayList<Matricula> matriculas, ArrayList<Retiro> retiros) {
		view = new AddAlumno();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		this.listaMatriculas = matriculas;
		this.listaRetiros = retiros;
		this.view.btnRegistrar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Alumno a = getAlumno();
				if (a!=null) {
					if (addAlumno(a)) {
						JOptionPane.showMessageDialog(view, "Alumno añadido con exito");						
						Alumno.setIndex();
						AddAlumnoController fr = new AddAlumnoController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
						view.dispose();
						fr.run();
					} else {
						JOptionPane.showMessageDialog(view, "El alumno ya existe");						
					}
				} else {
					JOptionPane.showMessageDialog(view, "Llena todos los campos");											
				}
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
		this.view.addMatricula.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddMatriculaController fr = new AddMatriculaController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}           
        });
		this.view.updateMatricula.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsultarMatriculaController fr = new ConsultarMatriculaController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}           
        });
	}
	public void run() {
		this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
	}
	private boolean addAlumno(Alumno a) {
		for (Alumno alumno : this.listaAlumnos) {
			if (alumno.getDni().equals(a.getDni())) {
				return false;
			}
		}
		this.listaAlumnos.add(a);
		return true;
	}
	private Alumno getAlumno() {
		int cod = Integer.parseInt(this.view.lblCode.getText());
		String nombres = this.view.txtNombre.getText();
		String apellidos = this.view.txtApellido.getText();
		int edad = Integer.parseInt(this.view.txtEdad.getText());
		String dni = this.view.txtDni.getText();
		int celular = Integer.parseInt(this.view.txtCelular.getText());
		int estado = 0;
		if (nombres.equals("") || apellidos.equals("") || dni.length()!=8) {
			return null;
		}
		return new Alumno(cod, nombres, apellidos, dni, edad, celular, estado);
	}
}
