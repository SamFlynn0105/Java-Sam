package sambank2;

public class contador extends funcionario {
	@Override
	public double getBon() {
		System.out.println("jecutando desde contador...");
		return 200;
	}

}
