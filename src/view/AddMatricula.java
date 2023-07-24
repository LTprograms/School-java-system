package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Matricula;

import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AddMatricula extends JFrame {

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
	
	private JLabel lblNewLabel;
	public JLabel lblDate;
	private JLabel lblHora;
	public JLabel lblHour;
	private JLabel lblCodigo;
	public JTextField txtAlumno;
	private JLabel lblCurso;
	public JTextField txtCurso;
	public JButton btnRegistrar;
	private JLabel lblCodigo_1;
	public JLabel lblCode;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMatricula frame = new AddMatricula();
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
	public AddMatricula() {
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
		
		lblNewLabel = new JLabel("FECHA:");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel.setBounds(35, 52, 67, 14);
		contentPane.add(lblNewLabel);
		
		LocalDate fechaActual = LocalDate.now();

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formatoFecha);
        
		lblDate = new JLabel(fechaFormateada);
		lblDate.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblDate.setBounds(132, 52, 89, 14);		
		contentPane.add(lblDate);
		
		lblHora = new JLabel("hORA:");
		lblHora.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblHora.setBounds(35, 93, 67, 14);
		contentPane.add(lblHora);
		
		LocalTime horaActual = LocalTime.now();

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormateada = horaActual.format(formatoHora);
        
		lblHour = new JLabel(horaFormateada);
		lblHour.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblHour.setBounds(132, 93, 67, 14);
		contentPane.add(lblHour);
		
		lblCodigo = new JLabel("Alumno:");
		lblCodigo.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCodigo.setBounds(35, 140, 67, 14);
		contentPane.add(lblCodigo);
		
		txtAlumno = new JTextField();
		txtAlumno.setBounds(132, 137, 128, 20);
		contentPane.add(txtAlumno);
		txtAlumno.setColumns(10);
		
		lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCurso.setBounds(35, 185, 67, 14);
		contentPane.add(lblCurso);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(132, 182, 128, 20);
		contentPane.add(txtCurso);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(311, 160, 89, 23);
		contentPane.add(btnRegistrar);
		
		lblCodigo_1 = new JLabel("Codigo:");
		lblCodigo_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCodigo_1.setBounds(271, 73, 67, 14);
		contentPane.add(lblCodigo_1);
		
		lblCode = new JLabel("" + 100000 + Matricula.getIndex());
		lblCode.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCode.setBounds(333, 73, 67, 14);
		contentPane.add(lblCode);
	}

}
