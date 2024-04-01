package sambank2;

public class testcontrolbonif {
	public static void main(String[] args) {
		funcionario samy = new funcionario();
		samy.setSalario(2000);
		
		gerente jime = new gerente();
		jime.setSalario(10000);
		
		controlbonif controlbonif1 = new controlbonif();
		
		contador alex = new contador();
		alex.setSalario(5000);
		
		controlbonif1.regsal(samy);
		controlbonif1.regsal(jime);
		controlbonif1.regsal(alex);
		
	}

}
