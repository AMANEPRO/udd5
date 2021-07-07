package tareas;

import javax.swing.JOptionPane;

public class tareas4 {

	public static void main(String[] args) {
		
		double areacirculo;
		
		final double pi=3.1456;
		
		String radio=JOptionPane.showInputDialog("Introduce el radio del circulo");
		
		double numeropocho=Double.parseDouble(radio);
		
		areacirculo=(pi*(Math.pow(numeropocho, 2)));
		
		JOptionPane.showMessageDialog(null,"El area del circulo es de " + areacirculo);

	}

}
