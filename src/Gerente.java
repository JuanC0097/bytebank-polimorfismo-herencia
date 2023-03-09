//Clase hija de funcionario
public class Gerente extends Funcionario {

	//1. Atributos
	private String contrasena;
	
	//2. Necesario solo set 	
	public void setContraseña( String contraseña) {
		
		this.contrasena = contraseña;
		
	}
	
	//Metodos
	//Autentificar Gerente.
	public boolean autentificarSesion(String contrasena) {
		
		if(this.contrasena == contrasena) {
			return true;
			
		}return false;
		
	}
	
	
	//Metodos
	
	/*
	 * Regla del negocio: El gerente obtiene una bonificacion del 100% del salario.
	 */
	@Override//Sobre escritura del metodo padre
	public double getBonificacion() {
		
		return super.getSalario() + super.getBonificacion();
	}
	
}
