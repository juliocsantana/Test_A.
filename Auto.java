
public class Auto {

	private String Modelo;
	private String Marca;
	private String Color;
	protected int Precio;
	private int NumeroPuertas;
	


	public Auto(){
	}
	
	
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getPrecio() {
		return Precio;
	}
	public void setPrecio(int precio) {
		Precio = precio;
	}
		
	public int getNumeroPuertas() {
		return NumeroPuertas;
	}



	public void setNumeroPuertas(int numeroPuertas) {
		NumeroPuertas = numeroPuertas;
	}

	
	
	public double calcular(){
		float total= (float) (Precio +0);
		return total ;
	}
	
}
