package ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Campo;
import modelo.Formulario;
import modelo.ValidadorDeCampo;
import modelo.ValidadorEmail;
import modelo.ValidadorInteiro;
import modelo.ValidadorSenha;
import modelo.ValidadorTexto;

public class UsarFormulario {
	
	public static void mostrar(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static String entrada(String msg){
		String entr = JOptionPane.showInputDialog(msg);
		return entr;
	}
	
	public static void main(String args[]){
		
		Formulario form = new Formulario();
		Campo campo;
		boolean fim1 = false;
		String entr = "";
		String cancel = "";
		String valor = "";
		
		while(fim1 == false){
			entr = entrada("Formulário:\n\n1- Nome;\n2- Idade;\n3- E-mail;\n4- Senha;\n5- sair;");
			cancel = entr;
			
			if (cancel == null){
				fim1 = true;
				mostrar("Programa cancelado!");
				break;
			}
			else if(entr.equals("1")){
				ValidadorDeCampo nome = new ValidadorTexto();
				String id = "nome";
				String label = "Nome completo: ";
				campo = new Campo(id, label, nome);
				valor = entrada(label);
				campo.setValor(valor);
				form.addCampo(campo);
				mostrar("Validade do nome: " + form.setValor(id, valor));
				
			}
			else if(entr.equals("2")){
				ValidadorDeCampo idade = new ValidadorInteiro();
				String id = "idade";
				String label = "Idade: ";
				campo = new Campo(id, label, idade);
				valor = entrada(label);
				campo.setValor(valor);
				form.addCampo(campo);
				mostrar("Validade da idade: " + form.setValor(id, valor));
				
			}
			else if(entr.equals("3")){
				ValidadorDeCampo email = new ValidadorEmail();
				String id = "email";
				String label = "E-mail completo: ";
				campo = new Campo(id, label, email);
				valor = entrada(label);
				campo.setValor(valor);
				form.addCampo(campo);
				mostrar("Validade do e-mail: " + form.setValor(id, valor));
				
			}
			else if(entr.equals("4")){
				ValidadorDeCampo senha = new ValidadorSenha();
				String id = "senha";
				String label = "Senha: ";
				campo = new Campo(id, label, senha);
				valor = entrada(label);
				campo.setValor(valor);
				form.addCampo(campo);
				mostrar("Validade da senha: " + form.setValor(id, valor));
				
			}
			else if(entr.equals("5")){
				fim1 = true;
				mostrar("Programa finalizado!");
				
			}
			else{
				mostrar("Informe uma opção válida!");
			}
			
			
		}
		
	}

}
