package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String [] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return this.letras.length;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String out = "";
		for (int i = 0; i < letras.length; i++) {
			if (i != (letras.length - 1)) {
				out += letras[i] + ", ";
			}
			else {
				out += letras[i];
			}
		}
		return out;
	}
}
