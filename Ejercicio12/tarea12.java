package tareas;
import javax.swing.JOptionPane;

public class tarea12 {
	public static void main (String []args) {
		String introducecontraseņa=JOptionPane.showInputDialog(null, "Introduce contraseņa ");
		
		if(introducecontraseņa=="contraseņa"){
			JOptionPane.showMessageDialog(null,"Bien, acertaste");
		}else {
			if(introducecontraseņa!="contraseņa") {
				JOptionPane.showMessageDialog(null,"Te has equivocado, vuelve a probar");
				String introducecontraseņa2=JOptionPane.showInputDialog(null, "Introduce Contraseņa (segundo intento)");
				if(introducecontraseņa2=="contraseņa") {
					JOptionPane.showMessageDialog(null,"Bien, acertaste");
				}else {
					if(introducecontraseņa2!="contraseņa") {
						JOptionPane.showMessageDialog(null,"Te has equivocado, vuelve a probar");
						String introducecontraseņa3=JOptionPane.showInputDialog(null, "Introduce Contraseņa (tercer intento)");
						if(introducecontraseņa3=="contraseņa") {
							System.out.println("Bien, acertaste");
						}else {
							if(introducecontraseņa3!="contraseņa") {
								JOptionPane.showMessageDialog(null, "Lo siento consumiste todos tus intentos");
								
							}
						}
					}
				
				}
			}
			
		}
	}
}