package modelo;

public class ValidadorEmail implements ValidadorDeCampo{

	private int tamMax;
	public ValidadorEmail(int tamMax){
		this.tamMax = tamMax;
	}
	
	public boolean validar(String valor) {
		
		return valor.matches("\\w*@.*") && (valor.length() <= this.tamMax);
	}

}
