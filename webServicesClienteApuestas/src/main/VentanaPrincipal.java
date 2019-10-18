package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import servicios.Apuesta;
import servicios.ServidorServicioApuestasProxy;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static String nombre = "";
	
	private JPanel contentPane;
	private JTextField campoCantidad;
	private JTextField campoNumero;
	private JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
					
					nombre = JOptionPane.
						showInputDialog("introduce tu nombre");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Aplicaion de Apuestas");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidad = new JLabel("CANTIDAD:");
		lblCantidad.setBounds(45, 35, 73, 14);
		contentPane.add(lblCantidad);
		
		campoCantidad = new JTextField();
		campoCantidad.setBounds(108, 32, 86, 20);
		contentPane.add(campoCantidad);
		campoCantidad.setColumns(10);
		
		JButton btnApostar = new JButton("APOSTAR");
		btnApostar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cantidad  = campoCantidad.getText();
				String numero = campoNumero.getText();
				double cantidadDouble = 0;
				int numeroInt = 0;
				try {
					cantidadDouble = 
							Double.parseDouble(cantidad);
					numeroInt = 
							Integer.parseInt(numero);
					System.out.println("mandar a servidor:");
					System.out.println("nombre: " +nombre);
					System.out.println("apuesta: " + 
							cantidadDouble);
					System.out.println("para el numero: " + 
							numeroInt);
					textArea.setText("mandando informacion al web service...");
					Apuesta a = new Apuesta(cantidadDouble, 
							false, nombre, numeroInt);
					ServidorServicioApuestasProxy proxy = 
							new ServidorServicioApuestasProxy();
					proxy.registrarApuesta(a);
					while(proxy.resolverApuestas()==-1) {
						Thread.sleep(1000);
					}
					Apuesta[] apuestas = proxy.obtenerApuestas();
					String texto = "";
					boolean ganado = false;
					for (Apuesta apuesta : apuestas) {
						texto = apuesta.getNombre() +
								" numero: " + 
								apuesta.getNumero()
								+ "\n";
						if(apuesta.getNombre().equals(nombre) && 
								apuesta.isGanado()) {
							ganado = true;
						}
					}
					textArea.setText(texto);
					if(ganado) {
						JOptionPane.showMessageDialog(
								VentanaPrincipal.this, 
								"Felicidades has ganado");
					}else {
						JOptionPane.showMessageDialog(
								VentanaPrincipal.this, 
								"Lo siento has perdido, "
								+ "numero ganador: " + 
									proxy.resolverApuestas());
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(
							VentanaPrincipal.this,
							"numero o cantidad incorrectos");
				}//end catch

				
			}
		});
		btnApostar.setBounds(352, 31, 89, 23);
		contentPane.add(btnApostar);
		
		campoNumero = new JTextField();
		campoNumero.setColumns(10);
		campoNumero.setBounds(256, 32, 86, 20);
		contentPane.add(campoNumero);
		
		JLabel lblNumero = new JLabel("NUMERO:");
		lblNumero.setBounds(204, 35, 73, 14);
		contentPane.add(lblNumero);
		
		
		textArea.setText("Bienvenido a la aplicacion de apuestas con web services");
		textArea.setBounds(10, 65, 459, 168);
		contentPane.add(textArea);
	}
}
