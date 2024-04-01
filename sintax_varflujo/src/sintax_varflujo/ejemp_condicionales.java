package sintax_varflujo;

public class ejemp_condicionales {
	
	public static void main(String[] args) {
		//System.out.println("hola que tal");
		
		int edad = 17;
		int cantida = 2;
		
		if(edad >= 18) {
			System.out.println("puedes entrar...");
		}
		else {
			if (cantida>=2) {
				System.out.println("usted es menor de edad"+"pero esta permitido su acceso");
			}
			System.out.println("no estas autorizado..."+"a entrar");
		}
	}

}
