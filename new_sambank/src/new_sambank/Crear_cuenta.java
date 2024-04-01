package new_sambank;

public class Crear_cuenta {
     public static void main(String[] args) {
    	Cuenta primCuen = new Cuenta();
    	primCuen.saldo = 1000;
    	System.out.print(primCuen.saldo);
    	
    	System.out.println();
    	
    	Cuenta segCuen = new Cuenta();
    	segCuen.saldo=2000;
    	System.out.println(segCuen.saldo);
    	
    	System.out.println(primCuen);
    	System.out.println(segCuen);
    	
	}
}
