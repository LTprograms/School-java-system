package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Alumno;
import model.Curso;
import view.AddCurso;
import view.ConsultarAlumnos;

public class ConsultarAlumnosController {
	ConsultarAlumnos view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	public ConsultarAlumnosController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos) {
		view = new ConsultarAlumnos();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		fillTable();
		/*this.view.btnRegistrar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
            
        });*/
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
	private void  fillTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("DNI");
        model.addColumn("Apellidos");
        model.addColumn("Nombres");
        model.addColumn("Edad");
        model.addColumn("Celular");
        model.addColumn("Estado");
        for (Alumno a : this.listaAlumnos) {
        	model.addRow(new Object[] {a.getCodAlumno(), a.getDni(), a.getApellidos(), a.getNombres(), a.getEdad(), a.getCelular(), a.getEstado()});
        }
        this.view.table.setModel(model);
	}
}
