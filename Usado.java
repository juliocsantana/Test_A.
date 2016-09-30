
public class Usado extends Auto{

	  Usado() {
		super();
		
	}

		public double calcular(){
			float total= (float) (Precio * .35);
			return Precio-total ;
		}
}
