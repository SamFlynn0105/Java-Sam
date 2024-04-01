package sambank2;

public class testfuncionario {
	public static void main(String[] args) {
		
		funcionario samuel = new funcionario();
		samuel.setNombre("samuel");
		samuel.setDoc("321654");
		samuel.setSalario(2000);
		samuel.setTipo(0);
		
		System.out.println(samuel.getNombre());
		System.out.println(samuel.getDoc());
		System.out.println(samuel.getSalario());
		System.out.println(samuel.getBon());
	}

}
