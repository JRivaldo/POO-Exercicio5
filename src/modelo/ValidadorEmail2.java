package modelo;

public class ValidadorEmail2 implements ValidadorDeCampo{

	
	public boolean validar(String valor) {
		
		return valor.matches("\\w*@.*") && (valor.length() <= 200);
	}


}
