package sambank2;

public class controlbonif {
	
	private double suma;
	
	public double regsal(funcionario funci) {
		this.suma = funci.getBon() + this.suma;
		System.out.println("calculo actual: " + this.suma);
		return this.suma;
	}
}
