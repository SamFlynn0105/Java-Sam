package new_sambank;

public class tets_ref2 {
	public static void main(String[] args) {
		Cliente sam = new Cliente();
		sam.nombre = "samuel";
		sam.doc = "456456";
		sam.tel = "1234567891";
		
		Cuenta cuentaSam = new Cuenta();
		cuentaSam.agencia = 1;
		cuentaSam.titular = sam;
		System.out.println(cuentaSam.titular.doc);
		
	}

}
