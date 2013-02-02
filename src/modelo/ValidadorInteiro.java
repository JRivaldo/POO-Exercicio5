package modelo;

public class ValidadorInteiro implements ValidadorDeCampo {

	
	public boolean validar(String valor) {
			
			return valor.matches("\\d*") && valor.length() <= 8;
		}
}
