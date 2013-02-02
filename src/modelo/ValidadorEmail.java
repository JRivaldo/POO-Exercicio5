package modelo;

public class ValidadorEmail implements ValidadorDeCampo{

	
	public boolean validar(String valor) {
		
		return valor.matches("\\w*@.*") && (valor.length() <= 50);
	}

}
