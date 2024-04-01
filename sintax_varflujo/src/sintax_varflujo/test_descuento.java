package sintax_varflujo;

public class test_descuento {

	    public static void main(String[] args) {

	    double valorCompra = 230.00, desc;
	        // ifs aqui
	    if(valorCompra>=100.00 && valorCompra<=199.99) {
	    	System.out.println("Costo:" + valorCompra);
	    	System.out.println("Descuento 10%");
	    	desc=valorCompra*.10;
	    	valorCompra=valorCompra-desc;
	    	System.out.println("Precio despues de descuento: " + valorCompra);
	    }
	    else if(valorCompra>=200.00 && valorCompra<=299.99) {
	    	System.out.println("Costo:" + valorCompra);
	    	System.out.println("Descuento 15%");
	    	desc=valorCompra*.15;
	    	valorCompra=valorCompra-desc;
	    	System.out.println("Precio despues de descuento: " + valorCompra);
	    }
	    else if(valorCompra>=300.00){
	    	System.out.println("Costo:" + valorCompra);
	    	System.out.println("Descuento 20%");
	    	desc=valorCompra*.20;
	    	valorCompra=valorCompra-desc;
	    	System.out.println("Precio despues de descuento: " + valorCompra);
	    }
	}

}
