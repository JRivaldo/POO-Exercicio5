

public class Test {
	
	public static void main (String args[]){
		
		String valor = "rivaldotopete@hotmail.com";
		boolean b = "sahkdgas5%".matches("\\w*\\D\\d\\w*|\\w*\\d\\D\\w*");
		boolean c = valor.matches("\\w*@.*") && (valor.length() <= 50);
		
		
		System.out.println(b + " " + c);
		
	}

}
