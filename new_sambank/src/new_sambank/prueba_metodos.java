package new_sambank;

public class prueba_metodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
	    miCuenta.deposito(200);
	    
	    System.out.println(miCuenta.saldo);
	    
	    miCuenta.retiro(100);
	    System.out.println(miCuenta.saldo);
	    
	    Cuenta CuentaJim = new Cuenta();
	    CuentaJim.deposito(1000);
	    boolean Ptransfer = CuentaJim.transfer(400, miCuenta);
	    if(Ptransfer) {
	    	System.out.println("Transferencia Exitosa");
	    }
	    else {
	    	System.out.println("No se pudo...");
	    }
	    
	    System.out.println(CuentaJim.saldo);
	    System.out.println(miCuenta.saldo);
	}

}