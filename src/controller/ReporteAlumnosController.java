package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Alumno;
import model.Curso;
import model.Matricula;
import model.Retiro;
import view.MainFrame;
import view.ReporteAlumnos;

public class ReporteAlumnosController {
	ReporteAlumnos view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	ArrayList<Matricula> listaMatriculas;
	ArrayList<Retiro> listaRetiros;
	public ReporteAlumnosController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos, ArrayList<Matricula> matriculas, ArrayList<Retiro> retiros, int type) {
		view = new ReporteAlumnos();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		this.listaMatriculas = matriculas;
		this.listaRetiros = retiros;
		fillTable(type);
		
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
	private void  fillTable(int type) {
        DefaultTableModel model = new DefaultTableModel();
        if (type==1 || type==2) {
        	model.addColumn("Codigo");
        	model.addColumn("DNI");
        	model.addColumn("Apellidos");
        	model.addColumn("Nombres");
        	model.addColumn("Edad");
        	model.addColumn("Celular");
        	model.addColumn("Estado");
        	if(type==1) { // registradas
        		view.lbTitulo.setText("Matriculas pendientes");
        		for (Alumno a : this.listaAlumnos) {
        			if (a.getEstado() == 0) {
        				model.addRow(new Object[] {a.getCodAlumno(), a.getDni(), a.getApellidos(), a.getNombres(), a.getEdad(), a.getCelular(), a.getEstado()});        				
        			}
        		}        		
        	} else {
        		view.lbTitulo.setText("Matriculas vigentes");
        		for (Alumno a : this.listaAlumnos) {
        			if (a.getEstado() == 1) {
        				model.addRow(new Object[] {a.getCodAlumno(), a.getDni(), a.getApellidos(), a.getNombres(), a.getEdad(), a.getCelular(), a.getEstado()});        				
        			}
        		}        		        		
        	}
        } else {
        	view.lbTitulo.setText("Matriculados por curso");
        	ArrayList<String> asignaturas = new ArrayList<>();
            for (Curso curso : listaCursos) {
                asignaturas.add(curso.getAsignatura());
            }  
            String[] columnas = asignaturas.toArray(new String[0]);
            Object[][] datos = new Object[listaAlumnos.size()][asignaturas.size()];
            for (int i = 0; i < listaAlumnos.size(); i++) {
                Alumno alumno = listaAlumnos.get(i);
                for (int j = 0; j < asignaturas.size(); j++) {
                    Curso curso = listaCursos.get(j);
                    boolean x = false;

                    for (Matricula matricula : listaMatriculas) {
                        if (matricula.getCodAlumno() == alumno.getCodAlumno() &&
                                matricula.getCodCurso() == curso.getCodCurso()) {
                            x = true;
                            break;
                        }
                    }

                    datos[i][j] = x ? alumno.getNombres() : "";
                }
            }
            model = new DefaultTableModel(datos, columnas);
        }
        this.view.table.setModel(model);
	}
}
