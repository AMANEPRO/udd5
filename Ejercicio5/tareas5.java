package tareas;

import javax.swing.JOptionPane;

public class tareas5 {

	public static void main (String args []) {
		
	String numero1=JOptionPane.showInputDialog("Introduce un numero");
	
	float numero= Float.parseFloat(numero1);
		
		if (numero%2==0) {
			
			JOptionPane.showMessageDialog(null,"El numero es divisible entre 2");
		
		} else {
		
			JOptionPane.showMessageDialog(null,"El numero no es divisible entre 2");
		}
			
	}
}
