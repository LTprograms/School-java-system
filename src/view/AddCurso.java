package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddCurso extends JFrame {

	private JPanel contentPane;
	public JTextField txtCode;
	public JTextField txtAsignatura;
	public JTextField txtCiclo;
	public JTextField txtCreditos;
	public JTextField txtHoras;
	public JButton btnRegistrar; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCurso frame = new AddCurso();
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
	public AddCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo: ");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel.setBounds(40, 42, 72, 14);
		contentPane.add(lblNewLabel);
		
		txtCode = new JTextField();
		txtCode.setBounds(149, 39, 224, 20);
		contentPane.add(txtCode);
		txtCode.setColumns(10);
		
		JLabel lblAsignatura = new JLabel("Asignatura:");
		lblAsignatura.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblAsignatura.setBounds(40, 80, 99, 14);
		contentPane.add(lblAsignatura);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setColumns(10);
		txtAsignatura.setBounds(149, 77, 224, 20);
		contentPane.add(txtAsignatura);
		
		JLabel lblCiclo = new JLabel("Ciclo:");
		lblCiclo.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCiclo.setBounds(40, 116, 99, 14);
		contentPane.add(lblCiclo);
		
		txtCiclo = new JTextField();
		txtCiclo.setColumns(10);
		txtCiclo.setBounds(147, 113, 72, 20);
		contentPane.add(txtCiclo);
		
		JLabel lblCreditos = new JLabel("Creditos:");
		lblCreditos.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblCreditos.setBounds(229, 116, 99, 14);
		contentPane.add(lblCreditos);
		
		txtCreditos = new JTextField();
		txtCreditos.setColumns(10);
		txtCreditos.setBounds(308, 113, 65, 20);
		contentPane.add(txtCreditos);
		
		JLabel lblHoras = new JLabel("Horas");
		lblHoras.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblHoras.setBounds(40, 158, 99, 14);
		contentPane.add(lblHoras);
		
		txtHoras = new JTextField();
		txtHoras.setColumns(10);
		txtHoras.setBounds(149, 155, 118, 20);
		contentPane.add(txtHoras);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(277, 154, 89, 23);
		contentPane.add(btnRegistrar);
	}

}
