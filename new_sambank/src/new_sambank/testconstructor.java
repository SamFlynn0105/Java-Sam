package new_sambank;

public class testconstructor {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(555);
		Cuenta cuenta2 = new Cuenta(333);
		Cuenta cuenta3 = new Cuenta(444);
		
		System.out.println(cuenta1.getAgencia());
		System.out.println(cuenta2.getAgencia());
		System.out.println(cuenta3.getAgencia());
		
		System.out.println(Cuenta.getTotal());
	}
}
