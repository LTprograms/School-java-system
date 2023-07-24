package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Alumno;
import model.Curso;
import model.Matricula;
import model.Retiro;
import view.AddCurso;
import view.ConsultarAlumnos;

public class ConsultarAlumnosController {
	ConsultarAlumnos view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	ArrayList<Matricula> listaMatriculas;
	ArrayList<Retiro> listaRetiros;
	public ConsultarAlumnosController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos, ArrayList<Matricula> matriculas, ArrayList<Retiro> retiros) {
		view = new ConsultarAlumnos();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		this.listaMatriculas = matriculas;
		this.listaRetiros = retiros;
		fillTable();
		this.view.btnEliminar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dni = view.txtCod.getText();
				Alumno a = getAlumno(dni);
				if (a != null) {
					if (a.getEstado() == 0) {
						if (JOptionPane.showConfirmDialog(view, "¿Deseas eliminar este alumno?")==JOptionPane.YES_OPTION) {
							deleteAlumno(a);
							ConsultarAlumnosController fr = new ConsultarAlumnosController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
							view.dispose();
							fr.run();
						}						
					} else {
						JOptionPane.showMessageDialog(view, "No se puede eliminar este alumno");						
					}
				} else {
					JOptionPane.showMessageDialog(view, "El alumno no existe");
				}
			}
            
        });
		this.view.btnModificar.addActionListener( new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dni = view.txtCod.getText();
				Alumno a = getAlumno(dni);
				if (a != null) {
					ModificarAlumnoController fr = new ModificarAlumnoController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros, a);
					view.dispose();
					fr.run(); 					
				} else {
					JOptionPane.showMessageDialog(view, "El alumno no existe");
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
		this.view.addRetiro.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddRetiroController fr = new AddRetiroController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}           
		});

		this.view.updateRetiro.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsultarRetiroController fr = new ConsultarRetiroController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}           
		});
		this.view.consultarMenu.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsultasController fr = new ConsultasController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
				view.dispose();
				fr.run();
			}           
		});
		this.view.pendientes.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReporteAlumnosController fr = new ReporteAlumnosController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros, 1);
				view.dispose();
				fr.run(); 
				
			}           
		});
		this.view.vigentes.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReporteAlumnosController fr = new ReporteAlumnosController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros, 2);
				view.dispose();
				fr.run(); 
			}           
		});
		this.view.cursosMatriculas.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReporteAlumnosController fr = new ReporteAlumnosController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros, 3);
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
	private Alumno getAlumno(String dni) {
		for (Alumno a : listaAlumnos) {
			if (a.getDni().equals(dni)) {
				return a;
			}
		}
		return null;
	}
	private void deleteAlumno (Alumno a) {
		int index = 0;
		for (Alumno alumno : listaAlumnos) {
			if (a.getDni().equals(alumno.getDni())) {
				break;
			}
			index++;
		}
		listaAlumnos.remove(index);
	}
}
