package sambank2;

public class gerente extends funcionario {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean inises(String clave) {
		return clave == "cursoher";
	}
	
	//sobreescritura de metodo
	public double getBon() {
		System.out.println("ejecutando desde gerente...");
		return super.getBon() + super.getSalario();	
	}
}
