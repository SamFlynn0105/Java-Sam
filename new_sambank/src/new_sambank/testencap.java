package new_sambank;

public class testencap {
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDoc("789567");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cuenta.getTitular().getNombre());
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getDoc());
	}

}
