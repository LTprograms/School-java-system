package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Consultas extends JFrame {

	private JPanel contentPane;
	public JTextField txtCode;
	public JLabel lbCode;
	public JLabel lbNombre;
	public JLabel lbApellido;
	public JLabel lbDni;
	public JLabel lbEdad;
	public JLabel lbCelular;
	public JLabel lbEstado;
	public JLabel lbCodeCurso;
	public JLabel lbAsignatura;
	public JLabel lbHoras;
	public JLabel lbCiclo;
	public JLabel lbCreditos;
	public JButton btnConsultar;
	
	public JMenuItem addAlumno;
	public JMenuItem addCurso;
	public JMenuItem updateAlumno;
	public JMenuItem updateCurso;
	
	public JMenuItem addMatricula;
	public JMenuItem addRetiro;
	public JMenuItem updateMatricula;
	public JMenuItem updateRetiro;
	
	public JMenuItem consultarMenu;
	
	public JMenuItem pendientes;
	public JMenuItem vigentes;
	public JMenuItem cursosMatriculas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultas frame = new Consultas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Consultas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 42, 67, 14);
		contentPane.add(lblNewLabel);
		
		txtCode = new JTextField();
		txtCode.setBounds(80, 39, 134, 20);
		contentPane.add(txtCode);
		txtCode.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(287, 38, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblAlumno = new JLabel("ALUMNO:");
		lblAlumno.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblAlumno.setBounds(90, 70, 67, 14);
		contentPane.add(lblAlumno);
		
		JLabel lblCursos = new JLabel("curso");
		lblCursos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCursos.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCursos.setBounds(265, 72, 67, 14);
		contentPane.add(lblCursos);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 119, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Codigo:");
		lblNewLabel_1_1.setBounds(10, 94, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellido:");
		lblNewLabel_1_2.setBounds(10, 144, 67, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("DNI:");
		lblNewLabel_1_2_1.setBounds(10, 169, 46, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Edad:");
		lblNewLabel_1_2_1_1.setBounds(10, 194, 46, 14);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Ceular:");
		lblNewLabel_1_2_1_1_1.setBounds(10, 219, 46, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("Estado:");
		lblNewLabel_1_2_1_1_1_1.setBounds(10, 244, 56, 14);
		contentPane.add(lblNewLabel_1_2_1_1_1_1);
		
		lbCode = new JLabel("");
		lbCode.setBounds(100, 94, 96, 14);
		contentPane.add(lbCode);
		
		lbNombre = new JLabel("");
		lbNombre.setBounds(100, 119, 96, 14);
		contentPane.add(lbNombre);
		
		lbApellido = new JLabel("");
		lbApellido.setBounds(100, 144, 96, 14);
		contentPane.add(lbApellido);
		
		lbDni = new JLabel("");
		lbDni.setBounds(100, 169, 96, 14);
		contentPane.add(lbDni);
		
		lbEdad = new JLabel("");
		lbEdad.setBounds(100, 194, 96, 14);
		contentPane.add(lbEdad);
		
		lbCelular = new JLabel("");
		lbCelular.setBounds(100, 219, 96, 14);
		contentPane.add(lbCelular);
		
		lbEstado = new JLabel("");
		lbEstado.setBounds(100, 244, 96, 14);
		contentPane.add(lbEstado);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo:");
		lblNewLabel_2.setBounds(233, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Asignatura:");
		lblNewLabel_2_1.setBounds(233, 119, 67, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ciclo:");
		lblNewLabel_2_1_1.setBounds(233, 144, 67, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Creditos:");
		lblNewLabel_2_1_1_1.setBounds(233, 169, 67, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Horas:");
		lblNewLabel_2_1_1_1_1.setBounds(233, 194, 67, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		lbCodeCurso = new JLabel("");
		lbCodeCurso.setBounds(328, 97, 96, 14);
		contentPane.add(lbCodeCurso);
		
		lbAsignatura = new JLabel("");
		lbAsignatura.setBounds(328, 119, 96, 14);
		contentPane.add(lbAsignatura);
		
		lbCiclo = new JLabel("");
		lbCiclo.setBounds(328, 144, 96, 14);
		contentPane.add(lbCiclo);
		
		lbCreditos = new JLabel("");
		lbCreditos.setBounds(328, 169, 96, 14);
		contentPane.add(lbCreditos);
		
		lbHoras = new JLabel("");
		lbHoras.setBounds(328, 194, 96, 14);
		contentPane.add(lbHoras);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Adicionar");
		mnNewMenu.add(mnNewMenu_1);
		
		addAlumno = new JMenuItem("Alumno");
		mnNewMenu_1.add(addAlumno);
		
		addCurso = new JMenuItem("Curso");
		mnNewMenu_1.add(addCurso);
		
		JMenu mnNewMenu_2 = new JMenu("Consultar");
		mnNewMenu.add(mnNewMenu_2);
		
		updateAlumno = new JMenuItem("Alumno");
		mnNewMenu_2.add(updateAlumno);
		
		updateCurso = new JMenuItem("Curso");
		mnNewMenu_2.add(updateCurso);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenu mnNewMenu_3 = new JMenu("Adicionar");
		mnRegistro.add(mnNewMenu_3);
		
		addMatricula = new JMenuItem("Matricula");
		mnNewMenu_3.add(addMatricula);
		
		addRetiro = new JMenuItem("Retiro");
		mnNewMenu_3.add(addRetiro);
		
		JMenu mnNewMenu_3_1 = new JMenu("Consultar");
		mnRegistro.add(mnNewMenu_3_1);
		
		updateMatricula = new JMenuItem("Matricula");
		mnNewMenu_3_1.add(updateMatricula);
		
		updateRetiro = new JMenuItem("Retiro");
		mnNewMenu_3_1.add(updateRetiro);
		
		JMenu mnNewMenu_4 = new JMenu("Consultar");
		menuBar.add(mnNewMenu_4);
		
		consultarMenu = new JMenuItem("Consultar");
		mnNewMenu_4.add(consultarMenu);
		
		JMenu mnNewMenu_5 = new JMenu("Reporte");
		menuBar.add(mnNewMenu_5);
		
		pendientes = new JMenuItem("Matriculas pendientes");
		mnNewMenu_5.add(pendientes);
		
		vigentes = new JMenuItem("Matriculas vigentes");
		mnNewMenu_5.add(vigentes);
		
		cursosMatriculas = new JMenuItem("Matriculas por curso");
		mnNewMenu_5.add(cursosMatriculas);
	}
}
