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

public class ModificarAlumno extends JFrame {

	private JPanel contentPane;
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtEdad;
	public JTextField txtCelular;
	public JButton btnActualizar;
	public JLabel lbDni;
	public JLabel lbCode;
	
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
					ModificarAlumno frame = new ModificarAlumno();
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
	public ModificarAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel.setBounds(25, 59, 69, 14);
		contentPane.add(lblNewLabel);
		
		lbCode = new JLabel("Codigo:");
		lbCode.setFont(new Font("Stencil", Font.PLAIN, 14));
		lbCode.setBounds(114, 59, 121, 14);
		contentPane.add(lbCode);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblDni.setBounds(25, 91, 69, 14);
		contentPane.add(lblDni);
		
		lbDni = new JLabel("Codigo:");
		lbDni.setFont(new Font("Stencil", Font.PLAIN, 14));
		lbDni.setBounds(114, 91, 97, 14);
		contentPane.add(lbDni);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNombre.setBounds(25, 126, 77, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(114, 123, 274, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblApellidos.setBounds(25, 161, 85, 14);
		contentPane.add(lblApellidos);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(114, 158, 274, 20);
		contentPane.add(txtApellido);
		
		JLabel lblApellidos_1 = new JLabel("Edad:");
		lblApellidos_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblApellidos_1.setBounds(25, 202, 85, 14);
		contentPane.add(lblApellidos_1);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(114, 199, 85, 20);
		contentPane.add(txtEdad);
		
		JLabel lblApellidos_1_1 = new JLabel("Celular:");
		lblApellidos_1_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblApellidos_1_1.setBounds(211, 202, 85, 14);
		contentPane.add(lblApellidos_1_1);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(285, 199, 103, 20);
		contentPane.add(txtCelular);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(311, 59, 89, 23);
		contentPane.add(btnActualizar);
		
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
