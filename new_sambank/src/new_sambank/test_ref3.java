package new_sambank;

public class test_ref3 {
	public static void main(String[] args) {
		Cuenta cuentaSam = new Cuenta();
		//Cliente cliente = new Cliente();
		cuentaSam.titular = new Cliente();
		cuentaSam.titular.nombre = "Zamuel";
		cuentaSam.titular.doc = "456123";
		
		System.out.println(cuentaSam.titular.nombre);
		System.out.println(cuentaSam.titular.doc);
	}

}
