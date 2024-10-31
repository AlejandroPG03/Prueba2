package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;

public class Usuarios_View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_Buscador;
	private JLabel lbl_Buscador;
	private JComboBox comboBox_AME;
	private JButton btn_Buscar;
	private JButton btn_Volver;
	private JButton btn_Guardar;
	private JLabel lbl_Nombre;
	private JTextField txt_Nombre;
	private JPanel panel;
	private JLabel lbl_Apellidos;
	private JTextField txt_Apellidos;
	private JLabel lbl_Tlf;
	private JTextField txt_tlf;
	private JLabel lbl_DNI;
	private JTextField txt_DNI;
	private JLabel lbl_FechaNaci;
	private JTextField txt_FechaNaci;
	private JLabel lbl_email;
	private JTextField txt_email;
	private JLabel lbl_Provincia;
	private JTextField txt_provincia;
	private JLabel lbl_Ciudad;
	private JTextField txt_Ciudad;
	private JLabel lbl_Calle_Avenida;
	private JTextField txt_calle;
	private JLabel lbl_Nº;
	private JTextField txt_Nº;
	private JComboBox comboBox_Bibliotecas;
	private JLabel lbl_JcomboBox_Bibliotecas;
	private JLabel lbl_FechaRegistro;
	private JTextField txt_FechaRegistro;
	private ButtonGroup botongrupo = new ButtonGroup();
	private JLabel lbl_Estado;
	private JRadioButton rdbtn_Activo;
	private JRadioButton rdbtn_Inactivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios_View frame = new Usuarios_View();
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
	public Usuarios_View() {
		setTitle("Socio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_Buscador = new JTextField();
		txt_Buscador.setBounds(10, 29, 450, 20);
		contentPane.add(txt_Buscador);
		txt_Buscador.setColumns(10);
		
		lbl_Buscador = new JLabel("Introduzca un DNI:");
		lbl_Buscador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_Buscador.setBounds(10, 11, 119, 14);
		contentPane.add(lbl_Buscador);
		
		comboBox_AME = new JComboBox();
		comboBox_AME.setModel(new DefaultComboBoxModel(new String[] {"Agregar", "Modificar"}));
		comboBox_AME.setBounds(470, 28, 86, 22);
		contentPane.add(comboBox_AME);
		
		btn_Buscar = new JButton("Buscar");
		btn_Buscar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Buscar.setBounds(581, 28, 119, 23);
		contentPane.add(btn_Buscar);
		
		panel = new JPanel();
		panel.setBounds(10, 60, 769, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lbl_Nombre = new JLabel("Nombre:");
		lbl_Nombre.setBounds(10, 11, 51, 14);
		panel.add(lbl_Nombre);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(10, 25, 194, 20);
		panel.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		lbl_Apellidos = new JLabel("Apellidos:");
		lbl_Apellidos.setBounds(10, 56, 51, 14);
		panel.add(lbl_Apellidos);
		
		txt_Apellidos = new JTextField();
		txt_Apellidos.setBounds(10, 77, 194, 20);
		panel.add(txt_Apellidos);
		txt_Apellidos.setColumns(10);
		
		lbl_Tlf = new JLabel("Telefonó:");
		lbl_Tlf.setBounds(10, 108, 194, 14);
		panel.add(lbl_Tlf);
		
		txt_tlf = new JTextField();
		txt_tlf.setBounds(10, 123, 194, 20);
		panel.add(txt_tlf);
		txt_tlf.setColumns(10);
		
		lbl_DNI = new JLabel("DNI/NIE:");
		lbl_DNI.setBounds(261, 11, 61, 14);
		panel.add(lbl_DNI);
		
		txt_DNI = new JTextField();
		txt_DNI.setBounds(261, 25, 194, 20);
		panel.add(txt_DNI);
		txt_DNI.setColumns(10);
		
		lbl_FechaNaci = new JLabel("Fecha de nacimiento:");
		lbl_FechaNaci.setBounds(261, 56, 194, 14);
		panel.add(lbl_FechaNaci);
		
		txt_FechaNaci = new JTextField();
		txt_FechaNaci.setBounds(261, 77, 194, 20);
		panel.add(txt_FechaNaci);
		txt_FechaNaci.setColumns(10);
		
		lbl_email = new JLabel("Email:");
		lbl_email.setBounds(543, 11, 98, 14);
		panel.add(lbl_email);
		
		txt_email = new JTextField();
		txt_email.setBounds(543, 25, 194, 20);
		panel.add(txt_email);
		txt_email.setColumns(10);
		
		lbl_Provincia = new JLabel("Provincia:");
		lbl_Provincia.setBounds(543, 56, 194, 14);
		panel.add(lbl_Provincia);
		
		txt_provincia = new JTextField();
		txt_provincia.setBounds(543, 77, 194, 20);
		panel.add(txt_provincia);
		txt_provincia.setColumns(10);
		
		lbl_Ciudad = new JLabel("Ciudad:");
		lbl_Ciudad.setBounds(543, 154, 194, 14);
		panel.add(lbl_Ciudad);
		
		txt_Ciudad = new JTextField();
		txt_Ciudad.setBounds(543, 168, 194, 20);
		panel.add(txt_Ciudad);
		txt_Ciudad.setColumns(10);
		
		lbl_Calle_Avenida = new JLabel("Calle/Avenida/Travesia...");
		lbl_Calle_Avenida.setBounds(543, 108, 194, 14);
		panel.add(lbl_Calle_Avenida);
		
		txt_calle = new JTextField();
		txt_calle.setBounds(543, 123, 194, 20);
		panel.add(txt_calle);
		txt_calle.setColumns(10);
		
		lbl_Nº = new JLabel("Nº :");
		lbl_Nº.setBounds(543, 200, 194, 14);
		panel.add(lbl_Nº);
		
		txt_Nº = new JTextField();
		txt_Nº.setBounds(543, 214, 194, 20);
		panel.add(txt_Nº);
		txt_Nº.setColumns(10);
		
		comboBox_Bibliotecas = new JComboBox();
		comboBox_Bibliotecas.setBounds(261, 122, 194, 22);
		panel.add(comboBox_Bibliotecas);
		
		lbl_JcomboBox_Bibliotecas = new JLabel("Biblioteca:");
		lbl_JcomboBox_Bibliotecas.setBounds(261, 108, 194, 14);
		panel.add(lbl_JcomboBox_Bibliotecas);
		
		lbl_FechaRegistro = new JLabel("Fecha Registro:");
		lbl_FechaRegistro.setBounds(10, 154, 194, 14);
		panel.add(lbl_FechaRegistro);
		
		txt_FechaRegistro = new JTextField();
		txt_FechaRegistro.setEditable(false);
		txt_FechaRegistro.setBounds(10, 168, 194, 20);
		panel.add(txt_FechaRegistro);
		txt_FechaRegistro.setColumns(10);
		
		lbl_Estado = new JLabel("Estado:");
		lbl_Estado.setBounds(261, 154, 113, 14);
		panel.add(lbl_Estado);
		
		rdbtn_Activo = new JRadioButton("Activo");
		rdbtn_Activo.setSelected(true);
		rdbtn_Activo.setBounds(290, 167, 151, 23);
		panel.add(rdbtn_Activo);	
		botongrupo.add(rdbtn_Activo);
		
		rdbtn_Inactivo = new JRadioButton("Baja");
		rdbtn_Inactivo.setBounds(290, 196, 165, 23);
		panel.add(rdbtn_Inactivo);
		botongrupo.add(rdbtn_Inactivo);
		
		btn_Volver = new JButton("Volver");
		btn_Volver.setBounds(20, 434, 89, 23);
		contentPane.add(btn_Volver);
		
		btn_Guardar = new JButton("Guardar");
		btn_Guardar.setBounds(690, 432, 89, 23);
		contentPane.add(btn_Guardar);
	}
}
