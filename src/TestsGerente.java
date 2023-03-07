
public class TestsGerente {

	public static void main(String[] args) {
		
		//prueba bonificacion segun tipo
		//Funcionario gerente = new Funcionario();
		
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		System.out.println( "Salario: " + gerente.getSalario());
		System.out.println("Bonificacion: " + gerente.getBonificacion());
		System.out.println();	
		
		//Prueba metodo obtenerclave
		gerente.setContraseña("clave123");
		boolean ingresa = gerente.autentificarSesion("clave123"); 
		System.out.println(ingresa);
		
		
	}
}
