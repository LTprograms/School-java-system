package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Alumno;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenu;

public class AddAlumno extends JFrame {

	private JPanel contentPane;
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtEdad;
	public JTextField txtDni;
	public JTextField txtCelular;
	public JLabel lblCode;
	public JButton btnRegistrar;
	
	public JMenuItem addAlumno;
	public JMenuItem addCurso;
	public JMenuItem updateAlumno;
	public JMenuItem updateCurso;
	
	public JMenuItem addMatricula;
	public JMenuItem addRetiro;
	public JMenuItem updateMatricula;
	public JMenuItem updateRetiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAlumno frame = new AddAlumno();
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
	public AddAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel.setBounds(37, 49, 86, 14);
		contentPane.add(lblNewLabel);
		
		lblCode = new JLabel("2023" + (1000 + Alumno.getIndex()));
		lblCode.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCode.setBounds(131, 49, 86, 14);
		contentPane.add(lblCode);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNombres.setBounds(37, 92, 86, 14);
		contentPane.add(lblNombres);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(131, 89, 226, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblApellidos.setBounds(37, 130, 86, 14);
		contentPane.add(lblApellidos);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(131, 127, 226, 20);
		contentPane.add(txtApellido);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblEdad.setBounds(37, 168, 86, 14);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(131, 168, 70, 20);
		contentPane.add(txtEdad);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblDni.setBounds(210, 168, 86, 14);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(257, 165, 100, 20);
		contentPane.add(txtDni);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCelular.setBounds(37, 209, 86, 14);
		contentPane.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(131, 206, 113, 20);
		contentPane.add(txtCelular);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(267, 205, 89, 23);
		contentPane.add(btnRegistrar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 150, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_2 = new JMenu("Adicionar");
		mnNewMenu.add(mnNewMenu_2);
		
		addAlumno = new JMenuItem("Alumno");
		mnNewMenu_2.add(addAlumno);
		
		addCurso = new JMenuItem("Curso");
		mnNewMenu_2.add(addCurso);
		
		JMenu mnNewMenu_3 = new JMenu("Consultar");
		mnNewMenu.add(mnNewMenu_3);
		
		updateAlumno = new JMenuItem("Alumno");
		mnNewMenu_3.add(updateAlumno);
		
		updateCurso = new JMenuItem("Curso");
		mnNewMenu_3.add(updateCurso);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenu mnNewMenu_31 = new JMenu("Adicionar");
		mnRegistro.add(mnNewMenu_31);
		
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
		
	}
}
