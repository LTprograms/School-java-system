package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Alumno;
import model.Curso;
import view.AddAlumno;

public class AddAlumnoController {
	AddAlumno view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	public AddAlumnoController(ArrayList<Alumno> listaAlumnos, ArrayList<Curso> listaCursos) {
		view = new AddAlumno();
		this.listaAlumnos = listaAlumnos;
		this.listaCursos= listaCursos;
		this.view.btnRegistrar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Alumno a = getAlumno();
				if (a!=null) {
					if (addAlumno(a)) {
						JOptionPane.showMessageDialog(view, "Alumno añadido con exito");
						AddAlumnoController fr = new AddAlumnoController(listaAlumnos, listaCursos);
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
