package tareas;

import javax.swing.JOptionPane;

public class tareas10 {

	public static void main(String[] args) {
		
		String objeto=JOptionPane.showInputDialog("Introduce que es lo que vas a vender");

		String cantidadventas=JOptionPane.showInputDialog("Introduce cuantas ventas van a realizarse");
		
		int numerodeventas=Integer.parseInt(cantidadventas);
		
		String dinerito=JOptionPane.showInputDialog("Introduce cuanto vale un/una/unos/unas " + objeto);
		
		Double precio= Double.parseDouble(dinerito);
		
		JOptionPane.showMessageDialog(null, "Si vendes " + numerodeventas + " " +objeto + " a " + precio+ ", deberias ganar " + (precio*numerodeventas + "euros."));
		
		
	}

}
