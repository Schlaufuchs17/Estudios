package Controlador;

import java.awt.event.*;

import javax.swing.JOptionPane; /*Adrian C: Importar Java swing*/

import Vista.VentanaPrincipal;

public class ManejadorEventos implements ActionListener{
	
	private int error =0, contador =2;
	
	private VentanaPrincipal ventana;
	double suma = 0, resta = 0, division=0, multi=0, raiz2=0, raiz3=0;
	
	public ManejadorEventos(VentanaPrincipal ventana) {
		this.ventana = ventana;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		ventana.getCajaTexto1().requestFocus();
		
		if(e.getSource()== ventana.getSumar()) {
			boolean esnumero1 = true;
			boolean esnumero2 = true;
			for (int i = 0; i< ventana.getCajaTexto1().getText().length();i++) {
				if(!Character.isDigit(ventana.getCajaTexto1().getText().charAt(i))) {
					esnumero1 = false;
					
				}
			}
			if(esnumero1 == false) {
				JOptionPane.showMessageDialog(null, "Los datos: \n"+ventana.getCajaTexto1().getText()+ " \n son incorrectos", "Error", 0);
				ventana.getCajaTexto1().setText("");
				ventana.getCajaTexto1().requestFocus();
			}
			for(int x = 0; x<ventana.getCajaTexto2().getText().length();x++) {
				if(!Character.isDigit(ventana.getCajaTexto2().getText().charAt(x))) {
					esnumero2 = false;
				}
			}
			if(esnumero2 == false) {
				JOptionPane.showMessageDialog(null, "Los datos : \n"+ventana.getCajaTexto2().getText()+ " \n  son incorrectos", "Error", 0);
				ventana.getCajaTexto2().setText("");
				ventana.getCajaTexto2().requestFocus();
			}
			if(esnumero1 == true && esnumero2 == true && ventana.getCajaTexto1().getText().length()>0 && ventana.getCajaTexto2().getText().length() >0 ) {
				suma = Double.parseDouble(ventana.getCajaTexto1().getText()) + Double.parseDouble(ventana.getCajaTexto2().getText());
				
				ventana.getCajaTexto3().setText(Double.toString(suma));
			
			}
		}
		if(e.getSource()==ventana.getRestar()) {
			
			boolean esnumero3 = true;
			boolean esnumero4 = true;
			
			for (int i = 0; i< ventana.getCajaTexto1().getText().length();i++) {
				if(!Character.isDigit(ventana.getCajaTexto1().getText().charAt(i))) {
					esnumero3 = false;
					
				}
			}
			if(esnumero3 == false) {
				JOptionPane.showMessageDialog(null, "Los datos: \n"+ventana.getCajaTexto1().getText()+ " \n  son incorrectos", "Error", 0);
				ventana.getCajaTexto1().setText("");
				ventana.getCajaTexto1().requestFocus();
			}
			for(int x = 0; x<ventana.getCajaTexto2().getText().length();x++) {
				if(!Character.isDigit(ventana.getCajaTexto2().getText().charAt(x))) {
					esnumero4 = false;
				}
			}
			if(esnumero4 == false) {
				JOptionPane.showMessageDialog(null, "Los datos: \n"+ventana.getCajaTexto2().getText()+ " \n  son incorrectos", "Error", 0);
				ventana.getCajaTexto2().setText("");
				ventana.getCajaTexto2().requestFocus();
			}
			if(esnumero3 == true && esnumero4 == true && ventana.getCajaTexto1().getText().length()>0 && ventana.getCajaTexto2().getText().length() >0) {
				resta = Double.parseDouble(ventana.getCajaTexto1().getText()) - Double.parseDouble(ventana.getCajaTexto2().getText());
				
				ventana.getCajaTexto3().setText(Double.toString(resta));
			}
		
		}
		if(e.getSource()==ventana.getMultiplicar()) {
			
			boolean esnumero5 = true;
			boolean esnumero6 = true;
			
			for (int i = 0; i< ventana.getCajaTexto1().getText().length();i++) {
				if(!Character.isDigit(ventana.getCajaTexto1().getText().charAt(i))) {
					esnumero5 = false;
					
				}
			}
			if(esnumero5 == false) {
				JOptionPane.showMessageDialog(null, "Los datos: \n"+ventana.getCajaTexto1().getText()+ " \n  son incorrectos", "Error", 0);
				ventana.getCajaTexto1().setText("");
				ventana.getCajaTexto1().requestFocus();
			}
			for(int x = 0; x<ventana.getCajaTexto2().getText().length();x++) {
				if(!Character.isDigit(ventana.getCajaTexto2().getText().charAt(x))) {
					esnumero6 = false;
				}
			}
			if(esnumero6 == false) {
				JOptionPane.showMessageDialog(null, "Los datos: \n"+ventana.getCajaTexto2().getText()+ " \n  son incorrectos", "Error", 0);
				ventana.getCajaTexto2().setText("");
				ventana.getCajaTexto2().requestFocus();
			}
			if(esnumero5 == true && esnumero6 == true && ventana.getCajaTexto1().getText().length()>0 && ventana.getCajaTexto2().getText().length() >0) {
				multi = Double.parseDouble(ventana.getCajaTexto1().getText()) * Double.parseDouble(ventana.getCajaTexto2().getText());
				
				ventana.getCajaTexto3().setText(Double.toString(multi));
			}
			
		}
		if(e.getSource()==ventana.getDividir()) {
			
			boolean esnumero7 = true;
			boolean esnumero8 = true;
			
			for (int i = 0; i< ventana.getCajaTexto1().getText().length();i++) {
				if(!Character.isDigit(ventana.getCajaTexto1().getText().charAt(i))) {
					esnumero7 = false;
					
				}
			}
			if(esnumero7 == false) {
				JOptionPane.showMessageDialog(null, "Los datos: \n"+ventana.getCajaTexto1().getText()+ " \n  son incorrectos", "Error", 0);
				ventana.getCajaTexto1().setText("");
				ventana.getCajaTexto1().requestFocus();
			}
			for(int x = 0; x<ventana.getCajaTexto2().getText().length();x++) {
				if(!Character.isDigit(ventana.getCajaTexto2().getText().charAt(x))) {
					esnumero8 = false;
				}
			}
			if(esnumero8 == false) {
				JOptionPane.showMessageDialog(null, "Los datos: \n"+ventana.getCajaTexto2().getText()+ " \n  son incorrectos", "Error", 0);
				ventana.getCajaTexto2().setText("");
				ventana.getCajaTexto2().requestFocus();
			}
			if(esnumero7 == true && esnumero8 == true && ventana.getCajaTexto1().getText().length()>0 && ventana.getCajaTexto2().getText().length() >0) {
				division = Double.parseDouble(ventana.getCajaTexto1().getText()) / Double.parseDouble(ventana.getCajaTexto2().getText());
				
				ventana.getCajaTexto3().setText(Double.toString(division));
			}
		}
		if(e.getSource()==ventana.getRaiz2()) {
			String texto, texto2;
			texto = "Función no disponible.";
			texto2 ="Raiz Cuadrada";
			JOptionPane.showMessageDialog(null, texto, texto2, JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()==ventana.getRaiz3()) {
			String texto;
			texto = "Raiz Cubica";
			
			boolean esnumero9 = true;
			
			for (int i = 0; i< ventana.getCajaTexto1().getText().length();i++) { /*Adrian C: La contraseña no esta visible*/
				if(!Character.isDigit(ventana.getCajaTexto1().getText().charAt(i))) {
					esnumero9 = false;
					
				}
			}
			if(ventana.getCajaTexto1().getText().length() <1) {
				esnumero9 = false;
			}
			if(esnumero9 == false) {
				JOptionPane.showMessageDialog(null, "Los datos: \n"+ventana.getCajaTexto1().getText()+ " \n  son incorrectos", "Error", 0);
				ventana.getCajaTexto1().setText("");
				ventana.getCajaTexto1().requestFocus();
			}else {
				
				String password = JOptionPane.showInputDialog(null, "Contraseña: ", texto, 3);
				
				if(password.equals("abc" )){
					JOptionPane.showMessageDialog(null, "Contraseña correcta. \n Solo se realizará el número "+ ventana.getCajaTexto1().getText());
					raiz3 = Math.cbrt(Double.parseDouble(ventana.getCajaTexto1().getText()));
					ventana.getCajaTexto3().setText(Double.toString(raiz3));
				}else {
					JOptionPane.showMessageDialog(null, "Contraseña Incorrecta. \n Aún quedan: "+ (contador-error)+" intentos.", "Error", 0);
					error +=1;
					if(error == 3) {
						System.exit(0);
					}
				}
			}
		}

	}
}
