package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ConsultarAlumnos extends JFrame {

	private JPanel contentPane;
	public JTextField txtCod;
	public JButton btnModificar;
	public JButton btnEliminar;
	public JTable table;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	public JMenuItem addAlumno;
	public JMenuItem addCurso;
	public JMenuItem updateAlumno;
	public JMenuItem updateCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarAlumnos frame = new ConsultarAlumnos();
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
	public ConsultarAlumnos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCod = new JTextField();
		txtCod.setBounds(88, 49, 135, 20);
		contentPane.add(txtCod);
		txtCod.setColumns(10);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(233, 48, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(335, 48, 89, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblNewLabel = new JLabel("DNI:");
		lblNewLabel.setBounds(34, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 77, 376, 153);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 163, 22);
		contentPane.add(menuBar);
		
		mnNewMenu = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu);
		
		mnNewMenu_2 = new JMenu("Adicionar");
		mnNewMenu.add(mnNewMenu_2);
		
		addAlumno = new JMenuItem("Alumno");
		mnNewMenu_2.add(addAlumno);
		
		addCurso = new JMenuItem("Curso");
		mnNewMenu_2.add(addCurso);
		
		mnNewMenu_3 = new JMenu("Consultar");
		mnNewMenu.add(mnNewMenu_3);
		
		updateAlumno = new JMenuItem("Alumno");
		mnNewMenu_3.add(updateAlumno);
		
		updateCurso = new JMenuItem("Curso");
		mnNewMenu_3.add(updateCurso);
		
		mnNewMenu_1 = new JMenu("Registro");
		menuBar.add(mnNewMenu_1);
	}
}
