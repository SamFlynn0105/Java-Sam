package sambank2;
//entidad cuenta
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total = 0;
	
	
	public Cuenta(int agencia) {
		
		if(agencia <= 0) {
			System.out.println("no se permite 0...");
			this.agencia =1;
		}
		else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("son " + total + " cuentas.");
	}
	
	public void deposito(double val){
		this.saldo += val;
		
	}
	
	public boolean retiro(double val) {
		if(this.saldo >= val) {
			this.saldo -= val;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfer(double val, Cuenta dest) {
		
		if(this.saldo >= val) {
			this.saldo -= val;
			//cuenta.saldo = cuenta.saldo - val;
			dest.deposito(val);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}

}
