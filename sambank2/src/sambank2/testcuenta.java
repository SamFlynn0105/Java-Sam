package sambank2;

public class testcuenta {
	public static void main(String[] args) {
		cuentacorriente cc = new cuentacorriente(1);
		cuentahorro ca = new cuentahorro(2);
		
		cc.deposito(2000);
		cc.transfer(1000, ca);
		
		System.out.println(cc.getSaldo());
	    System.out.println(ca.getSaldo());
		
	}

}
