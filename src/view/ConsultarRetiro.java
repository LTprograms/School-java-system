package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConsultarRetiro extends JFrame {

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
	private JScrollPane scrollPane_1;
	public JTable table;
	private JLabel lblNewLabel_1;
	public JTextField txtCode;
	public JButton btnModificar;
	public JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRetiro frame = new ConsultarRetiro();
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
	public ConsultarRetiro() {
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
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 85, 414, 154);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		lblNewLabel_1 = new JLabel("Codigo:");
		lblNewLabel_1.setBounds(10, 46, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCode = new JTextField();
		txtCode.setBounds(59, 43, 130, 20);
		contentPane.add(txtCode);
		txtCode.setColumns(10);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(210, 42, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(321, 42, 89, 23);
		contentPane.add(btnEliminar);
	}

}
