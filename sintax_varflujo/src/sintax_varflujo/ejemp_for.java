package sintax_varflujo;

public class ejemp_for {
	public static void main(String[] args) {
		
		int ntm, multi;
		
		for(ntm=1;ntm<=10;ntm++) {
			
			for(multi=1;multi<=10;multi++) {
				int res=ntm*multi;
				System.out.println(ntm + " * " + multi + " = " + res);
			}
			System.out.println("-------------");
		}
	}

}
