package tareas;

public class tarea9 {

	public static void main (String[]Args) {
		
		int numero=1;
		while (numero<=100) {
			if (numero%2==0){
			System.out.println(numero);
			numero++;
			}else {
				if (numero%3==0) {
					System.out.println(numero);
					numero++;
				}else {
					numero++;
				}
			}

		}
		
	}
}