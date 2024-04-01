package sambank2;

public class cuentacorriente extends Cuenta {
	
	public cuentacorriente(int agencia) {
		super(agencia);
		
	}
	@Override
	public boolean retiro(double val) {
	    val+=0.2;
		return super.retiro(val);
	}
	

}
