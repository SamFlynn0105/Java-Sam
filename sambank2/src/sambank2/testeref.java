package sambank2;

public class testeref {
	public static void main(String[] args) {
		
		funcionario Funci = new gerente();
		Funci.setNombre("Samy");
		
		gerente Geren = new gerente();
		Geren.setNombre("Jime");
		
		Funci.setSalario(2000);
		Geren.setSalario(10000);	
		
	}

}
