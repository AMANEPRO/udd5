package tareas;
import javax.swing.JOptionPane;

public class tarea12 {
	public static void main (String []args) {
		String introducecontraseña=JOptionPane.showInputDialog(null, "Introduce contraseña ");
		
		if(introducecontraseña=="contraseña"){
			JOptionPane.showMessageDialog(null,"Bien, acertaste");
		}else {
			if(introducecontraseña!="contraseña") {
				JOptionPane.showMessageDialog(null,"Te has equivocado, vuelve a probar");
				String introducecontraseña2=JOptionPane.showInputDialog(null, "Introduce Contraseña (segundo intento)");
				if(introducecontraseña2=="contraseña") {
					JOptionPane.showMessageDialog(null,"Bien, acertaste");
				}else {
					if(introducecontraseña2!="contraseña") {
						JOptionPane.showMessageDialog(null,"Te has equivocado, vuelve a probar");
						String introducecontraseña3=JOptionPane.showInputDialog(null, "Introduce Contraseña (tercer intento)");
						if(introducecontraseña3=="contraseña") {
							System.out.println("Bien, acertaste");
						}else {
							if(introducecontraseña3!="contraseña") {
								JOptionPane.showMessageDialog(null, "Lo siento consumiste todos tus intentos");
								
							}
						}
					}
				
				}
			}
			
		}
	}
}