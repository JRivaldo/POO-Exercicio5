package modelo;

import java.util.HashMap;
import java.util.Map;

public class Formulario {
	
	private Map<String,Campo> campos;
	
	public Formulario(){
		campos = new HashMap<String,Campo>();
	}
	
	public void addCampo(Campo campo){
		campos.put(campo.getId(), campo);
	}
	
	public boolean setValor(String campoId,String valor){
		Campo c = campos.get(campoId);
		c.setValor(valor);
		return c.validar();
	}

}
