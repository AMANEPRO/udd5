package tareas;
import javax.swing.JOptionPane;

public class tarea12 {
	public static void main (String []args) {
		String introducecontrase�a=JOptionPane.showInputDialog(null, "Introduce contrase�a ");
		
		if(introducecontrase�a=="contrase�a"){
			JOptionPane.showMessageDialog(null,"Bien, acertaste");
		}else {
			if(introducecontrase�a!="contrase�a") {
				JOptionPane.showMessageDialog(null,"Te has equivocado, vuelve a probar");
				String introducecontrase�a2=JOptionPane.showInputDialog(null, "Introduce Contrase�a (segundo intento)");
				if(introducecontrase�a2=="contrase�a") {
					JOptionPane.showMessageDialog(null,"Bien, acertaste");
				}else {
					if(introducecontrase�a2!="contrase�a") {
						JOptionPane.showMessageDialog(null,"Te has equivocado, vuelve a probar");
						String introducecontrase�a3=JOptionPane.showInputDialog(null, "Introduce Contrase�a (tercer intento)");
						if(introducecontrase�a3=="contrase�a") {
							System.out.println("Bien, acertaste");
						}else {
							if(introducecontrase�a3!="contrase�a") {
								JOptionPane.showMessageDialog(null, "Lo siento consumiste todos tus intentos");
								
							}
						}
					}
				
				}
			}
			
		}
	}
}