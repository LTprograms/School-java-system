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
						Matricula.setIndex();
						AddMatriculaController fr = new AddMatriculaController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
						view.dispose();
						fr.run();
					} else {
						JOptionPane.showMessageDialog(view, "Alumno inexistente o ya matriculado");											
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
