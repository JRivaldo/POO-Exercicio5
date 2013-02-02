package modelo;

public class Campo {
	
	private String id;
	private String label;
	private String valor;
	private ValidadorDeCampo validador;
	
	public Campo(String id, String label,ValidadorDeCampo validador){
		this.id = id;
		this.label = label;
		this.validador = validador;
	}
	
	public String getLabel(){
		return this.label;
	}
	public void setLabel(String label){
		this.label = label;
	}
	
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
	
	public String getValor(){
		return this.valor;
	}
	public void setValor(String valor){
		this.valor = valor;
	}
	
	public boolean validar(){
		return validador.validar(this.valor);
	}

}
