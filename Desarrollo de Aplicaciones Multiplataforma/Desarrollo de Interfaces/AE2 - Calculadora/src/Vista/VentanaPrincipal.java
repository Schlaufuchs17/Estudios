package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.ManejadorEventos;

public class VentanaPrincipal extends JFrame {

	private JLabel numero1, numero2, resultado;
	private JTextField cajaTexto1, cajaTexto2, cajaTexto3;
	private JButton sumar, restar, multiplicar, dividir, raiz2, raiz3;
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setSize(387, 570);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setTitle("Calculadora Miguel Borras, Adrian Caballero y Adrian Martin"); 
		setResizable(false);
		establecerComponenetes();
		setVisible(true);
	}
	
	public void establecerComponenetes() { 
		
		numero1 = new JLabel("Numero 1:");
		numero1.setBounds(17,45,150,25);
		getContentPane().add(numero1);
		
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(190,63,101,90);
		getContentPane().add(cajaTexto1);
		
		numero2 = new JLabel("Numero 2:");
		numero2.setBounds(10,145,200,40);
		getContentPane().add(numero2);
		
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(78,50,55,42);
		getContentPane().add(cajaTexto2);
		
		sumar = new JButton("Sumar");
		sumar.setBounds(87,14,20,21);
		getContentPane().add(sumar);
		
		restar = new JButton("Restar");
		restar.setBounds(60,55,31,99);
		getContentPane().add(restar);
		
		multiplicar = new JButton("Multiplicar");
		multiplicar.setBounds(32,66,85,16);
		getContentPane().add(multiplicar);
		
		dividir = new JButton("Dividir");
		dividir.setBounds(02,70,80,83);
		getContentPane().add(dividir);
		
		raiz2 = new JButton("Raiz2");
		raiz2.setBounds(177,158,123,198);
		getContentPane().add(raiz2);
		
		raiz3 = new JButton("Raiz3");
		raiz3.setBounds(305,504,740,98);
		getContentPane().add(raiz3);
		
		resultado = new JLabel("Resultado:");
		resultado.setBounds(124,117,480,671);
		getContentPane().add(resultado);
		
		cajaTexto3 = new JTextField();
		cajaTexto3.setBounds(250,160,354,18);
		getContentPane().add(cajaTexto3);
		 
	}
	

	public JTextField getCajaTexto1() {
		return cajaTexto1;
	}

	public JTextField getCajaTexto2() {
		return cajaTexto2;
	}

	public JTextField getCajaTexto3() {
		return cajaTexto3;
	}
	
	
	public JButton getSumar() {
		return sumar;
	}

	public JButton getRestar() {
		return restar;
	}

	public JButton getMultiplicar() {
		return multiplicar;
	}

	public JButton getDividir() {
		return dividir;
	}

	public JButton getRaiz2() {
		return raiz2;
	}

	public JButton getRaiz3() {
		return raiz3;
	}
	
	public void Manejador(ManejadorEventos gestor) {
		sumar.addActionListener(gestor);
		restar.addActionListener(gestor);
		multiplicar.addActionListener(gestor);
		dividir.addActionListener(gestor);
		raiz2.addActionListener(gestor);
		raiz3.addActionListener(gestor);
	}

}
