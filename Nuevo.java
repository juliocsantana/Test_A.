
public class Nuevo extends Auto{

	
	
	public Nuevo() {
		super();
		
	}
	
	
	
	public double calcular(){
		float total= (float) (Precio * .2275);
		float Descuento= (float) (Precio * .1225);
		return (Precio - Descuento) +total ;
	}
	
}
