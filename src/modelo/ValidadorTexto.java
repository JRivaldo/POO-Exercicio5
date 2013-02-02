package modelo;

public class ValidadorTexto implements ValidadorDeCampo {

	private int maxLength = 40;
	
	public ValidadorTexto(){}
	
	public ValidadorTexto(int max){
		this.maxLength = max;
	}
	
	public boolean validar(String valor) {
		if(valor == null || valor.length() == 0) return false;
		return valor.length() <= this.maxLength;
	}

}
