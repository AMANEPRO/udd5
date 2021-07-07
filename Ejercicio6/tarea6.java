package tareas;

import javax.swing.JOptionPane;

public class tarea6 {

	public static void main(String[] args) {
		
		String precio=JOptionPane.showInputDialog("Introduce el precio del producto");
		
		double precioreal=Double.parseDouble(precio);
		
		final double IVA=0.21;
		
		JOptionPane.showMessageDialog(null, "El precio incluido iva es de " + (precioreal*IVA));
	}

}
