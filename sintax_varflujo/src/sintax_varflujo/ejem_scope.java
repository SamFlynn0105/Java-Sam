package sintax_varflujo;

public class ejem_scope {
	
	public static void main(String[] args) {
		//System.out.println("hola que tal");
		
		int edad = 21;
		int cantpers = 2;
		
		boolean espar=cantpers > 1;
		System.out.println("el valor: "+espar);
		if(edad >= 18 && espar) {
			System.out.println("puedes entrar...");
		}
		else {
			System.out.println("no estas autorizado..."+"a entrar");
		}
	}

}
