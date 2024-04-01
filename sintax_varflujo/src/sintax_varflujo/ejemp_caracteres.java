package sintax_varflujo;

public class ejemp_caracteres {

	public static void main(String[] args) {
		char carac ='a';
		System.out.println(carac);
		
		carac =65;
		System.out.println(carac);
		
		carac =65+1;
		System.out.println(carac);
		
		carac =65+1;
		char segcarac= (char)(carac + 1);
		System.out.println(segcarac);
		
		String palabra = "hola que hace ";
		System.out.println(palabra);
		
		palabra = palabra +"2020";
		System.out.println(palabra);
		
	}
}
