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
import view.ConsultarMatriculas;
import view.ConsultarRetiro;

public class ConsultarRetiroController {
	ConsultarRetiro view;
	ArrayList<Alumno> listaAlumnos;
	ArrayList<Curso> listaCursos;
	ArrayList<Matricula> listaMatriculas;
	ArrayList<Retiro> listaRetiros;
	public ConsultarRetiroController(ArrayList<Alumno> alumnos, ArrayList<Curso> cursos, ArrayList<Matricula> matriculas, ArrayList<Retiro> retiros) {
		view = new ConsultarRetiro();
		this.listaAlumnos = alumnos;
		this.listaCursos= cursos;
		this.listaMatriculas = matriculas;
		this.listaRetiros = retiros;
		fillTable();
		
		this.view.btnEliminar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int cod = Integer.parseInt(view.txtCode.getText());
				Retiro r = getRetiro(cod);
				if (r != null) {
					Matricula m = getMatricula(r.getNumMatricula());
					Alumno a = getAlumno(m.getCodAlumno());
					if (a.getEstado() == 2) {
						if (JOptionPane.showConfirmDialog(view, "¿Deseas eliminar esta matricula?")==JOptionPane.YES_OPTION) {
							deleteRetiro(r, a);
							ConsultarRetiroController fr = new ConsultarRetiroController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
							view.dispose();
							fr.run();
						}						
					} else {
						JOptionPane.showMessageDialog(view, "No se puede eliminar este retiro");						
					}
				} else {
					JOptionPane.showMessageDialog(view, "El retiro no existe");
				}
			}
            
        });
		this.view.btnModificar.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int cod = Integer.parseInt(view.txtCode.getText());
				Retiro r = getRetiro(cod);
				if (r != null) {
					int code = Integer.parseInt(JOptionPane.showInputDialog(view, "Nuevo curso: "));
					for (Matricula matricula : listaMatriculas) {
						if (matricula.getNumMatricula() == r.getNumMatricula()) {
							matricula.setCodCurso(code);
							break;
						}
					}
					JOptionPane.showMessageDialog(view, "Retiro actualizado con  exito");
					ConsultarRetiroController fr = new ConsultarRetiroController(listaAlumnos, listaCursos, listaMatriculas, listaRetiros);
					view.dispose();
					fr.run();
				} else {
					JOptionPane.showMessageDialog(view, "El retiro no existe");
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
        model.addColumn("Matricula");
        model.addColumn("Fecha");
        model.addColumn("Hora");
        for (Retiro r : this.listaRetiros) {
        	model.addRow(new Object[] {r.getNumRetiro(), r.getNumMatricula(), r.getFecha(), r.getHora()});
        }
        this.view.table.setModel(model);
	}
	private Retiro getRetiro(int cod) {
		for (Retiro r : listaRetiros) {
			if (r.getNumRetiro() == cod) {
				return r;
			}
		}	
		return null;
	}
	public Matricula getMatricula(int cod) {
		for (Matricula m : listaMatriculas) {
			if (m.getNumMatricula() == cod) {
				return m;
			}
		}	
		return null;
	}
	private Alumno getAlumno(int cod) {
		for (Alumno a : listaAlumnos) {
			if (a.getCodAlumno() == cod) {
				return a;
			}
		}
		return null;
	}
	private void deleteRetiro (Retiro r, Alumno a) {
		int index = 0;
		for (Retiro retiro : listaRetiros) {
			if (r.getNumRetiro() == r.getNumRetiro()) {
				break;
			}
			index++;
		}
		listaRetiros.remove(index);
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getCodAlumno() == a.getCodAlumno()) {
				alumno.setEstado(1);
			}
		}
	}
}
