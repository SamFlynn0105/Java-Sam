package new_sambank;

public class testacces {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
	    cuenta.setAgencia(-22);
		cuenta.deposito(200);
		cuenta.retiro(300);
		//cuenta.saldo -= 300;
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}

}
