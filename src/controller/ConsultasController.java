package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Alumno;
import model.Curso;
import model.Matricula;
import model.Retiro;
import view.Consultas;
import view.MainFrame;

public class ConsultasController {
	Consultas view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	ArrayList<Matricula> listaMatriculas;
	ArrayList<Retiro> listaRetiros;
	public ConsultasController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos, ArrayList<Matricula> matriculas, ArrayList<Retiro> retiros) {
		view = new Consultas();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		this.listaMatriculas = matriculas;
		this.listaRetiros = retiros;
		this.view.btnConsultar.addActionListener( new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int cod = Integer.parseInt(view.txtCode.getText());
				clearScreen();
				Alumno a = getAlumno(cod);
				Curso c;
				Matricula m;
				Retiro r;
				if (a != null) {
					printAlumno(a);
					if (a.getEstado() == 1) { // esta matriculado
						m = getMatricula(a);
						c = getCurso(m.getCodCurso());
						printCurso(c);
					}
				} else {
					// buscar curso
					c = getCurso(cod);
					if (c != null) {//si se encuentra curso ...
						printCurso(c);
					} else {
						m = getMatricula(cod);
						if (m!=null) { // se encuentra matricula
							a = getAlumno(m.getCodAlumno());
							c = getCurso(m.getCodCurso());
							printAlumno(a);
							printCurso(c);
						} else {
							r = getRetiro(cod);
							if (r != null) { // SE ENCUENTRA RETIRO
								m = getMatricula(r.getNumMatricula());
								a = getAlumno(m.getCodAlumno());
								c = getCurso(m.getCodCurso());
								printAlumno(a);
								printCurso(c);
							} else {
								// no se encuentra nada
								JOptionPane.showMessageDialog(view, "No se encontró registros");
							}
						}
					}
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
	private void clearScreen() {
		this.view.txtCode.setText("");
		this.view.lbCode.setText("");
		this.view.lbCodeCurso.setText("");
		this.view.lbNombre.setText("");
		this.view.lbApellido.setText("");
		this.view.lbDni.setText("");
		this.view.lbCelular.setText("");
		this.view.lbEstado.setText("");
		this.view.lbEdad.setText("");
		this.view.lbAsignatura.setText("");
		this.view.lbCiclo.setText("");
		this.view.lbHoras.setText("");
		this.view.lbCreditos.setText("");
	}
	private Alumno getAlumno(int cod) {
		for (Alumno a : listaAlumnos) {
			if (a.getCodAlumno() == cod) {
				return a;
			}
		}
		return null;
	}
	private Curso getCurso(int cod){
		for (Curso c : listaCursos) {
			if (c.getCodCurso() == cod) {
				return c;
			}
		}
		return null;
	}
	private Matricula getMatricula(int cod) {
		for (Matricula m : listaMatriculas) {
			if (m.getNumMatricula() == cod) {
				return m;
			}
		}
		return null;
	}
	private Matricula getMatricula(Alumno a) {
		for (Matricula m : listaMatriculas) {
			if (m.getCodAlumno() == a.getCodAlumno()) {
				return m;
			}
		}
		return null;
	}
	private Retiro getRetiro(int cod) {
		for (Retiro r : listaRetiros) {
			if (r.getNumRetiro() == cod) {
				return r;
			}
		}
		return null;
	}
	private void printAlumno(Alumno a) {
		this.view.lbCode.setText(""+a.getCodAlumno());
		this.view.lbNombre.setText(a.getNombres());
		this.view.lbApellido.setText(a.getApellidos());
		this.view.lbDni.setText(a.getDni());
		this.view.lbCelular.setText(""+a.getCelular());
		this.view.lbEdad.setText(""+a.getEdad());
		String estado = "";
		switch(a.getEstado()) {
			case 0 -> estado = "Registrado";
			case 1 -> estado = "Matriculado";
			case 2 -> estado = "Retirado";			
		}
		this.view.lbEstado.setText(estado);
	}
	private void printCurso(Curso c) {
		this.view.lbCodeCurso.setText(""+c.getCodCurso());
		this.view.lbAsignatura.setText(c.getAsignatura());
		this.view.lbCiclo.setText(""+c.getCiclo());
		this.view.lbHoras.setText(""+c.getHoras());
		this.view.lbCreditos.setText(""+c.getCreditos());
	}
}
