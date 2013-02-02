package modelo;

public class ValidadorSenha implements ValidadorDeCampo{

	
	public boolean validar(String valor) {
	
		return valor.matches("\\w*\\D\\d\\w*|\\w*\\d\\D\\w*") && (valor.length() >= 6 && valor.length() <= 8);
	}

}
