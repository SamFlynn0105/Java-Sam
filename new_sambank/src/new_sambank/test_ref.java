package new_sambank;

public class test_ref {
	public static void main(String[] args) {
		
		Cuenta primCuenta = new Cuenta();
		primCuenta.saldo = 200;
		
		//Cuenta segCuenta = primCuenta;
		Cuenta segCuenta = new Cuenta();
		segCuenta.saldo = 100;
		
		System.out.print("Saldo pc: " + primCuenta.saldo);
		System.out.println();		
		System.out.print("Saldo sc: " + segCuenta.saldo);
		
		segCuenta.saldo += 400;
		System.out.println();
		System.out.println("Saldo nuevo sc: " + segCuenta.saldo);
		
		System.out.println(primCuenta);
		System.out.println(segCuenta);
	}

}
