package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	public JButton btnMantenimiento;
	public JButton btnRegistro;
	public JButton btnConsulta;
	public JButton btnReporte;
	
	public JMenuItem addAlumno;
	public JMenuItem addCurso;
	public JMenuItem updateAlumno;
	public JMenuItem updateCurso;
	public JMenuItem consultarAlumno;
	public JMenuItem consultarCurso;
	public JMenuItem eliminarAlumno;
	public JMenuItem eliminarCurso;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBounds(230, 11, 194, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Módulos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 182, 20);
		panel.add(lblNewLabel);
		
		this.btnMantenimiento = new JButton("Mantenimiento");
		btnMantenimiento.setBounds(48, 59, 117, 23);
		panel.add(btnMantenimiento);
		
		this.btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistro.setBounds(48, 108, 117, 23);
		panel.add(btnRegistro);
		
		this.btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(48, 156, 117, 23);
		panel.add(btnConsulta);
		
		this.btnReporte = new JButton("Reporte");
		btnReporte.setBounds(48, 205, 117, 23);
		panel.add(btnReporte);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRO");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(53, 41, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Y");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(53, 82, 131, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("MATRICULA");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(41, 120, 162, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DE");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1.setBounds(53, 164, 131, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("ALUMNOS");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2_1.setBounds(41, 211, 162, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 194, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Adicionar");
		mnNewMenu.add(mnNewMenu_1);
		
		addAlumno = new JMenuItem("Alumno");
		mnNewMenu_1.add(addAlumno);
		
		addCurso = new JMenuItem("Curso");
		mnNewMenu_1.add(addCurso);
		
		JMenu mnNewMenu_2 = new JMenu("Modificar");
		mnNewMenu.add(mnNewMenu_2);
		
		updateAlumno = new JMenuItem("Alumno");
		mnNewMenu_2.add(updateAlumno);
		
		updateCurso = new JMenuItem("Curso");
		mnNewMenu_2.add(updateCurso);
		
		JMenu mnNewMenu_3 = new JMenu("Consultar");
		mnNewMenu.add(mnNewMenu_3);
		
		consultarAlumno = new JMenuItem("Alumno");
		mnNewMenu_3.add(consultarAlumno);
		
		consultarCurso = new JMenuItem("Curso");
		mnNewMenu_3.add(consultarCurso);
		
		JMenu mnNewMenu_4 = new JMenu("Eliminar");
		mnNewMenu.add(mnNewMenu_4);
		
		eliminarAlumno = new JMenuItem("Alumno");
		mnNewMenu_4.add(eliminarAlumno);
		
		eliminarCurso = new JMenuItem("Curso");
		mnNewMenu_4.add(eliminarCurso);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenu mnNewMenu_1_1 = new JMenu("Adicionar");
		mnRegistro.add(mnNewMenu_1_1);
		
		JMenuItem mntmMatricula = new JMenuItem("Retiro");
		mnNewMenu_1_1.add(mntmMatricula);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Curso");
		mnNewMenu_1_1.add(mntmNewMenuItem_1_1);
		
		JMenu mnNewMenu_2_1 = new JMenu("Modificar");
		mnRegistro.add(mnNewMenu_2_1);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("Matricula");
		mnNewMenu_2_1.add(mntmNewMenuItem_2_1);
		
		JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("Retiro");
		mnNewMenu_2_1.add(mntmNewMenuItem_3_1);
		
		JMenu mnNewMenu_3_1 = new JMenu("Consultar");
		mnRegistro.add(mnNewMenu_3_1);
		
		JMenuItem mntmNewMenuItem_4_1 = new JMenuItem("Matricula");
		mnNewMenu_3_1.add(mntmNewMenuItem_4_1);
		
		JMenuItem mntmNewMenuItem_5_1 = new JMenuItem("Retiro");
		mnNewMenu_3_1.add(mntmNewMenuItem_5_1);
		
		JMenu mnNewMenu_4_1 = new JMenu("Eliminar");
		mnRegistro.add(mnNewMenu_4_1);
		
		JMenuItem mntmNewMenuItem_6_1 = new JMenuItem("Matricula");
		mnNewMenu_4_1.add(mntmNewMenuItem_6_1);
		
		JMenuItem mntmNewMenuItem_7_1 = new JMenuItem("Retiro");
		mnNewMenu_4_1.add(mntmNewMenuItem_7_1);
	}
}
