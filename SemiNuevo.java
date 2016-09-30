
public class SemiNuevo extends Auto{

	
	private boolean Seguro;
	
	
	
	public SemiNuevo(boolean seg) {
		super();
	}



	public boolean Seguro() {
		if(Seguro=true){
			int TotalSeguro=25000;
			return Seguro;
		}else
			System.out.println("No se compro seguro");
		return Seguro;
		
	}



	public void setSeguro(boolean seguro) {
		Seguro = seguro;
	}
	
	

	
	
}
