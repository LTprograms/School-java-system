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
import view.ConsultarCurso;

public class ConsultarCursoController {
	ConsultarCurso view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	ArrayList<Matricula> listaMatriculas;
	ArrayList<Retiro> listaRetiros;
	public ConsultarCursoController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos, ArrayList<Matricula> matriculas, ArrayList<Retiro> retiros) {
		view = new ConsultarCurso();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		this.listaMatriculas = matriculas;
		this.listaRetiros = retiros;
		fillTable();
		this.view.btnEliminar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int code = Integer.parseInt(view.txtCode.getText());
				Curso c = getCurso(code);
				if (c != null) {
					if (!isMatriculado(c)) {
						if (JOptionPane.showConfirmDialog(view, "¿Deseas eliminar este curso?")==JOptionPane.YES_OPTION) {
							deleteCurso(c);
							ConsultarCursoController fr = new ConsultarCursoController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
							view.dispose();
							fr.run();
						}						
					} else {
						JOptionPane.showMessageDialog(view, "No se puede eliminar el curso");						
					}
				}else {
					JOptionPane.showMessageDialog(view, "El curso no existe");
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
		});this.view.updateRetiro.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
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
        model.addColumn("Asignatura");
        model.addColumn("Ciclo");
        model.addColumn("Creditos");
        model.addColumn("Horas");
        for (Curso c : this.listaCursos) {
        	model.addRow(new Object[] {c.getCodCurso(), c.getAsignatura(), c.getCiclo(), c.getCreditos(), c.getHoras()});
        }
        this.view.table.setModel(model);
	}
	private Curso getCurso(int code) {
		for (Curso c : listaCursos) {
			if (c.getCodCurso() == code) {
				return c;
			}
		}
		return null;
	}
	private void deleteCurso (Curso c) {
		int index = 0;
		for (Curso curso : listaCursos) {
			if (c.getCodCurso() == curso.getCodCurso()) {
				break;
			}
			index++;
		}
		listaCursos.remove(index);
	}
	private boolean isMatriculado(Curso c) {
		for (Matricula m : listaMatriculas) {
			if (m.getCodCurso() == c.getCodCurso()) {
				return true;
			}
		}
		return false;
	}
}
