package tareas;

public class tareas8 {

	public static void main(String[] args) {
		for (int num=1; num<=100;) {
			if (num%2==0) {
			System.out.println(num);
			num++;
		}else {
			if (num%3==0) {
				System.out.println(num);
			num++;
				
			} else {
					if (num%2!=0) {
				num++;
					
					}else {
						if (num%3!=0) {
						num++;
						}

					}

				}
			}	
		}
	}
}