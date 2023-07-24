package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ModificarCurso extends JFrame {

	private JPanel contentPane;
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
	public JTextField txtAsignatura;
	public JTextField txtCiclo;
	public JTextField txtCreditos;
	public JTextField txtHoras;
	public JButton btnModificar;
	public JLabel lbCode;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarCurso frame = new ModificarCurso();
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
	public ModificarCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 61, 78, 14);
		contentPane.add(lblNewLabel);
		
		lbCode = new JLabel("Codigo:");
		lbCode.setFont(new Font("Stencil", Font.PLAIN, 14));
		lbCode.setBounds(128, 61, 98, 14);
		contentPane.add(lbCode);
		
		JLabel lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblAsignatura.setBounds(10, 105, 108, 14);
		contentPane.add(lblAsignatura);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(128, 102, 162, 20);
		contentPane.add(txtAsignatura);
		txtAsignatura.setColumns(10);
		
		JLabel lblCiclo = new JLabel("Ciclo:");
		lblCiclo.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCiclo.setBounds(10, 148, 108, 14);
		contentPane.add(lblCiclo);
		
		txtCiclo = new JTextField();
		txtCiclo.setColumns(10);
		txtCiclo.setBounds(128, 145, 162, 20);
		contentPane.add(txtCiclo);
		
		JLabel lblCreditos = new JLabel("Creditos:");
		lblCreditos.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCreditos.setBounds(10, 192, 108, 14);
		contentPane.add(lblCreditos);
		
		txtCreditos = new JTextField();
		txtCreditos.setColumns(10);
		txtCreditos.setBounds(128, 189, 162, 20);
		contentPane.add(txtCreditos);
		
		JLabel lblHoras = new JLabel("Horas");
		lblHoras.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblHoras.setBounds(10, 236, 108, 14);
		contentPane.add(lblHoras);
		
		txtHoras = new JTextField();
		txtHoras.setColumns(10);
		txtHoras.setBounds(128, 233, 162, 20);
		contentPane.add(txtHoras);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(335, 232, 89, 23);
		contentPane.add(btnModificar);
	}
}
