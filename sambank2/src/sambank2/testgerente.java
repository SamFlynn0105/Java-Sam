package sambank2;

public class testgerente {
	public static void main(String[] args) {
		gerente gerente1 = new gerente();
		//gerente1.setSalario(5000);
		//funcionario gerente1 = new funcionario();
		gerente1.setNombre("Romualdo");
		gerente1.setDoc("123456");
		gerente1.setSalario(6000);
		gerente1.setTipo(1);
		//gerente1.setClave("cursossher");
		
		System.out.println(gerente1.getNombre());
		System.out.println(gerente1.getDoc());
		System.out.println(gerente1.getSalario());
		System.out.println(gerente1.getBon());
		System.out.println(gerente1.inises("cursoher"));
		
	}

}
