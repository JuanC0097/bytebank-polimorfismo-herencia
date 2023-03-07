
public class TestReferencias {

	public static void main(String[] args) {
		
		/*
		 * elemento mas generico, puede ser adaptado al elemento mas especifico
		 * todos los gerentes son funcionario  PERO no todos los gerentes son funcionarios
		 */
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Juan");
		//no todos los funcionarios son gerentes
		Gerente gerente = new Gerente();
		gerente.setNombre("magali");
		
		//
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		/*
		 * Iniciar sesion
		 * Como funcionario: al tener una referencia al objeto FUncionario, el metodo autentificarInicio
		 * no existe en gerente y no es posible llamarlo
		 * 
		 * Como Gerente: Su referencia es la clase Gerente, el cual posee el metodo autentificarInicio
		 * 	EN ESTE CASO SI SE PUEDE LLAMAR	
		 * 
		 * funcionarioautentificarInicio(); NO COMPILA,POR SU REFERENCIA AL SER CREADO
		 * 
		 * SIEMPRE SERA LLAMADO EL METODO MAS ESPECIFICO
		 */
		gerente.autentificarSesion("askudf");
		
	}
	
}
